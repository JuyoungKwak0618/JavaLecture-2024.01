package ch18_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Ex02_InputStream {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("c:/Temp/test/README.txt");
//		is = new FileInputStream(new File("c:/Temp/test/README.txt"));
		
		// 읽는 방법 1
		while(true) {
			int data = is.read();
			if(data == -1)					//1바이트를 읽어서 정수형으로 반환
				break;						//마지막
			System.out.println((char)data);
		}
		// 읽는 방법 2
		is = new FileInputStream("c:/Temp/test/README.txt");
		byte[] arr = new byte[512];
		while(true) {
			int num = is.read(arr);
			System.out.println("읽은 바이트 수:" + num);
			if(num == -1)					//1바이트를 읽어서 정수형으로 반환
				break;		
		}
		System.out.println(new String(arr));
		is.close();
		

	}

}
