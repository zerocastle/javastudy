//package ys.io3;
//
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.util.Scanner;
//
//class MyScanner {
//
//	public void print() {
//		// TODO Auto-generated method stub
//		Scanner s = null;
//		// ���� ���� �Է� Ŭ����
//		try {
//			// ���� ���� ����� Ŭ����
//			FileReader rf = new FileReader("input.txt");
//			// ���۸� �̿��� Ŭ����
//			BufferedReader br = new BufferedReader(rf);
//			// Scanner ��ü ����
//			s = new Scanner(br);
//			// �о� ���鼭 ��ū ������ �����Ѵ�.
//			boolean isFirst = true;
//			int sum = 0;
//			int count = 0;
//			while (s.hasNext()) {
//				// 
//				if (s.hasNextInt()) {
//					if(isFirst) {
//						System.out.printf(s.next());
//						isFirst = false;
//						count = 0;
//						sum = 0;
//					}else {
//						sum = sum + s.nextInt();
//						count ++;
//						if(count == 3) {
//							System.out.println("�հ� : " + sum + " ���: " + sum/3.0);
//							isFirst = true;
//						}
//					}
////					
//				}
//				else{
//					System.out.printf(" " + s.next() + " ");
//					
//				}
//			}
//			if (s != null) {
//				s.close();
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//}
//
//public class WDB {
//
//	public static void main(String[] args) {
//		MyScanner myScanner = new MyScanner();
//		myScanner.print();
//	}
//
//}
