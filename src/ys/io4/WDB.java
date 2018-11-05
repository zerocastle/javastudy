package ys.io4;

import java.io.*;
import java.util.Date;

class BinaryFile{
	public void write() {
		//���̳ʸ� ������ �����Ͽ� �����͸� ����
		//���� �ڷ��� ������ ������ �����ϱ� ���� Ŭ����
		
		DataOutputStream dos = null;
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("output.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			dos = new DataOutputStream(bos);
			
			//���Ͽ� �������� ����
			dos.writeInt(100);
			//���Ͽ� �Ǽ����� ����
			dos.writeDouble(3.141592);
			//���ڿ��� ����
			dos.writeUTF("ȫ�浿");
			
			//���� ���Ͽ� ������ �����ֱ� ���� �޼ҵ�
			dos.flush();
			
			dos.close();
			
		} catch (IOException e) {
			
		}
	}
	
	public void read() {
		//���̳ʸ� ������ �о ȭ�鿡 ���
		//���� �ڷ��� ������ ������ �б��ϱ� ���� Ŭ����
		
		DataInputStream dis = null;
		FileInputStream fis;
		try {
			fis = new FileInputStream("output2.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
			
			//���Ͽ� �������� �о�´�.
			int a = dis.readInt();
			//���Ͽ� �Ǽ����� �о�´�.
			double b = dis.readDouble();
			//���ڿ��� �о�´�.
			String c = dis.readUTF();
			
			System.out.format("������ : %d �Ǽ��� : %f ���ڿ� %s", a,b,c);
			
			dis.close();
			
		} catch (IOException e) {
			
		}
	}
	
	public void serial() {
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;
		
		Date a = new Date();
		System.out.println(a);
		try {
			oos = new ObjectOutputStream(new FileOutputStream("object.dat"));
			oos.writeObject(a);
			oos.flush();
			oos.close();
			
			//10�� �Ŀ�
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				
			}
			ois = new ObjectInputStream(new FileInputStream("object.dat"));
			
			Date b = (Date)ois.readObject();
			System.out.println(b);
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		} catch (ClassNotFoundException e) {

		}
		
	}
}

public class WDB {

	public static void main(String[] args) {
		BinaryFile bf = new BinaryFile();
		bf.write();
		bf.read();
		bf.serial();
	}

}
