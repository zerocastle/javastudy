package ys.one;

public class MainClass {

	public MainClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int sale[] = new int[] { 157, 209, 251, 312 };

		for (int i = 0; i < sale.length; i++) {
			System.out.printf("%d/%dºÐ±â : sale[%d] = %d \n", (i + 1), sale.length, i, sale[i]);
		}
	}

}
