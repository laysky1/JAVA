package days17;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

// 윈도우에 텍스트필드1, 버튼1, 버튼2, 텍스트필드2 o
// 순서로 배치합니다.
// 버튼 1 표면에는 ">" 글자표시, 버튼 2의 표면에는 "<"글자를 표시합니다. o
// 버튼 1을 클릭하면 텍스트필드1의 글자가 텍스트필드 2로 옮겨지게
// 버튼 2를 클릭하면 텍스트 필드2의 글자가 텍스트 필드 1로 옮겨지게
// 글자가 없는 상태에서 버튼을 클린하면 아무일도 안일어나게...
// 윈도 클래스 이름은 TextFeildEx로 제작해주세요o
// 윈도우의 가로 세로 크기는 적절히 조절해주세요o

class TextFieldEx extends JFrame implements ActionListener{
	
	JTextField t1;
	JTextField t2;
	
	TextFieldEx(){	
		
		 t1 = new JTextField(30);
		 JButton b1 = new JButton(">");
		 JButton b2 = new JButton("<");
		 t2 = new JTextField(30);
		
		 Container con=getContentPane();
		 con.setLayout(new FlowLayout());
	
		 con.add(t1);			con.add(b1);			con.add(b2);		con.add(t2);
		
		 b1.addActionListener(this);
		 b2.addActionListener(this);
		
		 setTitle("TextFeildEx");
		 setSize(800,100);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setVisible(true);
		}
		// 글자가 없는 상태에서 버튼을 클린하면 아무일도 안일어나게...
		@Override
	public void actionPerformed(ActionEvent e) {
		/*
		 String s=e.getActionCommand();
		 if(s.equals(">")){
		 	if(!(t1.getText().equals("")) ){
		 	String s2=t1.getText();
		 	t2.setText(s2);
		 	t1.setText("");
		 	}
		 	else{
		 	if(!(t2.getText().equals("")) ){
		 	String s2=t1.getText();
		 	t1.setText(s2);
		 	t2.setText("");
		 	}
		 */
			
			
		String s1=t1.getText();
		String s2=t2.getText();
		if(e.getActionCommand().equals(">")) {
			t2.setText(s1);
		}
		if(	e.getActionCommand().equals("<")) {
			t1.setText(s2);
		}
		if(!(e.getActionCommand().equals(">"))) {
		}
		if(!(e.getActionCommand().equals("<"))) {
		}
	}
}

public class Swing11 {

	public static void main(String[] args) {
		new TextFieldEx();

	}

}
