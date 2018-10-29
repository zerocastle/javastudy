package ys.cake.thread;

import java.util.ArrayList;

class Buffer {
	private ArrayList<Integer> dataList;
	// private int data;
	// private boolean empty = true;

	private final int MAX = 3;
	private int pos = 0;

	public Buffer() {
		dataList = new ArrayList<Integer>();
		dataList.add(-1);
		dataList.add(-1);
		dataList.add(-1);
	}

	public boolean isEmpty() {
		if (pos == 0)
			return true;
		return false;
	}

	public boolean isFull() {
		if (pos == MAX)
			return true;
		return false;
	}

	public synchronized int get() {
//	      if(empty) {
//	         return -1;
//	      }
		while (isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		pos--;
		print();
		notifyAll();

		return dataList.get(pos);
	}

	public synchronized void put(int data) {
		while (isFull()) { // ���ۿ� ��ǰ�� �̹� ���� ���
			try {
				wait(); // �����ڰ� ��ٷ��� �Ѵ�.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		dataList.set(pos, data);
		pos++;
		// empty = false;
		print();
		notifyAll();
	}

	public void print() {
		System.out.print("���� : ");
		for (int i = 0; i < 3; i++) {
			if (i < pos) {
				System.out.printf(dataList.get(i) + " ");
			} else {
				System.out.printf(" ");
			}
		}
	}
}

class Producer implements Runnable {
	private Buffer buffer;

	public Producer(Buffer buffer) {
		this.buffer = buffer;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			buffer.put(i);
			System.out.printf("������ : " + i + "�� ��ǰ�� ����");

			try {
				Thread.sleep((long) (Math.random() * 100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Consumer implements Runnable {
	private Buffer buffer;

	public Consumer(Buffer buffer) {
		this.buffer = buffer;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			int data = buffer.get();
			System.out.printf("�Һ��� : " + data + "�� ��ǰ�� �Һ�");

			try {
				Thread.sleep((long) (Math.random() * 100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ProducerConsumerTest {

	public static void main(String[] args) {
		Buffer buffer = new Buffer();

		Thread t1 = new Thread(new Producer(buffer));
		Thread t2 = new Thread(new Consumer(buffer));
		t1.start();
		t2.start();
	}

}
