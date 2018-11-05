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
//		// 문자 단위 입력 클래스
//		try {
//			// 문자 단위 입출력 클래스
//			FileReader rf = new FileReader("input.txt");
//			// 버퍼를 이용한 클래스
//			BufferedReader br = new BufferedReader(rf);
//			// Scanner 객체 생성
//			s = new Scanner(br);
//			// 읽어 오면서 토큰 단위로 추출한다.
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
//							System.out.println("합계 : " + sum + " 평균: " + sum/3.0);
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
