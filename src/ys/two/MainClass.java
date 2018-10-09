package ys.two;

public class MainClass {

	public MainClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int[][] array = new int[3][1];
		int counter = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = ++counter;
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 1; j++) {
				System.out.printf("%d", array[i][j]);
			}
			System.out.println("여기까지");
		}
	}

}
