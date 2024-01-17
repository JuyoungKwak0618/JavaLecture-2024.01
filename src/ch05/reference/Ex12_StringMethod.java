package ch05.reference;

import java.util.Scanner;

public class Ex12_StringMethod {

	public static void main(String[] args) {
		String str1 = "Hello Java";
		String str2 = "안녕하세요? 반갑습니다.";
		
		// 스트링의 길이 - 속성이 아니라 메소드임
		System.out.println(str1.length() + "," + str2.length());
		
		// 문자열 검색 
		System.out.println(str2.charAt(0) + "," + str2.charAt(7));			//안, 반
		// 주민등록번호를 보고 남자인지, 여자인지 구별
		
		String ssn = "010624-4123456";
		char gender = ssn.charAt(7);
		switch(gender) {
		case '1' : case '3' :
			System.out.println("남자"); break;
		case '2' : case '4' :
			System.out.println("여자"); break;
		}
		

		
	}

}
