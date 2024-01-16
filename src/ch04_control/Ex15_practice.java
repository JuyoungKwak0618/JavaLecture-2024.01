package ch04_control;

public class Ex15_practice {

	public static void main(String[] args) {
		// Q1.연습문제
		int score = 72;

		if (score >= 80 && score < 90) {
			System.out.println("B학점");
		} else if (score >= 90) {
			System.out.println("A학점");
		} else if (score >= 70 && score < 80) {
			System.out.println("C학점");
		} else {
			System.out.println("F학점");
		}

		// Q2.연습문제
		char grade;
		switch (score / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		default:
			grade = 'F';
		}
		System.out.println(grade + "학점");

		// Q3.연습문제
		for (int i = 0;; i++) {
			if (i == 11) {
				break;
			}
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
		int k = 10;
		while (k > 0) {

			k -= 2;
		
		System.out.println(k);
		}
	}
}

