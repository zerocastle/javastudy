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

		for (int i = 0; i < count - 1 - index + 1; i++) {
			this.array[count - i] = array[count - 1 - i];
		}

		this.array[index] = value;

		count++;
		System.out.println("이동 횟수는 : " + (count - (index + 1)));
		this.showArray();

	}

	public void deleteIndex(int position) {
		// 1. 삭제할 원소를 0으로 설정
		array[position] = 0;
		// 2. 비어있는 원소의 뒤에서 끝까지 원소를 한칸씩 당긴다.
		// 앞에서 부터 이동시켜 준다.

		for (int i = 0; i < count - position - 1; i++) {
			array[position + i] = array[position + i + 1];
		}

		// array[position] = array[position+1]; //ex)3번째에 있는걸 2번에 넣어줘야하잖어
		// array[position] = array[position+2];
		// array[count -2] = array[count -1]; //5개라고 하면5번째 있는걸 4번째 넣는게 끝
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
