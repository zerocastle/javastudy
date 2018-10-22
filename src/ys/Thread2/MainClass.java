package ys.Thread2;

class Counter {
	private int value = 0;

	public void increment() {
		value++;
	}

	public void decrement() {
		value--;
	}

	public void printCount() {
		// TODO Auto-generated method stub
		System.out.println(value);

	}
}
class MyTread extends Thread{
	Counter sharedCount;
	public MyTread(Counter c) {
		// TODO Auto-generated constructor stub
		this.sharedCount = c;
	}
	public void run() {
		for(int i = 0; i < 1000; i++) {
			sharedCount.increment();
			sharedCount.decrement();
		}
		sharedCount.printCount();
	}
}
public class MainClass {

	public MainClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Counter c = new Counter();
		MyTread t1 = new MyTread(c);
//		MyTread t2 = new MyTread(c);
		t1.start();
//		t2.start();
	}

}
