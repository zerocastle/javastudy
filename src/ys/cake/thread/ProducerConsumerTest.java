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
		while (isFull()) { // 버퍼에 상품이 이미 있을 경우
			try {
				wait(); // 생산자가 기다려야 한다.
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
		System.out.print("버퍼 : ");
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
			System.out.printf("생산자 : " + i + "번 상품을 생산");

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
			System.out.printf("소비자 : " + data + "번 상품을 소비");

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
