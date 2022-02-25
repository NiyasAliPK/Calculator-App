import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{

	boolean OperatorClicked=false;
	float temp=0,number=0;
	String num1,num2;
	float result=0; 
	String array[]=new String[20];
	char operator;
	JFrame jf;
	JLabel displayLabel;
	JButton SevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton sixButton;
	JButton fiveButton;
	JButton fourButton;
	JButton threeButton;
	JButton twoButton;
	JButton oneButton;
	JButton dotButton;
	JButton equalButton;
	JButton zeroButton;
	JButton divButton;
	JButton multiButton;
	JButton minusButton;
	JButton plusButton;
	JButton ClearButton;
	JButton percButton;
	
	
	 Calculator() {
	jf=new JFrame("Calculator");
	jf.setSize(350,450);
	jf.setLayout(null);
	jf.setVisible(true);
	jf.setLocation(700, 250);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	displayLabel=new JLabel();
	displayLabel.setBounds(20, 50, 290, 40);
	displayLabel.setBackground(Color.GRAY);
	displayLabel.setOpaque(true);
	displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
	displayLabel.setForeground(Color.white);
	jf.add(displayLabel);
	
	
	 SevenButton=new JButton("7");
	SevenButton.setBounds(20,120,50,50);
	jf.add(SevenButton);
	SevenButton.addActionListener(this);
	
	 eightButton=new JButton("8");
	eightButton.setBounds(80,120,50,50);
	jf.add(eightButton);
	eightButton.addActionListener(this);
	
	 nineButton=new JButton("9");
	nineButton.setBounds(140,120,50,50);
	jf.add(nineButton);
	nineButton.addActionListener(this);
	
	
	
	 fourButton=new JButton("4");
	fourButton.setBounds(20,180,50,50);
	jf.add(fourButton);
	fourButton.addActionListener(this);
	
	 fiveButton=new JButton("5");
	fiveButton.setBounds(80,180,50,50);
	jf.add(fiveButton);
	fiveButton.addActionListener(this);
	
	 sixButton=new JButton("6");
	sixButton.setBounds(140,180,50,50);
	jf.add(sixButton);
	sixButton.addActionListener(this);
	
	
	
	 oneButton=new JButton("1");
	oneButton.setBounds(20,240,50,50);
	jf.add(oneButton);
	oneButton.addActionListener(this);
	
	 twoButton=new JButton("2");
	twoButton.setBounds(80,240,50,50);
	jf.add(twoButton);
	twoButton.addActionListener(this);
	
	 threeButton=new JButton("3");
	threeButton.setBounds(140,240,50,50);
	jf.add(threeButton);
	threeButton.addActionListener(this);
	
	
	
	 dotButton=new JButton(".");
	dotButton.setBounds(20,300,50,50);
	jf.add(dotButton);
	dotButton.addActionListener(this);
	
	zeroButton=new JButton("0");
	zeroButton.setBounds(80,300,50,50);
	jf.add(zeroButton);
	zeroButton.addActionListener(this);
	
	equalButton=new JButton("=");
	equalButton.setBounds(140,300,50,50);
	jf.add(equalButton);
	equalButton.addActionListener(this);
	
	//OPERATORS FROM HERE
	
	divButton=new JButton("/");
	divButton.setBounds(230,120,80,50);
	jf.add(divButton);
	divButton.addActionListener(this);
	
	multiButton=new JButton("x");
	multiButton.setBounds(230,180,80,50);
	jf.add(multiButton);
	multiButton.addActionListener(this);

	 minusButton=new JButton("-");
	minusButton.setBounds(230,240,80,50);
	jf.add(minusButton);
	minusButton.addActionListener(this);
	
	plusButton=new JButton("+");
	plusButton.setBounds(230,300,80,50);
	jf.add(plusButton);
	plusButton.addActionListener(this);
	
	percButton=new JButton("%");
	percButton.setBounds(230, 360, 80, 50);
	jf.add(percButton);
	percButton.addActionListener(this);
	
	ClearButton=new JButton("CLEAR");
	ClearButton.setBounds(20, 360, 170, 50);
	jf.add(ClearButton);
	ClearButton.addActionListener(this);
}
	 
	 
	 public static void main(String[] args) {
		 new Calculator();
	}

	 //Codes for Buttons Start from here
	@Override
	public void actionPerformed(ActionEvent e) {
			
		
		if(e.getSource()==SevenButton) {
				
			displayLabel.setText(displayLabel.getText()+"7");
		
		}else if(e.getSource()==eightButton) {
			 
			String existingText=displayLabel.getText();
			displayLabel.setText(existingText+"8");
			//Alternate method
		}else if(e.getSource()==nineButton) {
			
			displayLabel.setText(displayLabel.getText()+"9");
			
		}else if(e.getSource()==sixButton) {

			displayLabel.setText(displayLabel.getText()+"6");
			
		}else if(e.getSource()==fiveButton) {
			
			
			displayLabel.setText(displayLabel.getText()+"5");
			
		}else if(e.getSource()==fourButton) {
			
			displayLabel.setText(displayLabel.getText()+"4");
			
		}else if(e.getSource()==threeButton) {
			
			displayLabel.setText(displayLabel.getText()+"3");
			
		}else if(e.getSource()==twoButton) {
			
			displayLabel.setText(displayLabel.getText()+"2");
		
		}else if(e.getSource()==oneButton) {
			
			displayLabel.setText(displayLabel.getText()+"1");
			
		}else if(e.getSource()==zeroButton) {
			
			displayLabel.setText(displayLabel.getText()+"0");
			
		}else if(e.getSource()==dotButton) {
			
			displayLabel.setText(displayLabel.getText()+".");
		
			
		}else if(e.getSource()==equalButton) {
			
			num2=displayLabel.getText();
			switch(operator) {
			case '+':
				float n1=Float.parseFloat(num1);
				float n2=Float.parseFloat(num2);
				result=n1+n2;
				break;
			case '/':
				float div1=Float.parseFloat(num1);
				float div2=Float.parseFloat(num2);
				result=div1/div2;
				break;
			case '-':
				float min1=Float.parseFloat(num1);
				float min2=Float.parseFloat(num2);
				result=min1-min2;
				if(result<0) {
					displayLabel.setText("-");
				}break;
			case '*':
				float mul1=Float.parseFloat(num1);
				float mul2=Float.parseFloat(num2);
				number=mul2;
				result=mul1*mul2;
				temp=result;
				break;
			case '%':
				float per1=Float.parseFloat(num1);
				float per2=Float.parseFloat(num2);
				result=per1*per2/100;
				break;
			}
			
			displayLabel.setText(result+"");
			String res=String.valueOf(result);
			 num1=res;
			
			/*String NewValue=displayLabel.getText();
			float OldFloat=Float.parseFloat(OldValue);  //Concept from sir
			float NewFloat=Float.parseFloat(NewValue);
			sum=OldFloat+NewFloat;
			displayLabel.setText(sum+"");*/
			
			
		}else if(e.getSource()==divButton) {
			OperatorClicked=true;
			num1 = displayLabel.getText();
			operator='/';
			displayLabel.setText("");
		}else if(e.getSource()==multiButton) {
			OperatorClicked=true;
			num1 = displayLabel.getText();
			operator='*';
			displayLabel.setText("");
		}else if(e.getSource()==minusButton) {
			OperatorClicked=true;
			num1 = displayLabel.getText();
			operator='-';
			displayLabel.setText("");
		}else if(e.getSource()==plusButton) {
		
			OperatorClicked=true;
			num1=displayLabel.getText();
			operator='+';
			displayLabel.setText("");

	
		}else if(e.getSource()==ClearButton) {
			
			displayLabel.setText("");
			
		}else if(e.getSource()==percButton) {
			
			OperatorClicked=true;
			num1=displayLabel.getText();
			operator='%';
			displayLabel.setText("");
		}
	}
}
