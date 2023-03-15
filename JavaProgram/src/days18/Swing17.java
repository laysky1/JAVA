package days18;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class JRadioButtonTest extends JFrame implements ActionListener{
	
	JRadioButton jrb1;
	JRadioButton jrb2;
	JRadioButton jrb3;
	JRadioButton jrb4;
	JTextField jtf;
	
	ButtonGroup bg;	//라디오 버튼들의 그룹을 설정하기 위한 컨트롤
	
	JRadioButtonTest(){
		
		jrb1 = new JRadioButton("승마");
		jrb2 = new JRadioButton("골프");
		jrb3 = new JRadioButton("글라이딩");
		jrb4 = new JRadioButton("스쿠버");		
		bg= new ButtonGroup();
		jtf=new JTextField(30);
	
	
	Container con = getContentPane();
	con.setLayout(new FlowLayout());
	
	Font f=new Font("굴림",Font.BOLD,20);
	jrb1.setFont(f);		
	jrb2.setFont(f);	
	jrb3.setFont(f);	
	jrb4.setFont(f);
	jtf.setFont(f);
	
	bg.add(jrb1);
	bg.add(jrb2);
	bg.add(jrb3);
	bg.add(jrb4);
	
	con.add(jrb1);
	con.add(jrb2);
	con.add(jrb3);
	con.add(jrb4);
	con.add(jtf);
	
	jrb1.addActionListener(this);
	jrb2.addActionListener(this);
	jrb3.addActionListener(this);
	jrb4.addActionListener(this);
	
	setTitle("레디오박스 실습");
	setSize(700,150);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	
}
	@Override
	public void actionPerformed(ActionEvent e) {
		//라디오 버튼 하나가 클릭될때 마다 각 라디오버튼의 선택상황을 검사해서
		//XXXX가 선택되었습니다. 라는 메세지를 텍스트 필드에 넣으세요.
		
		String s="";
		jtf.setText("");
		/*
		if(jrb1.isSelected()==true)s=s+ jrb1.getActionCommand()+"가 선택되었습니다.";
		else if(jrb2.isSelected()==true)s=s+jrb2.getActionCommand()+"가 선택되었습니다.";
		else if(jrb3.isSelected()==true)s=s+jrb3.getActionCommand()+"가 선택되었습니다.";
		if(jrb4.isSelected()==true)s=s+jrb4.getActionCommand()+"가 선택되었습니다.";
		*/
		if(jrb1.isSelected())
			jtf.setText( jrb1.getActionCommand()+"이(가) 선택되었습니다.");
		else	if(jrb2.isSelected())
			jtf.setText( jrb2.getActionCommand()+"이(가) 선택되었습니다.");
		else	if(jrb3.isSelected())
			jtf.setText( jrb3.getActionCommand()+"이(가) 선택되었습니다.");
		else	
		jtf.setText( jrb4.getActionCommand()+"이(가) 선택되었습니다.");
		
		
	}
}


public class Swing17 {

	public static void main(String[] args) {
		new JRadioButtonTest();
	}

}
