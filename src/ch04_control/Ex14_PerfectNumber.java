package ch04_control;



public class Ex14_PerfectNumber {

	public static void main(String[] args) {
		
		for (int i = 2; i <= 10000; i++){
//		    int divSum = 0;
//		    for(int k = 1; k < i; k++){             //1에서부터 자기자신 전까지
//		        if(i % k == 0)                      //약수의 합 구하기
//		            divSum += k;
//		    }
			int divSum = sumOfDivisors(i);
		    if ( i == divSum)           //자기 자신을 제외한 약수의 합과 자기자신이 같으면
		        System.out.println(i);
		}

     }
	
	 static int sumOfDivisors(int num) {
		int divSum = 0;
		for (int i = 1; i <= num; i++) {
			if(num % i == 0)
				divSum += i;
		}
		return 0;
	}
}
int a = 0000000000;