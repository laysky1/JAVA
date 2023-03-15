package days17;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

//컨테이너의 레이아웃 : 5행1열의 GridLayout
//1행 : Jpanel p1 배치 ->p1에는 GridLayout으로 TextField 한개 배치
//2행 : Jpanel p2 배치 ->p2에는 GridLayout으로 버튼 네개 (7,8,9,+)
//3행 : Jpanel p3 배치 ->p3에는 GridLayout으로 버튼 네개 (4,5,6,-)
//4행 : Jpanel p4 배치 ->p4에는 GridLayout으로 버튼 네개 (1,2,3,X)
//5행 : Jpanel p5 배치 ->p5에는 GridLayout으로 버튼 네개 (C,0,=,÷)
class Calculator extends JFrame implements  ActionListener{
	
	JTextField jt;
	int firstNumber;
	int secondNumber;
	String operator="";
	int result1;
	double result2;
	
	
	Calculator(){
		
		Container con = getContentPane();
		Font f=new Font("굴림",Font.BOLD,20);//폰트객체 생성
		
		con.setLayout(new GridLayout(6,1));
		
		JPanel p0=new JPanel();
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JPanel p4=new JPanel();
		JPanel p5=new JPanel();
		
		p0.setLayout(new GridLayout(1,1));
		jt=new JTextField(15);
		jt.setText("0");
		jt.setFont(f);
		jt.setHorizontalAlignment(SwingConstants.RIGHT); //텍스트 필드 오른쪽 정렬
		jt.setEditable(false);
		p0.add(jt);
		con.add(p0);
		
		p1.setLayout(new GridLayout(1,4));
		
		 JButton bb = new JButton("<-");
		 JButton b10 = new JButton("sqr");
		 JButton b11 = new JButton("1/x");
		 JButton b12 = new JButton("");
		 bb.setFont(f);
		 b10.setFont(f);
		 b11.setFont(f);
		 b12.setFont(f);
		 p1.add(bb);
		 p1.add(b10);
		 p1.add(b11);
		 p1.add(b12);
		 con.add(p1);
		
		
		
		p2.setLayout(new GridLayout(1,4));
		
		 JButton b7 = new JButton("7");
		 JButton b8 = new JButton("8");
		 JButton b9 = new JButton("9");
		 JButton bplus = new JButton("+");
		 b7.setFont(f);
		 b8.setFont(f);
		 b9.setFont(f);
		 bplus.setFont(f);
		 p2.add(b7);
		 p2.add(b8);
		 p2.add(b9);
		 p2.add(bplus);
		 con.add(p2);
		 
		p3.setLayout(new GridLayout(1,4));
		 JButton b4 = new JButton("4");
		 JButton b5 = new JButton("5");
		 JButton b6 = new JButton("6");
		 JButton bminus = new JButton("-");
		 b4.setFont(f);
		 b5.setFont(f);
		 b6.setFont(f);
		 bminus.setFont(f);
		 p3.add(b4);
		 p3.add(b5);
		 p3.add(b6);
		 p3.add(bminus);
		 con.add(p3);
		 
		p4.setLayout(new GridLayout(1,4));
		 JButton b3 = new JButton("1");
		 JButton b2 = new JButton("2");
		 JButton b1 = new JButton("3");
		 JButton bmulti = new JButton("x");
		 b3.setFont(f);
		 b2.setFont(f);
		 b1.setFont(f);
		 bmulti.setFont(f);
		 p4.add(b3);
		 p4.add(b2);
		 p4.add(b1);
		 p4.add(bmulti);
		 con.add(p4);
		p5.setLayout(new GridLayout(1,4));
		 JButton bc = new JButton("C");
		 JButton b0 = new JButton("0");
		 JButton be = new JButton("=");
		 JButton bdiv = new JButton("÷");
		 bc.setFont(f);
		 b0.setFont(f);
		 be.setFont(f);
		 bdiv.setFont(f);
		 p5.add(bc);
		 p5.add(b0);
		 p5.add(be);
		 p5.add(bdiv);
		 con.add(p5);
		 
		 b1.addActionListener(this);
		 b2.addActionListener(this);
		 b3.addActionListener(this);
		 b4.addActionListener(this);
		 b5.addActionListener(this);
		 b6.addActionListener(this);
		 b7.addActionListener(this);
		 b8.addActionListener(this);
		 b9.addActionListener(this);
		 b0.addActionListener(this);
		 bplus.addActionListener(this);
		 bminus.addActionListener(this);
		 bmulti.addActionListener(this);
		 bdiv.addActionListener(this);
		 bc.addActionListener(this);
		 be.addActionListener(this);
		 bb.addActionListener(this);
		 b10.addActionListener(this);
		 b11.addActionListener(this);
		 b12.addActionListener(this);
		 
		
		/*
		p2.add(new JButton("7"));
		p2.add(new JButton("8"));
		p2.add(new JButton("9"));
		p2.add(new JButton("+"));
		
		p3.add(new JButton("4"));
		p3.add(new JButton("5"));
		p3.add(new JButton("6"));
		p3.add(new JButton("-"));
		
		p4.add(new JButton("1"));
		p4.add(new JButton("2"));
		p4.add(new JButton("3"));
		p4.add(new JButton("X"));
		
		p5.add(new JButton("C"));
		p5.add(new JButton("0"));
		p5.add(new JButton("="));
		p5.add(new JButton("÷"));
		*/
		
		con.add(p5);
		
		/*
		con.setLayout(new FlowLayout());
		JButton b = new JButton("폰트");
		b.setFont(f); //버튼 글자에 폰트적용
		con.add(b);
		*/
				
	
		setTitle("계산기 실습");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String s=e.getActionCommand();
		String oldText = jt.getText();
		switch(s) {
		case "1/x" :
				//화면에 있는 숫자로 1을 나눈 몫을 출력합니다.
				// 버튼을 눌렀을때의 숫자가 0이라면 아무일도 일어나지 않게 해주세요
			secondNumber = Integer.parseInt(jt.getText());	
				if(secondNumber==0)return;
				result2=1/(double)secondNumber;
				jt.setText(String.valueOf(result2));
				 	break;
		case "sqr"  :
				// 제곱근을 구하는 버튼으로 구현합니다.
				// 버튼을 눌렀을때의 숫자가 0이라면 아무일도 일어나지 않게 해주세요
				secondNumber = Integer.parseInt(jt.getText());
				if(secondNumber==0)return;
				result2=Math.sqrt(secondNumber);
				jt.setText(String.valueOf(result2));
					break;
		case "<-":
			// String변수.length(): 글자 갯수
			// String변수.substring(n,m): 일부 글자만 추출
			// "123456" -> "12345"
			if(oldText.length() == 1 )jt.setText("0");
			else jt.setText(oldText.substring(0,oldText.length()-1));
					break;
		case "=" :
			secondNumber = Integer.parseInt(jt.getText());
			switch(operator) {
			case"+":
				result1=firstNumber+secondNumber;
				jt.setText(String.valueOf(result1));
				break;
			case"-" :
				result1=firstNumber-secondNumber;
				jt.setText(String.valueOf(result1));
				break;
			case"x" :
				result1=firstNumber*secondNumber;
				jt.setText(String.valueOf(result1));
				break;
			case"÷" :
				result2=firstNumber/(double)secondNumber;
				jt.setText(String.valueOf(result2));
				break;
			}
			break;
		case"C" :
			jt.setText(""); break;
		case"+" :
		case"-" :
		case"x" :
		case"÷" :
			operator=s;
			firstNumber = Integer.parseInt(jt.getText());
			jt.setText("0");
			break;
		case"0" :				case"1" :		
		case"2" :				case"3" :
		case"4" :				case"5" :
		case"6" :				case"7" :
		case"8" :				case"9" :
			if(oldText.equals("0")) jt.setText(s);
			else jt.setText(oldText+s);
			break;
			
		
		}
	}
}

public class Swing13 {

	public static void main(String[] args) {
		new Calculator();

	}

}
