package ys.�÷���;

import java.util.ArrayList;
import java.util.Iterator;

public class MainClass {
	
	public MainClass() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		//���Ҹ� ����Ʈ �� ���� ����
		list.add("����");
		list.add("��");
		list.add("����");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// �ε��� 1�� ��� �߰�
		list.add(1, "���");
		System.out.println(list.get(1));
		
		Iterator<String> iter = list.iterator();
		
		
		for(; iter.hasNext(); ) {
			
			System.out.println(iter.next());
		}
		System.out.println("===================================");
		
		list.remove(2);
		iter = list.iterator();
		while(iter.hasNext()) {
			
			System.out.println(iter.next());
		}
		System.out.println("===================================");
		for(String s : list) {
			System.out.println(s);
		}
		
		int index = list.indexOf("���");
		System.out.println(index);
		
		
		list.add("���");
		int lastIndex = list.lastIndexOf("���");
		System.out.println(lastIndex);
		
		
	}

}
