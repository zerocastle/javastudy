package ys.�÷���;
/*
 * LinkedList
 * 
 */

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class MainClass2 {

	public MainClass2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Milk");
		list.add("��");
		list.add("����");

		System.out.println("===���===");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		list.set(1, "�Һ���");
		System.out.println("===���===");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(1, "ȫ�浿");
		map.put(2, "������");
		
		String a = map.get(1);
		
		System.out.println(a);
		
		
	}

}
