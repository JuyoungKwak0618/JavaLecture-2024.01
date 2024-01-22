package ch13_bankcopy;

import java.util.Scanner;

public class AccountMain {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		Accountimpl ac = new Accountimpl();
		boolean Execute = true;
		while(Execute) {
			System.out.println("+============+============+========+=========+========+");
			System.out.println("| 1.계좌생성 | 2.계좌목록 | 3.예금 | 4. 출금 | 5.종료 |");
			System.out.println("+============+============+========+=========+========+");
			System.out.print("선택> ");
			
		
		int num = Integer.parseInt(scanner.nextLine());
		switch(num)
		case 1 : CreateAccount(account);break;
		
		return false;
			
		}
		

	}

}
