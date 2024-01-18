package ch06_class.sec06_Bestseller;

import ch06_class.sec05_Melonchart.Melonchart;

public class BestsellerArrayMain {

	public static void main(String[] args) {
		Bestseller[] blss = new Bestseller[5];
		blss[0] = new Bestseller(1, "처음부터 시작하는 주식투자 단타전략", "홍인기" ," " , "길벗","18,900원");
		blss[1] = new Bestseller(2, "마흔에 읽는 쇼펜하우어", "강용수" , "","유노북스", "15,300원");
		blss[2] = new Bestseller(3, "세이노의 가르침", " 세이노", "", "데이원","6,480원" );
		blss[3] = new Bestseller(4, "이처럼 사소한 것들"," Claire Keegan", "홍한별", "다산책방", "12,420원");
		blss[4] = new Bestseller(5,"죽음이 물었다, 어떻게 살 거냐고", "한스 할터", " 한윤진", ": 포레스트북스", "16,020원");
		
		for(Bestseller bls : blss)
		System.out.println(bls);
	}

}
