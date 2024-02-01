package EX99_test;

public class test_1 {

	public static void main(String[] args) {
//		1-1) 1에서 100까지 3의 배수의 합을 구하세요.
		
		int sum = 0;
		int sum2 = 0;
		int sum3 = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
//		1-2) 1에서 20까지 홀수 제곱의 합을 구하세요.

		
		for(int k = 1; k <= 20; k += 2) {
			sum2 += k * k;
			
		}
		System.out.println(sum2);
		
		//1-4) 3)에서 만든 메소드를 이용하여 2에서부터 100까지 소수의 합을 구하세요.
		for(int num = 2; num <= 100; num++)
			if(isprime(num)) {
				sum3 += num;
			}
		System.out.println(sum3);
	}	


//		1-3) 어떤 수가 소수(prime number: 1과 자기자신만을 약수로 갖는 수, 예: 2, 3, 5 …)인가를
//		판단하는 메소드 Boolean isPrime(int num);를 만드세요.
		public static Boolean isprime(int num) {
			if (num < 2) {
				return false;
			}
			for (int i = 2; i < num; i++) {
				if (num % i == 0) 
					return false;
			}
			return true;
		}
	}
