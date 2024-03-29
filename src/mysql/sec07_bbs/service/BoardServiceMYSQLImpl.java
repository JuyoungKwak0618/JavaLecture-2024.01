package mysql.sec07_bbs.service;

import java.util.List;

import mysql.sec07_bbs.dao.BoardDao;
import mysql.sec07_bbs.dao.ReplyDao;
import mysql.sec07_bbs.entity.Board;
import mysql.sec07_bbs.entity.Reply;

public class BoardServiceMYSQLImpl implements BoardService {
	private String sessionUid = "james";		//james로 로그인 하였다고 가정
	private BoardDao bDao = new BoardDao();
	private ReplyDao rDao = new ReplyDao();
	
	@Override
	public List<Board> getBoardList(int page, String field, String query) {
		int offset = (page - 1) * COUNT_PER_PAGE;
		if(field == null || field.equals("")) {
			field = "title"; query = "%";
		}
		List<Board> list = bDao.getBoardList(field, query, COUNT_PER_PAGE, offset);
		return list;
	}

	@Override
	public Board getBoard(int bid) {
		Board board = bDao.getBoard(bid);
		if(!board.getUid().equals(sessionUid)) {
			bDao.increaseCount("view", bid);

		}
		List<Reply> list = rDao.getReplyList(bid);
		if(list.size() > 0) {
			board.setReplyList(list);
		}
		return board;
	}

	@Override
	public void insertBoard(Board board) {
		bDao.insertBoard(board);
		
	}

	@Override
	public void updateBoard(Board board) {
		bDao.updatetBoard(board);
		
	}

	@Override
	public void deletedBoard(int bid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		bDao.close();
		rDao.close();
	}

}
