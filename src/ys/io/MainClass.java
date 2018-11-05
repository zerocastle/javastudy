package ys.io;
/*
 * ����Ʈ ������ ����� �Ҷ� ���δ�.
 * 
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass {

	public MainClass() {
		// TODO Auto-generated constructor stub
		// ���Ϸ� ���� ����Ʈ ������ �����и� �о���� �۾��� �ϴ�
		// Ŭ���� : FileInputStream

		FileInputStream fi;

		// ���Ϸ� ����Ʈ ������ �����и� �����ϴ� �۾��� �ϴ� Ŭ
		// Ŭ���� : FileOutputStream
		FileOutputStream fo;

		// ������ ���� ���� ��ü�� ����
		try {
			//���� �б�
			fi = new FileInputStream("c:\\input.txt");
			// ���Ͽ� ���� ���� ��ü�� ����
			fo = new FileOutputStream("c:\\output.txt");
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
