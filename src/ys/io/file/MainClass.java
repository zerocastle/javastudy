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
		// ���丮���� �˻�
		
		if(file.isDirectory()) {
			System.out.println(name + "�� ���丮 �Դϴ�.");
			// ���丮���� ���������� �о���� �޼ҵ� list
			String[] list = file.list();
//			System.out.println(Arrays.toString(list));
			for(String s : list) {
				File f = new File(name + "\\" + s);
				System.out.println("-----------------------------");
				System.out.println("�̸�: " + f.getName());
				System.out.println("���: " + f.getPath());
				System.out.println("�θ�: " + f.getParent());
				System.out.println("���丮 ����: " + f.isDirectory());
				System.out.println("���Ͽ���: " + f.isFile());
			}
		}else {
			System.out.println(name + "�� ���� �Դϴ�.");
		}
			
		
	}

}
