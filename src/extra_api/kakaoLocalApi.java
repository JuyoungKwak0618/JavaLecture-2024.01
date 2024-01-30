package extra_api;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

/*
 * 도로명 주소로부터 위도(latitude), 경도(longitude) 정보를 구해주는 메소드
 */
public class kakaoLocalApi {

	public Map<String, Double> getGeocode(String addr) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("c:/Temp/roadApikey.txt"));
		String kakaoKey = br.readLine();
		br.close();
		String query = URLEncoder.encode(addr, "utf-8");
		String apiUrl = "https://dapi.kakao.com/v2/local/search/address.json"
						+"?query=" + query;
		
		URI uri = new URI(apiUrl);
		//Header setting
		HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(apiUrl))
                .header("Authorization", "KakaoAK " + kakaoKey) // API 키를 넣어주세요.
                .build();
		HttpResponse<String> response = java.net.http.HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		

	}
}
