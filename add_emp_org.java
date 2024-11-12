import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
import java.sql.*;
import javax.swing.border.TitledBorder;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import java.awt.Component;
import java.awt.Container;
import java.io.*;
public class add_emp_org extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2,b3,b4,b5,b6,b7;
	JPanel p1,p2;
	ImageIcon i1;
	JTable jt;
	ResultSet rs;
	boolean flag=true;
	Connection co;
	PreparedStatement ps;
	Statement st;
	int a;
	String data1[][]=new String[100][100];	
	JButton browse;
	JButton userimg;
	JFileChooser jf;
	add_emp_org()
	{
		try
        {
            Class.forName("com.mysql.jdbc.Driver");
			co=DriverManager.getConnection("jdbc:mysql://localhost:3306/sana","root","root");
			st=co.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
				
        }
        catch(SQLException ex)
        {
            System.out.println("Exception: "+ex);
        }
		catch(ClassNotFoundException ex)
        {
            System.out.println("Exception: "+ex);
        }
		setVisible(true);
		setSize(1600,1600);
		setLayout(null);
		getContentPane().setBackground(Color.pink);
		
		p1=new JPanel();
		p2=new JPanel();
	
		
		
		l1=new JLabel("Employee ID");
		l2=new JLabel("Employee Name");
		l3=new JLabel("Employee MNo.");
		l4=new JLabel("Employee Address");
		l5=new JLabel("Employee Salary");

		l1.setForeground(Color.blue);
		l2.setForeground(Color.blue);
		l3.setForeground(Color.blue);
		l4.setForeground(Color.blue);
		l5.setForeground(Color.blue);

		Font f1=new Font("Georgia",Font.BOLD,15);
		l1.setFont(f1);
		Font f2=new Font("Georgia",Font.BOLD,15);
		l2.setFont(f2);
		Font f3=new Font("Georgia",Font.BOLD,15);
		l3.setFont(f3);
		Font f4=new Font("Georgia",Font.BOLD,15);
		l4.setFont(f4);
		Font f5=new Font("Georgia",Font.BOLD,15);
		l5.setFont(f5);
		
		
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		t4=new JTextField();
		t5=new JTextField();
		
		b1=new JButton("INSERT");
		b2=new JButton("UPDATE");
		b3=new JButton("DELETE");
		b4=new JButton("CLEAR");
		b6=new JButton("Check Records");
        b7=new JButton("SEARCH");
		browse=new JButton("Browse");
		userimg=new JButton();
		browse.addActionListener(this);
		jf=new JFileChooser();
		jf.setCurrentDirectory(new File("."));
		
		b5=new JButton();
		i1=new ImageIcon("cross.jpg");
		b5.setIcon(i1);
		b5.setBounds(1300,10,30,30);
		add(b5);

		Font f6=new Font("Arial",Font.BOLD,15);
		b1.setFont(f6);
		b1.setForeground(Color.black);
		
		Font f7=new Font("Arial",Font.BOLD,15);
		b2.setFont(f7);
		b2.setForeground(Color.black);
		
		
		Font f8=new Font("Arial",Font.BOLD,15);
		b3.setFont(f8);
		b3.setForeground(Color.black);
		
		
		Font f9=new Font("Arial",Font.BOLD,15);
		b4.setFont(f9);
		b4.setForeground(Color.black);
		
		
		Font f10=new Font("Arial",Font.BOLD,15);
		b6.setFont(f10);
		b6.setForeground(Color.black);

        Font f11=new Font("Arial",Font.BOLD,15);
		b7.setFont(f11);
		b7.setForeground(Color.black);

		Font f12=new Font("Arial",Font.BOLD,15);
		browse.setFont(f12);
		browse.setForeground(Color.black);

		

		b1.setBackground(Color.pink);
		b2.setBackground(Color.pink);
		b3.setBackground(Color.pink);
		b4.setBackground(Color.pink);
		b6.setBackground(Color.pink);
        b7.setBackground(Color.pink);
		browse.setBackground(Color.pink);	
		userimg.setBackground(Color.white);	

		l1.setBounds(30,70,150,20);
		l2.setBounds(30,130,150,20);
		l3.setBounds(30,190,150,20);
		l4.setBounds(30,250,150,20);
		l5.setBounds(30,310,150,20);
		
		t1.setBounds(180,70,150,20);
		t2.setBounds(180,130,150,20);
		t3.setBounds(180,190,150,20);
		t4.setBounds(180,250,150,20);
		t5.setBounds(180,310,150,20);
		
		b1.setBounds(230,370,100,40);
		b2.setBounds(380,370,100,40);
		b3.setBounds(230,430,100,40);
		b4.setBounds(380,430,100,40);
		b6.setBounds(220,370,150,40);
        b7.setBounds(520,370,100,40);
		browse.setBounds(465,290,100,40);
		userimg.setBounds(420,70,200,200);

		
	try{

			if(flag)
			{
				rs=st.executeQuery("Select * from addemp");
				flag=false;
			}
			rs.last();
			t1.setText(rs.getInt("Emp_ID")+1+"");
		}
		catch(SQLException ex){
			System.out.println("Exception "+ex);
		}
		
		
		p1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Add Employee Here", TitledBorder.LEFT, TitledBorder.TOP));
		p2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "", TitledBorder.LEFT, TitledBorder.TOP));
			
		p1.setBounds(10,50,700,500);	
		p2.setBounds(730,56,600,495);	
		
		p1.setBackground(Color.white);
		p2.setBackground(Color.gray);
		
	
		add(p1);
		add(p2);
		p1.setLayout(null);
		p2.setLayout(null);
		p1.add(l1);p1.add(t1);p1.add(l2);p1.add(t2);p1.add(l3);
		p1.add(t3);p1.add(l4);p1.add(t4);p1.add(l5);p1.add(t5);
	
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p2.add(b6);
        p1.add(b7);
		p1.add(userimg);
		p1.add(browse);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
        b7.addActionListener(this);
		browse.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s=ae.getActionCommand();
	
		if(s.equals("INSERT"))
		{
			try
			{
				/*Class.forName("com.mysql.jdbc.Driver");
				JOptionPane.showMessageDialog(this,"Driver Registered");
				Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/sana","root","root");
				JOptionPane.showMessageDialog(this,"Connection Created");*/


				int a=Integer.parseInt(t1.getText());
				String s1=t2.getText();
				String s2=t3.getText();
				String s3=t4.getText();
				int b=Integer.parseInt(t5.getText());


		        ps=co.prepareStatement("insert into addemp value(?,?,?,?,?)");
				ps.setInt(1,a);
				ps.setString(2,s1);
				ps.setString(3,s2);
				ps.setString(4,s3);
				ps.setInt(5,b);
				ps.executeUpdate();
				JOptionPane.showMessageDialog(this,"Data inserted succesfully");
				//System.out.println("Data inserted succesfully");
				//co.close();
			}
			catch(Exception e){}
		}
		else if(s.equals("UPDATE"))
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				//JOptionPane.showMessageDialog(this,"Driver Registered");
				Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/sana","root","root");
				//JOptionPane.showMessageDialog(this,"Connection Created");
				
				a=Integer.parseInt(t1.getText());
				String s1=t2.getText();
				String s2=t3.getText();
				String s3=t4.getText();
				int b=Integer.parseInt(t5.getText());

				
				ps=co.prepareStatement("update addemp set Emp_name=?,Emp_mob=?,Emp_addr=?,Emp_sal=? where Emp_ID="+a);
				
				
				ps.setString(1,s1);
				ps.setString(2,s2);
				ps.setString(3,s3);
				ps.setInt(4,b);
				ps.executeUpdate();
				JOptionPane.showMessageDialog(this,"Data updated succesfully");
				//System.out.println("Data inserted succesfully");
				//co.close();
			}catch(Exception e){}
		}	
		else if(s.equals("DELETE"))
		{
			try
			{
				/*Class.forName("com.mysql.jdbc.Driver");
				JOptionPane.showMessageDialog(this,"Driver Registered");
				Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/sana","root","root");
				JOptionPane.showMessageDialog(this,"Connection Created");*/
			
				int a=Integer.parseInt(t1.getText());
				
			
				//String query="update mobadd SET prod_nm=?,prod_comp=?,prod_price=?,prod_unit=?,prod_type=? where prod_id="+a;
				//PreparedStatement ps=co.prepareStatement(query);
				ps=co.prepareStatement("delete from addemp where Emp_ID="+a);
				
				
				ps.executeUpdate();
				JOptionPane.showMessageDialog(this,"Data deleted succesfully");
				//System.out.println("Data inserted succesfully");
				//co.close();
			}catch(Exception e){}
		}	
			
		
		else if(s.equals("CLEAR"))
		{
		 	t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			
		}
        else if(s.equals("SEARCH"))
		{
             
            try
			{
          
             PreparedStatement ps=co.prepareStatement("select Emp_name,Emp_mob,Emp_addr,Emp_sal from addemp where Emp_ID=?");
			
			
			      
                a=Integer.parseInt(t1.getText());  
                 ps.setInt(1,a);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()==false)
			{
				JOptionPane.showMessageDialog(this,"record not found");
				t1.requestFocus();
			}
			else
			{
			t2.setText(rs.getString("Emp_name"));
			t3.setText(rs.getString("Emp_mob"));
			t4.setText(rs.getString("Emp_addr"));
			t5.setText(rs.getString("Emp_sal"));
			
			}
	
			}
			catch( SQLException ex)
			{
				System.out.println("Exception: "+ex);
			}
			catch( NullPointerException ex)
			{
				System.out.println("Exception: "+ex);
			}
        }
		else if(ae.getSource()==b5)
		{
			MobWelcome mb=new MobWelcome();
			dispose();
		}
		else if(s.equals("Browse"))
		{	
						 int result=jf.showOpenDialog(null);
						 if(result==JFileChooser.APPROVE_OPTION)
							{
								String nm=jf.getSelectedFile().getPath();
								userimg.setIcon(new ImageIcon(nm));
							}
					  
		}
		else if(s.equals("Check Records"))
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/sana","root","root");
				String [] column={"Emp_ID","Emp_nm","Emp_mob","Emp_addr","Emp_sal"};
			    ps=co.prepareStatement("select * from addemp");
				rs=ps.executeQuery();
				int i=0;
				while(rs.next())
				{
					for(int j=0;j<=4;j++)
					{
						data1[i][j]=""+rs.getString(j+1);
					}
					i++;
									
				}
				jt=new JTable(data1,column);
				JScrollPane jp=new JScrollPane(jt);
				jt.setShowVerticalLines(true);
				jp.setBounds(0,0,600,300);
				p2.add(jp);
				//co.close();
			}catch(Exception e){}
		}
        
    
		
	}
}

		