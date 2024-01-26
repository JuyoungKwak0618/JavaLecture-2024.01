package extra_crawling.sec02_Interpark_book;

import java.io.IOException;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		InterparkBookService interparkBookService = new InterparkBookService();
		List<InterparkBook> list = interparkBookService.getBestSeller();
		list.forEach(x -> System.out.println(x));
		
	}

}
