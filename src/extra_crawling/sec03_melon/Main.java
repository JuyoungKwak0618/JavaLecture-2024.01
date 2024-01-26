package extra_crawling.sec03_melon;

import java.io.IOException;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		MelonChartService melon = new MelonChartService();
		List<MelonChart> list = melon.getMelon();
		list.forEach(x -> System.out.println(x));
	}

}
