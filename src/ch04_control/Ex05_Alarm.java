package ch04_control;

import java.util.Scanner;

public class Ex05_Alarm {

	public static void main(String[] args) {
		// 알람 시계
		Scanner scan = new Scanner(System.in);
		System.out.print("시>");
		int hour = Integer.parseInt(scan.nextLine());
		System.out.print("분>");
		int minute = Integer.parseInt(scan.nextLine());
		scan.close();
		
		int newhour = 0;
		int newminute = 0;
		
		if(minute >= 45) {
			newhour = hour;
			newminute = minute - 45;
		}
		else {
			if(hour % 24 == 0) {
				newhour = 23;
				newminute = minute + 60 - 45;
			}else {
				newhour = hour - 1;
				newminute = minute + 60 - 45;
		}
	
	  }
		System.out.printf("%02d:%02d%n", newhour, newminute);
	
		// Refactoing
		newhour = hour; newminute = minute - 45;
		if(minute < 45) {
			newminute = minute + 60 -45;
			newhour = (hour % 24 == 0) ? 23 : hour - 1;
		}
		System.out.printf("%02d:%02d%n", newhour, newminute);
		
		
	}
}
int a = 0000000000;