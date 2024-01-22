package ch12_interface.sec03_mulitple;

import ch12_interface.sec02_interface.RemoteControllable;

public class Main {

	public static void main(String[] args) {
		RemoteControllable rc = new SmartTV();
		rc.turnOn(); rc.setVolume(5); rc.turnOff();
		
		Searchable sc = new SmartTV();
		sc.search("youtube");
		
		SmartTV stv = new SmartTV();
		stv.turnOn(); stv.setVolume(5); stv.search("naver"); stv.turnOff();

		sc = new Searchable() {

			@Override
			public void search(String url) {
				System.out.println("익명 구현체가 " + url + " 을/를 검색합니다");
				
			}
			
		};
		sc.search("kakao");
		
	}

}
