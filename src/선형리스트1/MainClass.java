package ��������Ʈ1;
//https://blog.naver.com/abcccccd/220489801495
import java.util.Arrays;

public class MainClass {

	private int[] array;
	private int max = 7;
	int count = 6;

	public MainClass() {
		// TODO Auto-generated constructor stub
		this.count = 6;
		this.array = new int[max];
		for (int i = 0; i < count; i++) {
			this.array[i] = i + 10;
		}
	}

	private void insertValue(int index, int value) {
		// TODO Auto-generated method stub

		for (int i = 0; i < count - 1 - index + 1; i++) {
			this.array[count - i] = array[count - 1 - i];
		}

		this.array[index] = value;

		count++;
		System.out.println("�̵� Ƚ���� : " + (count - (index + 1)));
		this.showArray();

	}

	public void deleteIndex(int position) {
		// 1. ������ ���Ҹ� 0���� ����
		array[position] = 0;
		// 2. ����ִ� ������ �ڿ��� ������ ���Ҹ� ��ĭ�� ����.
		// �տ��� ���� �̵����� �ش�.

		for (int i = 0; i < count - position - 1; i++) {
			array[position + i] = array[position + i + 1];
		}

		// array[position] = array[position+1]; //ex)3��°�� �ִ°� 2���� �־�������ݾ�
		// array[position] = array[position+2];
		// array[count -2] = array[count -1]; //5����� �ϸ�5��° �ִ°� 4��° �ִ°� ��
		this.showArray();
	}

	private void showArray() {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(this.array));

	}

	public static void main(String[] args) {
		MainClass obj = new MainClass();
		obj.insertValue(2, 70);
		obj.deleteIndex(1);
	}

}
