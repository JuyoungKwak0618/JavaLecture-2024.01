package ch06_class.sec05_Melonchart;

public class MelonchartArrayMain {

	public static void main(String[] args) {
		Melonchart[] meloncharts = new Melonchart[5];
		meloncharts[0] = new Melonchart(1, "비의 랩소디", "임재현", "비의 랩소디", "33,193");
		meloncharts[1] = new Melonchart(2, "TO.X", "태연", "To. X - The 5th Mini Album", "82,783");
		meloncharts[2] = new Melonchart(3, "Perfect Night", "르세라핌", "Perfect Night", "94,989");
		meloncharts[3] = new Melonchart(4, "Drama", "aespa", "Drama - The 4th Mini Album", "68,534");
		meloncharts[4] = new Melonchart(5, "에피소드", "이무진", "에피소드", "33,230");
		
		for(Melonchart melonchart : meloncharts)
		System.out.println(melonchart);
	}

}
