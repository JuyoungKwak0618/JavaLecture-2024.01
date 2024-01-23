package EX99_Message;

import java.time.LocalDate;
import java.util.Scanner;

import ch12_interface.sec12_bank_refactor.Account;
import ch12_interface.sec12_bank_refactor.AccountService;

public class MessageServiceArrayImpl implements MessageService {
	private static Message[] messageArray = new Message[10];
	private static Scanner sc = new Scanner(System.in);
	
	public MessageServiceArrayImpl() {
		LocalDate t = LocalDate.now();
		messageArray[0] = new Message(1000, "메세지 1번", "김찰일", t);
		messageArray[1] = new Message(1001, "메세지 2번", "김찰이", t);
		messageArray[2] = new Message(1002, "메세지 3번", "김찰삼", t);
		messageArray[3] = new Message(1003, "메세지 4번", "김찰사", t);
		messageArray[4] = new Message(1004, "메세지 5번", "김찰오", t);
	}

	@Override
	public Message findByMid(int mid) {
		System.out.println("-----------");
		System.out.println(" MID 생성");
		System.out.println("-----------");
		
		for(int i = 0; i <= messageArray.length; i++) {
			if(messageArray[i].getMid() == mid)
				return messageArray[i];
		}
			
		return null;
	}

	@Override
	public void messageList() {
		System.out.println("-----------");
		System.out.println("메세지 목록");
		System.out.println("-----------");
		Message ms = new Message();
		for(int i = 0; i < messageArray.length; i++) {
			ms.setWriter(messageArray[i].getWriter());
		}
			
		
			
	

	}
	
	@Override
	public void messageListByWriter(String writer) {
		Message ms = new Message();
		for (int i = 0; i < messageArray.length; i++) {
			if(messageArray[i].getWriter() == writer) {
				ms = messageArray[i];
				break;
			}
				
		}
	
		

	}
	public Message messageListByWriter() {
		return null;
	}
	

	@Override
	public void insertMessage(Message message) {
		

	}

	@Override
	public void updateMessage(Message message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteMessage(int mid) {
		System.out.println("-----------");
		System.out.println("   삭제");
		System.out.println("-----------");	

		System.out.print(" MID > ");
		 mid = Integer.parseInt(sc.nextLine());
		Message msg = findByMid(mid);
		msg.setIsDeleted(MessageService.DELETED);

	}

}
