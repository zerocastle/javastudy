package ys.font;

import java.awt.GraphicsEnvironment;

public class FontTest {
	// �׷��Ƚ��� ȯ�濡 ������ ȯ���� ������ ���� getLocalGraphicsEnviroment()�� static �޼ҵ�� �����Ѵ�.

	public FontTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String[] font_list = null;
		GraphicsEnvironment g;

		g = GraphicsEnvironment.getLocalGraphicsEnvironment();
		font_list = g.getAvailableFontFamilyNames();
		for (int i = 0; i < font_list.length; i++) {
			System.out.println(font_list[i]);
		}
	}

}
