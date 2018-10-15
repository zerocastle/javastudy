package ys.컬랙션;

import java.util.ArrayList;
import java.util.Iterator;

public class MainClass {
	
	public MainClass() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		//원소를 리스트 맨 끝에 삽입
		list.add("우유");
		list.add("빵");
		list.add("버터");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 인덱스 1에 사과 추가
		list.add(1, "사과");
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
		
		int index = list.indexOf("사과");
		System.out.println(index);
		
		
		list.add("사과");
		int lastIndex = list.lastIndexOf("사과");
		System.out.println(lastIndex);
		
		
	}

}
