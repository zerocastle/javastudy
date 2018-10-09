package ys.one;

public class MainClass2 {

	public MainClass2() {
		// TODO Auto-generated constructor stub
		int[][] array = new int[][] { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12, 78 } };
		int sale[][][] = new int[][][] { { { 63, 84, 140, 130 }, { 157, 209, 251, 312 } },
				{ { 59, 80, 130, 135 }, { 149, 187, 239, 310 } } };

		System.out.println(array.length);
		System.out.println(array[0].length);
		System.out.println(array[1].length);

		for (int i = 0; i < 2; i++) {
			if (i == 0) { 
				for (int j = 0; j < 6; j++) {
					System.out.printf("%d", array[i][j]);
				}
				System.out.println();
			} else
				for (int j = 0; j < 7; j++) {
					System.out.printf("%d", array[i][j]);
				}
		}
	}

	public static void main(String[] args) {
		new MainClass2();
	}

}
