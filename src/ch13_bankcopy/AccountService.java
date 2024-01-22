package ch13_bankcopy;

import ch12_interface.sec11_bank.Account;

public interface AccountService {
	void CreateAccount(Account[] accountArray);
	
	void Accountlist(Account[] accountArray);
	
	void Deposit(Account[] accountArray);
	
	void Withdraw(Account[] accountArray);
	
	Account findAccount(String ano, Account[] accountArray);
}
