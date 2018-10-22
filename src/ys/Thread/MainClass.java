package ys.Thread;
/*
 * 1.Thread 클래스 상속 받아 클래스를 작성
 * 2.run 메소드 재정의
 * 3.Thread 객체 정의
 * 4.start()메소드 호출
 * 
 */

class MyTread extends Thread {
	// 2. run 메소드 재정의
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i + " " + getName());
		}
	}
}

// 11. Runnable 인터페이스를 구현한 클래스를 작성한다.
// 12. run 메소드 정의
// 13. Thread 객체를 생성하고 이때 , MyRunnable 객체를 인수로 던져준다,
// 14. Thread 객체의 start 메소드를 싱행한다.

class MyRunnable implements Runnable {

	// 11. Runnable 인터페이스를 구현한 클래스를 작성한다.
	// 12. run 메소드 정의
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			System.out.println(i + " "   );
		}

	}

}

public class MainClass {
	public MainClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// 3.Thread 객체 정의
//		MyTread t1 = new MyTread();
//		MyTread t2 = new MyTread();
//		t1.setName("t1");
//		t2.setName("t2");
//		t1.start();
//		t2.start();

		MyRunnable obj = new MyRunnable();
		// 13. Thread 객체를 생성하고 이때 , MyRunnable 객체를 인수로 던져준다,
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		t1.setName("t1");
		t2.setName("t2");
		// 14. Thread 객체의 start 메소드를 싱행한다.
		t1.start();
		t2.start();
	}

}
