package ch10_oop.sec05_Account;

import java.util.Scanner;

public class BankApplication {
	private static Account2[] accountArray = new Account2[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int index = 0;


 	public static void main(String[] args) {
 		boolean run = true;
 		
 		while(run) {
 			System.out.println("--------------------------------------------------");
 			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
 			System.out.println("--------------------------------------------------");
 			System.out.print("선택 > ");
 			
 			int selectNo = Integer.parseInt(scanner.nextLine());
 			switch(selectNo) {
 			case 1:
 				createAccount(); break;
 			case 2:
 				accountList(); break;
 			case 3:
// 				deposit(); break;
 			case 4:
 //				withdraw(); break;
 			case 5:
 				run = false; break;
 			default:
 				System.out.println("waring: 1~5 사이의 숫자만 입력하세요.");
 			
 			}

 		}
 		System.out.println("프로그램 종료");	
 	}
 	//계좌 생성하기
 	private static void createAccount() {
 		
 		System.out.println("-----------");
 		System.out.println("계좌 생성");
 		System.out.println("-----------");
 		
 		String ano = "" + (1000 + index);
 			
 		System.out.println("계좌주 :");
 		String accountOwner = scanner.nextLine();
 		
 		System.out.println("초기입금액");
 		int accountprice = Integer.parseInt(scanner.nextLine());
 		Account2 account = new Account2(ano, accountOwner, accountprice);
 		
 		accountArray[index++] = account;
 		System.out.println("계좌가 생성되었습니다.");
 		
 		
 		
	//계좌목록보기
// 		private static void accountList() {
// 			
// 			System.out.println("-----------");
// 			System.out.println("계좌 목록");
// 			System.out.println("-----------");
// 			
// 			for(int i = 0; i < accountArray.length; i++) {
// 				
// 			}
// 				
// 			}
// 				
 			
 			
 		
//private static void deposit() {
//		
//	}
//private static void withdraw() {
//		
//	}
//private static  Account2 findAccount(String ano() {
//		return null;
//	}
// 		
 		



 		
 			
 			
 		
 		
 			
 	
 	
