package extra_crawling.sec03_melon;

import java.io.IOException;
import java.util.List;

public class Main {
	/*
	 * 크롤링 7단계
	 *		1. 사이트에 접속하고 HTML 데이터를 가져와 파싱	(String Url, doc)
	 *		2. 원하는 데이터 찾기(<li>, <tr>, ...)
	 *		3. 하나를 선택해서 원하는 정보 추출(연습 게임)
	 *		4. 반복문을 사용하여 페이지 내에 있는 데이터 가져오기
	 *		5. 오류가 발생하면 오류를 해결하고 2, 3, 4 과정을 반복
	 *		6. 모든 페이지에 대해 반복하기
	 *		7. CSV(Comma Separated Values) 파일로 만들기
	 */

	public static void main(String[] args) throws IOException {
		MelonChartService melon = new MelonChartService();
		List<MelonChart> list = melon.getMelon();
//		list.forEach(x -> System.out.println(x));
		
		for(int i =0; i < 10; i++) {
			 System.out.println(list.get(i));
			}
	}

}
