package game;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	System.out.println("끝말잇기 게임을 시작합니다");
	System.out.print("게임에 참가하는 인원은 몇명입니까>>");
	Scanner sc = new Scanner(System.in);
	int Participant = sc.nextInt();
	
	String arr[] = new String[Participant];
	
	for(int i = 0; i < Participant; i++) {
		System.out.print("이름 입력>>");
		String name = sc.next();
		arr[i] = name;
	}
	String word = "기러기";
	System.out.println("첫 시작 단어는" + word);
	
	while(true) {
		for(int i = 0; i < arr.length; i++) {
			int lastIndex = word.length() -1;
			char lastChar = word.charAt(lastIndex);
			
			System.out.print(arr[i] + ">> ");
			String word_1 = sc.next();
			
			if(word_1.length() < 2) {
				System.out.println(arr[i] + "틀림" + arr[i] + "ㅋㅋ");
				System.exit(0);
			}
			
			if(word_1.charAt(0) != lastChar) {
				System.out.println(arr[i] + "틀림" + arr[i] + "ㅋㅋ");
				System.exit(0);
			}
			word = word_1;
		}
	}

	}


}
