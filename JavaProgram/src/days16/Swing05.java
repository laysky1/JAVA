package days16;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

//액션리스너를 사용하지 않고 버튼 자체에 존재하는 이벤트 메서드를 사용
class JButtonEvent extends JFrame{
	 JButtonEvent(){
		 ImageIcon korea = new ImageIcon("images/korea.gif");
		 ImageIcon germany = new ImageIcon("images/germany9060.gif");
		 ImageIcon usa = new ImageIcon("images/usa9060.gif");
		 
		 JButton eventButton = new JButton(korea);
		 
		 eventButton.setRolloverIcon(usa);
		 eventButton.setPressedIcon(germany);
		 
		 Container con =getContentPane();
		 con.setLayout(new FlowLayout());
		 con.add(eventButton);
		 setTitle("버튼 자체 이벤트 처리 실습");
		 setSize(500,400);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setVisible(true);
		 
	 }
}

public class Swing05 {

	public static void main(String[] args) {
		
		new JButtonEvent();

	}

}
