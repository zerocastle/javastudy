package ys.컬랙션;
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
		list.add("빵");
		list.add("버터");

		System.out.println("===출력===");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		list.set(1, "소보루");
		System.out.println("===출력===");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(1, "홍길동");
		map.put(2, "성춘향");
		
		String a = map.get(1);
		
		System.out.println(a);
		
		
	}

}
