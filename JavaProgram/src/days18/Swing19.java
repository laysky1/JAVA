package days18;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class SwingEx extends JFrame implements ActionListener{
	
	JTextField name;
	
	JRadioButton jr1;
	JRadioButton jr2;
	
	JCheckBox jc1;
	JCheckBox jc2;
	JCheckBox jc3;
	JCheckBox jc4;
	
	JComboBox<String>jcb1;
	JTextField phone1;
	JTextField phone2;
	
	JComboBox<String>jcb2;
	
	
	SwingEx(){
		
		Font f =new Font("굴림",Font.BOLD,20);
		Container con= getContentPane();
		con.setLayout( new BorderLayout());
		
		JPanel jp1 =new JPanel();
		JPanel jp2 =new JPanel();
		
		jp1.setLayout(new GridLayout(6,1));
		jp2.setLayout(new GridLayout(6,1));
		
		JLabel jl1=new JLabel(" 성        명 : ");
		JLabel jl2=new JLabel(" 성        별 : ");
		JLabel jl3=new JLabel(" 취        미 : ");
		JLabel jl4=new JLabel(" 전 화 번 호 : ");
		JLabel jl5=new JLabel(" 거 주 지 역 : ");
		
		
		
		jl1.setFont(f);
		jl2.setFont(f);
		jl3.setFont(f);
		jl4.setFont(f);
		jl5.setFont(f);
		
		jp1.add(jl1);	jp1.add(jl2);	jp1.add(jl3);	jp1.add(jl4);	jp1.add(jl5);
	
		con.add(jp1,BorderLayout.WEST);
		
		JPanel jp21=new JPanel();
		JPanel jp22=new JPanel();
		JPanel jp23=new JPanel();
		JPanel jp24=new JPanel();
		JPanel jp25=new JPanel();
		JPanel jp26=new JPanel();
		
		jp21.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		jp22.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		jp23.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		jp24.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		jp25.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		jp26.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		
		name=new JTextField(10);
		name.setFont(f);
		jp21.add(name);
		jp2.add(jp21);
		
		ButtonGroup bg = new ButtonGroup();
		jr1=new JRadioButton("남성");
		jr2=new JRadioButton("여성");
		
		jr1.setFont(f);
		jr2.setFont(f);
		bg.add(jr1);		bg.add(jr2);	
		
		jp22.add(jr1);	jp22.add(jr2);
		jp2.add(jp22);
		
		
		jc1=new JCheckBox("스포츠");
		jc2=new JCheckBox("영화");
		jc3=new JCheckBox("독서");
		jc4=new JCheckBox("기타");
		
		jc1.setFont(f);	jc2.setFont(f);	jc3.setFont(f);		jc4.setFont(f);
		jp23.add(jc1);		jp23.add(jc2);		jp23.add(jc3);		jp23.add(jc4);
		jp2.add(jp23);
		
		jcb1=new JComboBox<String>();
		jcb1.addItem("010");
		jcb1.addItem("02");
		jcb1.addItem("032");
		jcb1.addItem("031");
		
		phone1=new JTextField(5);
		phone2=new JTextField(5);
	
		
		jcb1.setFont(f);
		phone1.setFont(f);
		phone2.setFont(f);
		
		jp24.add(jcb1);		
		jp24.add(new JLabel("-")).setFont(f);
		jp24.add(phone1);	 
		jp24.add(new JLabel("-")).setFont(f);
		jp24.add(phone2);
		jp2.add(jp24);
		
		jcb2=new JComboBox<String>();
		jcb2.addItem("서울");
		jcb2.addItem("인천");
		jcb2.addItem("경기도");
		jcb2.addItem("충청도");
		jcb2.addItem("강원도");
		
		
		jcb2.setFont(f);
		
		jp25.add(jcb2);
		jp2.add(jp25);
		
		JButton jb=new JButton("확인");
		jb.setFont(f);
		jp26.add(jb);
		jp2.add(jp26);
		
		jb.addActionListener(this);
		
		con.add(jp2,BorderLayout.CENTER);
		
		
		
		setTitle("구성  실습");
		setSize(700,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
	
		String s;
		System.out.println("성 명 : " + name.getText());
		
		if(jr1.isSelected())s ="남성";
		else s="여성";
		System.out.println("성 별 :"+s);
		
		s="";
		if(jc1.isSelected())s=s+jc1.getText()+" ";
		if(jc2.isSelected())s=s+jc2.getText()+" ";
		if(jc3.isSelected())s=s+jc3.getText()+" ";
		if(jc4.isSelected())s=s+jc4.getText()+" ";
		System.out.println("취 미 : "+s);
		
		s=(String)jcb1.getSelectedItem();
		s=s+"-"+phone1.getText();
		s=s+"-"+phone2.getText();
		
		System.out.println("전화번호 :"+s);
		System.out.println("거주지역 :"+jcb2.getSelectedItem());
	}
}

public class Swing19 {

	public static void main(String[] args) {
		new SwingEx();
		

	}

}
