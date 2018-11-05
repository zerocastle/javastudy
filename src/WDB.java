import java.io.*;

public class WDB {

	public static void main(String[] args) {
		//���Ϸκ��� ���� ������ �����͸� �о���� �۾��� �ϴ� 
		//Ŭ���� : FileReader
		FileReader fi;
		
		//���Ϸ� ���� ������ �����͸� �����ϴ� �۾��� �ϴ�
		//Ŭ���� : FileWriter
		FileWriter fo;
		
		try {
			//������ �б����� ��ü�� ����
			fi = new FileReader("D:\\input.txt");	//Ư�������̹Ƿ� \�ϳ��̸� �νĺҰ� �׷��� 2���� ����ؾ� ����
			
			//���Ͽ� �������� ��ü�� ����
			fo = new FileWriter("D:\\output.txt");
			
			//�� ����Ʈ �о �����ϴ� �ݺ�����
			int b;
			while((b = fi.read()) != -1) {	//������ ����Ʈ������ �дٰ� ������ ���� ���� -1�̴�.
				//�����ϴ°�
				fo.write(b);
				System.out.print((char)b + " ");
			}
			if(fi != null) {
				fi.close();
			}
			if(fo != null) {
				fo.close();
			}
		} catch (IOException e) {	//ioException�� FilenotFound�� �θ����̴�.
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
