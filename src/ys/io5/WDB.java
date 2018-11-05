package ys.io5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class WDB {

	public static void main(String[] args) {
		MyScanner myScanner = new MyScanner();
		myScanner.print();

	}
	
}

class MyScanner{
	public void print() {
		Scanner scan = null;
		
		try {
			//���ڴ��� �Է� Ŭ����
			FileReader rf = new FileReader("input.txt");
			//���۸� �̿��� Ŭ����
			BufferedReader br = new BufferedReader(rf);
			//Scanner ��ü ����
			scan = new Scanner(br);
			int total = 0;
			int numInt = 0;
			String s = null;
			
			//�о���鼭 ��� ������ �����Ѵ�.
			while(scan.hasNext()) {
				if(scan.hasNextInt()) {
					s = scan.next();
					numInt = Integer.parseInt(s);
					total = total + numInt;
					System.out.print(total);
				}else {
					System.out.println(scan.next());
				}
				
				//System.out.println(scan.next());	//next�� ��������� �������� nextLine�� �ٴ����� �����´�.
			}
			if(scan != null) {
				scan.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
