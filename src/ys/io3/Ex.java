//package ys.io3;
//
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.util.Scanner;
//
//public class Ex {
//
//   public void print()  {
//      Scanner scan = null;
//      int sum = 0;
//      int num = 0;
//      
//      //문자 단위 입력 클래스
//      try {
//         FileReader rf = new FileReader("d:\\input.txt");
//         
//         BufferedReader br = new BufferedReader(rf);
//         
//         scan = new Scanner(br);
//         
//         while(scan.hasNext()) {
//            if(scan.hasNextInt()) {
//               String s = scan.next();
//                  
//               if(Integer.parseInt(s) <= 100) {
//                  sum = sum + Integer.parseInt(s);
//                  num++;
//                  
//                  if(num == 3) {
//                     System.out.print("합 :" + sum);
//                     System.out.println(" 평균 :"+sum/num);
//                     sum = 0; num = 0;
//                  }
//               }else { System.out.print(s+" "); }   
//            }else { System.out.print(scan.next()+" ");}
//         }
//         if(scan != null) scan.close();
//      } catch (FileNotFoundException e) {
//         // TODO Auto-generated catch block
//         e.printStackTrace();
//      }
//   }
//}