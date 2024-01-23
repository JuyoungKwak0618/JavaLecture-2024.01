package EX99_Message;

public interface MessageService {
	int DELETED = 1;

	Message findByMid(int mid);

	void messageList();
	

	void messageListByWriter(String writer);
	
	Message messageListByWriter();

	void insertMessage(Message message);

	void updateMessage(Message message);

	void deleteMessage(int mid);
}
