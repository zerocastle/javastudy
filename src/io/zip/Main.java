package io.zip;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
	
	public Main() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		try {
			RandomAccessFile raf = new RandomAccessFile("d:\\random.bin","rw");
			raf.writeInt(10);
			raf.seek(4);
			raf.writeInt(2018001); // 학번
			raf.writeUTF("구라쟁이박준우"); //이름
			raf.writeInt(20); // 국어
			raf.writeInt(20);
			raf.writeInt(20);
			raf.seek(44);
			
			raf.writeInt(2018001); // 학번
			raf.writeUTF("뻥쟁이박준우");
			raf.writeInt(20); // 국어
			raf.writeInt(20);
			raf.writeInt(20);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
