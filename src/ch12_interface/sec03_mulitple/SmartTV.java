package ch12_interface.sec03_mulitple;

import ch12_interface.sec02_interface.RemoteControllable;

public class SmartTV implements RemoteControllable, Searchable {
	private int volume;

	@Override
	public void search(String url) {
		System.out.println("SmartTV가 " + url + "을/를 검색합니다.");

	}

	@Override
	public void turnOn() {
		System.out.println("smartTV를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("smartTV를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControllable.MAX_VOLUME)
			this.volume = RemoteControllable.MAX_VOLUME;
		else if (volume < RemoteControllable.MIN_VOLUME)
			this.volume = RemoteControllable.MIN_VOLUME;
		else
			this.volume = volume;
		System.out.println("현재 smartTV 볼륨:" + this.volume);
	}

}
