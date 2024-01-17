package ch05_reference;

import java.util.Arrays;

public class Ex99_practice {

	public static void main(String[] args) {
		// 연습문제
		/* 1. 1에서 1000사이에 0은 몇번,1은 몇번,...,9는 몇번 사용되었는가? */
		
		//1이 몇번 사용되었나
			String numStr = "";
//			for(int i = 1; i <= 1000; i++) {
//				numStr += String.valueOf(i);
//				}
//			System.out.println(numStr.length() - numStr.replace("1", "").length());
//			
		// count 배열을 만들어 일일이 체크
		int[] countArr = new int[10];
		for (int i = 1; i <= 1000; i++) {
			numStr += String.valueOf(i);
		}
		for (int i = 0; i < numStr.length(); i++) {
			int num = Integer.parseInt(String.valueOf(numStr.charAt(i)));
			countArr[num]++;
		}
		for (int i = 0; i < countArr.length; i++)	{
			System.out.println(i + ":" + countArr[i]);
	}
		 /* 2. 디지털 시계, 00:00 ~23:59
		 하루동안 3이 표시되는 시간은 몇초인가? */
			int displayTime = 0;
			for(int hour = 0; hour <= 23; hour ++) {
				for (int minute = 0; minute <= 59; minute++) {
					String clock = hour + ":" + minute;
					if(clock.indexOf('3') >= 0)
						displayTime += 60;
				}
			}
			System.out.println("하루동안 3이 표시되는 시간은" + displayTime + "초입니다.");
		
			
			
			
			
		/*	3. 두개의 세자리 수를 곱해서 나온 결과가 palindrome일때
			가장 큰 palindrome 수와 어떤 수를 곱해서 나온 결과인가? */
			
			int maxpal = 0, max1 = 0, max2 = 0;
			for(int i = 100; i <= 999; i++) {
				for(int k = 100; k <= 999; k++) {
					int mul = i * k;
					if(isPalindrome(String.valueOf(mul))) {
						if(mul > maxpal) {
							maxpal = mul; max1 = i; max2 = k;
						}
					}
				}
			}
		   System.out.println(max1 + "x" + max2 + "="+ maxpal);
	
	   /* 4, C:/Workspace/WebProject/03.JavaScript/ch07.표준내장객체/04.String연습.js
		  에서 파일명(04.string연습.js)만 출력하세요. */
		   
	     String root = "C:/Workspace/WebProject/03.JavaScript/ch07.표준내장객체/04.String연습.js";
		 
		 String[] rootArr = root.split("/");
		 
		System.out.println(rootArr[rootArr.length - 1]);
		
		int fileIndex = root.lastIndexOf('/');
		System.out.println(root.substring(fileIndex + 1));
		System.out.println(root.substring(root.indexOf('4')-1));
		 
	} 
	public static boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
   
	 
		}
	
}
