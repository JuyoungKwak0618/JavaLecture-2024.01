package ch18_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Ex08_BufferedReader {

	public static void main(String[] args) throws Exception {
		// 줄 단위로 읽을 수 있음
		BufferedReader br = new BufferedReader(new FileReader("c:/Temp/test/README.txt"));
		
		int lineNo = 1;
		while (true) {
			String line = br.readLine();
			if(line == null)
				break;
			System.out.println(lineNo + ":" +line);
			lineNo++;
		}
		br.close();

	}

}
