package ys.generic;

class Box<T>{
	private T data;
	public void set(T o) {
		data = o;
	}
	
	public T getData() {
		return data;
	}
}
class BoxInteger{
	private Integer data;
	void set(Integer o) {
		data = o;
	}
	
	public Integer getData() {
		return data;
	}
}

class BoxString{
	private String data;
	void set(String o) {
		data = o;
	}
	
	public String getData() {
		return data;
	}
}

 

public class MainClass {
	
	public MainClass() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Integer data = 10;
		Box box = new Box();
		box.set(data);
		Object o = box.getData();
		System.out.println(o);
		data = (Integer)box.getData();
//		String a = (String)box.getData(); �̷� ������ �����ϱ� ���Ͽ� ���δ� , �����ϱ������� ������ �߻����� �ʱ� �����̴� .
		System.out.println(box.getData());
		
		
		Box<Integer> bi = new Box<Integer>();
		Box<String> bs = new Box<String>();
		
		
		bi.set(11);
		bs.set("ȫ�浿");
		
		Integer i = bi.getData();
		String s = bs.getData();
		
	}
}
