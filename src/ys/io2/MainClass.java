package ys.io2;
/*
 * ���� ������ ����� �Ҷ� ���δ�.
 * 
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass {

	public MainClass() {
		// TODO Auto-generated constructor stub
		// ���Ϸ� ���� ����Ʈ ������ �����и� �о���� �۾��� �ϴ�
		// Ŭ���� : FileInputStream

		FileReader fi;

		// ���Ϸ� ����Ʈ ������ �����и� �����ϴ� �۾��� �ϴ� Ŭ
		// Ŭ���� : FileOutputStream
		FileWriter fo;

		// ������ ���� ���� ��ü�� ����
		try {
			//���� �б� , ���� ������ �д´�.
			fi = new FileReader("c:\\input.txt");
			// ���Ͽ� ���� ���� ��ü�� ���� , ���� ������ ���δ�.
			fo = new FileWriter("c:\\output.txt");
			//�� ����Ʈ �о �����ϴ� �ݺ�����
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
