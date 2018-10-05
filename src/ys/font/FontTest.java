package ys.font;

import java.awt.GraphicsEnvironment;

public class FontTest {
	// 그래픽스에 환경에 직역적 환경을 가지고 오기 getLocalGraphicsEnviroment()로 static 메소드로 존재한다.

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
