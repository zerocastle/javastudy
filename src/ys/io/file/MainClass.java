package ys.io.file;

import java.io.File;
import java.util.Arrays;

public class MainClass {
	
	public MainClass() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		String name = "c:\\windows";
		
		File file = new File(name);
		// 디렉토리인지 검사
		
		if(file.isDirectory()) {
			System.out.println(name + "는 디렉토리 입니다.");
			// 디렉토리내의 파일정보를 읽어오는 메소드 list
			String[] list = file.list();
//			System.out.println(Arrays.toString(list));
			for(String s : list) {
				File f = new File(name + "\\" + s);
				System.out.println("-----------------------------");
				System.out.println("이름: " + f.getName());
				System.out.println("경로: " + f.getPath());
				System.out.println("부모: " + f.getParent());
				System.out.println("디렉토리 여부: " + f.isDirectory());
				System.out.println("파일여부: " + f.isFile());
			}
		}else {
			System.out.println(name + "는 파일 입니다.");
		}
			
		
	}

}
