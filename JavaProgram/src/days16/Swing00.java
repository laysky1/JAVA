package days16;

import javax.swing.JFrame;

class WindowsTest extends JFrame{
	
	WindowsTest(){
		setTitle("JAVA SWING TEST");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	//갖고있는 윈도우가 화면에 출현합니다.
	}
	
}


public class Swing00 {

	public static void main(String[] args) {
		
		WindowsTest abc = new WindowsTest();
		// 객체가 만들어집과 동시에 생성자 호출됩니다.

	}

}
