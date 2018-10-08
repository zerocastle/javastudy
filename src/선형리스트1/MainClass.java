package 선형리스트1;

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

		for (int i = this.array.length - 1; i > index; i--) {
			this.array[i] = this.array[i - 1];
		}

		this.array[index] = value;
		count++;
		System.out.println("이동 횟수는 : " + (count - (index + 1)));
		this.showArray();

	}

	public void deleteIndex(int index) {
		// 1. 삭제할 원소를 0으로 설정
		this.array[index] = 0;
		for (int i = index; i < this.array.length - 1; i++) {
			this.array[i] = this.array[i + 1];
		}
		count--;
		this.array[this.array.length - 1] = 0;
		this.showArray();
		System.out.println("이동횟수는 : " + (count - index));
	}

	private void showArray() {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(this.array));

	}

	public static void main(String[] args) {
		MainClass obj = new MainClass();
		obj.insertValue(2, 70);
		obj.deleteIndex(2);
		obj.deleteIndex(3);
	}

}
