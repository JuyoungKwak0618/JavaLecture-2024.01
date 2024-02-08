package mysql.sec07_bbs.dao;

import java.util.List;

import mysql.sec07_bbs.entity.Board;

public class BoardDaoTest {

	public static void main(String[] args) {
		BoardDao bDao = new BoardDao();
		String sessionUid = "sarah";			// 사라가 로그인한 것으로 가정
		
		Board b = bDao.getBoard(11);			// 사라가 작성한 글이 아니면
		if(!b.getUid().equals(sessionUid)) {	
			bDao.increaseCount("view", 10);
		}
		
		System.out.println(b);
		
//		b = new Board("제목 7","본문 7","james");
//		bDao.insertBoard(b);
//		b = new Board("제목 8","본문 8","james");
//		bDao.insertBoard(b);
//		b = new Board("제목 9","본문 9","maria");
//		bDao.insertBoard(b);
//		b = new Board("제목 10","본문 10","sarah");
//		bDao.insertBoard(b);
//		b = new Board("제목 11","본문 11","brian");
//		bDao.insertBoard(b);
		
		List<Board> list = bDao.getBoardList("title", "%", 10, 0);
		list.forEach(x -> System.out.println(x.listFrom()));
		System.out.println("==============================================");
//		
//		list = bDao.getBoardList("b.uid", "james", 10, 0);
//		list.forEach(x -> System.out.println(x.listFrom()));
//		System.out.println("==============================================");
//		
//		list = bDao.getBoardList("uname", "마리아", 10, 0);
//		list.forEach(x -> System.out.println(x.listFrom()));
		
		
		bDao.close();
		
	}

}