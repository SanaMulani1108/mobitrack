import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
public class realme_demo extends JFrame implements ActionListener
{
	//JPanel p1,p2;
	JLabel l1,l2,l3,l4,l5,l6,l7;
	ImageIcon i1,i2,i3,i4,i5,i6,i7;
	JTextArea ta1,ta2,ta3,ta4,ta5,ta6;
	//JButton b1,b2,b3,b4,b5,b6;
	JButton b1;
	realme_demo()
	{
		setVisible(true);
		setSize(1600,1600);
		setLayout(null);
		getContentPane().setBackground(Color.pink);
		
		
		i1=new ImageIcon("realme.jfif");
		i2=new ImageIcon("realme2.jfif");
		i3=new ImageIcon("realme3.jfif");
		i4=new ImageIcon("realme4.jfif");
		i5=new ImageIcon("realme5.jpg");
		i6=new ImageIcon("realme6.jpg");
		i7=new ImageIcon("cross.jpg");
		
		//Label
		l1=new JLabel();
		l2=new JLabel();
		l3=new JLabel();
		l4=new JLabel();
		l5=new JLabel();
		l6=new JLabel();
		l7=new JLabel("Realme Brands");
		l1.setBounds(100,80,700,250);
		l2.setBounds(500,80,700,250);
		l3.setBounds(950,80,700,250);
		l4.setBounds(100,400,700,250);
		l5.setBounds(500,400,700,250);
		l6.setBounds(950,400,700,250);
		l7.setBounds(590,0,300,70);
		
		Font f7 = new Font("Rockwell", Font.BOLD, 30);
		l7.setFont(f7);

		
		//buttons
		/*b1=new JButton("View More");
		b2=new JButton("View More");
		b3=new JButton("View More");
		b4=new JButton("View More");
		b5=new JButton("View More");
		b6=new JButton("View More");
		b1.setBounds(110,300,170,50);
		b2.setBounds(530,300,170,50);
		b3.setBounds(980,300,170,50);
		b4.setBounds(110,630,170,50);
		b5.setBounds(510,630,170,50);
		b6.setBounds(980,630,170,50);*/
		
		b1=new JButton(i7);
		b1.setBounds(1300,10,30,30);
		//b1.setBackground(Color.pink);

		/*Font f7 = new Font("Elephant", Font.ITALIC, 20);
		b1.setFont(f7);
		b1.setBackground(Color.gray);
		b1.setForeground(Color.blue);
		
		Font f8 = new Font("Elephant", Font.ITALIC, 20);
		b2.setFont(f8);
		b2.setBackground(Color.gray);
		b2.setForeground(Color.blue);

		Font f9 = new Font("Elephant", Font.ITALIC, 20);
		b3.setFont(f9);
		b3.setBackground(Color.gray);
		b3.setForeground(Color.blue);
		
		Font f10 = new Font("Elephant", Font.ITALIC, 20);
		b4.setFont(f10);
		b4.setBackground(Color.gray);
		b4.setForeground(Color.blue);
		
		Font f11 = new Font("Elephant", Font.ITALIC, 20);
		b5.setFont(f11);
		b5.setBackground(Color.gray);
		b5.setForeground(Color.blue);

		Font f12 = new Font("Elephant", Font.ITALIC, 20);
		b6.setFont(f12);
		b6.setBackground(Color.gray);
		b6.setForeground(Color.blue);*/
		
		
		
		String val1="Realme 5\n"+"Rs.11,888.00 \n"+"Storage:64GB\n"+"RAM:4GB\n";
		ta1=new JTextArea(val1,4,50);
		Font f1 = new Font("Calibri", Font.BOLD, 20);
		ta1.setFont(f1);
		ta1.setBackground(Color.pink);
		ta1.setBounds(340,100,150,100);
		
		String val2="Realme C15\n"+"Rs.30,750.00 \n"+"Storage:128GB\n"+"RAM:4GB\n";
		ta2=new JTextArea(val2,4,50);
	 	Font f2 = new Font("Calibri", Font.BOLD, 20);
		ta2.setFont(f2);
		ta2.setBackground(Color.pink);
		ta2.setBounds(750,100,150,100);
		
		String val3="Realme Narzo 20\n"+"Rs.11,499.00 \n"+"Storage:128GB\n"+"RAM:4GB\n";
		ta3=new JTextArea(val3,4,50);
		Font f3 = new Font("Calibri", Font.BOLD, 20);
		ta3.setFont(f3);
		ta3.setBackground(Color.pink);
		ta3.setBounds(1200,100,150,100);
			
		String val4="Realme XT\n"+"Rs.15,999.00 \n"+"Storage:128GB\n"+"RAM:4GB\n";
		ta4=new JTextArea(val4,4,50);
		Font f4 = new Font("Calibri", Font.BOLD, 20);
		ta4.setFont(f4);
		ta4.setBackground(Color.pink);
		ta4.setBounds(330,450,150,100);
		
		String val5="Realme X50 Pro\n"+"Rs.34,999.00 \n"+"Storage:128GB\n"+"RAM:8GB\n";
		ta5=new JTextArea(val5,4,50);
		Font f5 = new Font("Calibri", Font.BOLD, 20);
		ta5.setFont(f5);
		ta5.setBackground(Color.pink);
		ta5.setBounds(750,450,150,100);
		
		String val6="Realme C11\n"+"Rs.9,390.00 \n"+"Storage:32GB\n"+"RAM:3GB\n";
		ta6=new JTextArea(val6,4,50);
		Font f6 = new Font("Calibri", Font.BOLD, 20);
		ta6.setFont(f6);
		ta6.setBackground(Color.pink);
		ta6.setBounds(1200,450,150,100);
		
		l1.setIcon(i1);
		l2.setIcon(i2);
		l3.setIcon(i3);
		l4.setIcon(i4);
		l5.setIcon(i5);
		l6.setIcon(i6);
		add(b1);
		
		
		//Images
		

		//add(p1);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(ta1);
		add(ta2);
		add(ta3);
		add(ta4);
		add(ta5);
		add(ta6);
		//add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1)
			{
				brands_demo b1=new brands_demo();
				dispose();
			}
		}
	

}
			 