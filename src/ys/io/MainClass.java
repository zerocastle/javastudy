package ys.io;
/*
 * 바이트 단위로 입출력 할때 쓰인다.
 * 
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass {

	public MainClass() {
		// TODO Auto-generated constructor stub
		// 파일로 부터 바이트 단위로 데이털르 읽어오는 작업을 하는
		// 클래스 : FileInputStream

		FileInputStream fi;

		// 파일로 바이트 단위로 데이털르 저장하는 작업을 하는 클
		// 클래스 : FileOutputStream
		FileOutputStream fo;

		// 파일을 읽이 위한 객체를 생성
		try {
			//파일 읽기
			fi = new FileInputStream("c:\\input.txt");
			// 파일에 쓰기 위한 객체를 생성
			fo = new FileOutputStream("c:\\output.txt");
			//한 바이트 읽어서 저장하는 반복구조
			int b;
			while((b=fi.read()) != -1) {
				fo.write(b);
				System.out.printf((char)b + " ");
			}
			if(fi != null)
				fi.close();
			if(fo != null)
				fo.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new MainClass();
	}

}
