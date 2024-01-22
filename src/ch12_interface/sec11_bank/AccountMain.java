package ch12_interface.sec11_bank;
import java.util.Scanner;


public class AccountMain {
	private static Account[] accountArray = new Account[100];
	private static Scanner scan = new Scanner(System.in);

	

	public static void main(String[] args) {
		AccountService ac = new AccountImpl();
		
		boolean run = true;
	
		while (run) {
			System.out.println("+============+============+========+=========+========+");
			System.out.println("| 1.계좌생성 | 2.계좌목록 | 3.예금 | 4. 출금 | 5.종료 |");
			System.out.println("+============+============+========+=========+========+");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scan.nextLine());
			switch(selectNo) {
			case 1:
				ac.createAccount(accountArray); break;
			case 2:
				ac.accountList(accountArray); break;
			case 3:
				ac.deposit(accountArray); break;
			case 4:
				ac.withdraw(accountArray); break;
			case 5:
				run = false; break;
			default:
				System.out.println("Warning: 1 ~ 5 사이의 숫자만 입력하세요.");
			}
		}
		System.out.println("프로그램 종료");
	}
}

