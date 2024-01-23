package ch12_interface.sec11_bank;

public interface AccountService {

	void createAccount(Account[] accountarray);
	
	void accountList(Account[] accountarray);
	
	void deposit(Account[] accountarray);
	
	void withdraw(Account[] accountarray);
	
	Account findAccount(String ano, Account[] accountarray);

}
