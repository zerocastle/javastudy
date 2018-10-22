package ys.Thread;
/*
 * 1.Thread Ŭ���� ��� �޾� Ŭ������ �ۼ�
 * 2.run �޼ҵ� ������
 * 3.Thread ��ü ����
 * 4.start()�޼ҵ� ȣ��
 * 
 */

class MyTread extends Thread {
	// 2. run �޼ҵ� ������
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i + " " + getName());
		}
	}
}

// 11. Runnable �������̽��� ������ Ŭ������ �ۼ��Ѵ�.
// 12. run �޼ҵ� ����
// 13. Thread ��ü�� �����ϰ� �̶� , MyRunnable ��ü�� �μ��� �����ش�,
// 14. Thread ��ü�� start �޼ҵ带 �����Ѵ�.

class MyRunnable implements Runnable {

	// 11. Runnable �������̽��� ������ Ŭ������ �ۼ��Ѵ�.
	// 12. run �޼ҵ� ����
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
		// 3.Thread ��ü ����
//		MyTread t1 = new MyTread();
//		MyTread t2 = new MyTread();
//		t1.setName("t1");
//		t2.setName("t2");
//		t1.start();
//		t2.start();

		MyRunnable obj = new MyRunnable();
		// 13. Thread ��ü�� �����ϰ� �̶� , MyRunnable ��ü�� �μ��� �����ش�,
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		t1.setName("t1");
		t2.setName("t2");
		// 14. Thread ��ü�� start �޼ҵ带 �����Ѵ�.
		t1.start();
		t2.start();
	}

}
