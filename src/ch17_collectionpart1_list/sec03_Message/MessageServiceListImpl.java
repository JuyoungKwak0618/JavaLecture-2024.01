package ch17_collectionpart1_list.sec03_Message;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MessageServiceListImpl implements MessageService{
	
	List<Message> list = new ArrayList<>();
	public MessageServiceListImpl() { 
		list.add(new Message(101, "자바 세계에 오신걸 환영합니다.", "제임스", LocalDateTime.now()));
		list.add(new Message(102, "안녕하세요? 반갑습니다.", "마리아", LocalDateTime.now()));
		list.add(new Message(103, "좋은 하루 되세요.", "브라이언", LocalDateTime.now()));
		list.add(new Message(104, "휴먼교육센터에서 강의를 들어보세요.", "엠마", LocalDateTime.now()));
		list.add(new Message(105, "스프링부트도 함께 배워요.", "제임스", LocalDateTime.now()));
	}

	
	@Override
	public Message findByMid(int mid) {
		
		return null;
	}

	@Override
	public List<Message> getMessageListAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Message> getMessageListByWriter(String writer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertMessage(Message message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateMessage(Message message) {
		
		
	}

	@Override
	public void deleteMessage(int mid) {
		Message message = null;
		for(Message msg : arraylist) {
			if(msg.getMid() == mid) {
				message = msg;
				break;
			
			}
		}
		arraylist.remove(mid);
	}

}
