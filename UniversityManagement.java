import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class UtilVw extends UnderOperation implements ActionListener{
	JPanel p1,p2;
	ImageIcon imag,setimag1,setimag2,setimag3,setimag4;
	Image scale;
	UtilVw(){
		f1.setSize(1200,850);
		p1=new JPanel();
		p1.setBackground(Color.ORANGE);	
		header=new JLabel("Utility Views");
		header.setFont(new Font("Arial",Font.BOLD,30));
		header.setForeground(Color.WHITE);
		l1=new JLabel("Further Queries");
		l1.setFont(new Font("Arial",Font.BOLD,28));
		l1.setForeground(Color.BLACK);
		l2=new JLabel("Name :");
		l2.setFont(new Font("Arial",Font.PLAIN,22));
		l3=new JLabel("Reg Number :");
		l3.setFont(new Font("Arial",Font.PLAIN,22));
		FacDet.inputChoice();
		l4=new JLabel("Phone :");
		l4.setFont(new Font("Arial",Font.PLAIN,22));
		btn1=new JButton("SUBMIT");
		btn1.setFont(new Font("Arial",Font.BOLD,22));
		btn1.setBackground(co1);
		btn1.setForeground(Color.WHITE);
		p2=new JPanel();
		p2.setBackground(Color.BLACK);
		l5=new JLabel("CONTACT US");
		l5.setFont(new Font("Arial",Font.BOLD,28));
		l5.setForeground(Color.ORANGE);
		l6=new JLabel("Toll Free : 9057");
		l6.setForeground(Color.WHITE);
		l7=new JLabel("Office Number : 1031-43828293");
		l7.setForeground(Color.WHITE);
		l8=new JLabel("Connect with us");
		l8.setFont(new Font("Arial",Font.BOLD,22));
		l8.setForeground(Color.WHITE);
		imag=new ImageIcon("Image/fourth.jpg");
		scale=imag.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
		setimag1=new ImageIcon(scale);
		lg1=new JLabel(setimag1);
		imag=new ImageIcon("Image/fifth.jpg");
		scale=imag.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
		setimag2=new ImageIcon(scale);
		lg2=new JLabel(setimag2);
		imag=new ImageIcon("Image/sixth.jpg");
		scale=imag.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
		setimag3=new ImageIcon(scale);
		lg3=new JLabel(setimag3);
		imag=new ImageIcon("Image/exam.jpg");
		scale=imag.getImage().getScaledInstance(450,180,Image.SCALE_DEFAULT);
		setimag4=new ImageIcon(scale);
		lg4=new JLabel(setimag4);
		l9=new JLabel("Copyright @ 2021");
		l9.setFont(new Font("Arial",Font.BOLD,18));
		l9.setForeground(Color.WHITE);
		btn1.addActionListener(this);
		f1.add(p1);
		p1.add(header);
		f1.add(l1);
		f1.add(l2);
		f1.add(l3);
		f1.add(c1);
		f1.add(l4);
		f1.add(c2);
		c2.add("Fee Deposit");
		c2.add("Ragging");
		c2.add("Contacting");
		c2.add("Cleaning");
		f1.add(btn1);
		f1.add(p2);
		p2.add(l5);
		p2.add(l6);
		p2.add(l7);
		p2.add(l8);
		p2.add(lg1);
		p2.add(lg2);
		p2.add(lg3);
		p2.add(lg4);
		p2.add(l9);
		p1.setBounds(47,47,1130,55);
		header.setBounds(10,0,1100,50);
		act.setBounds(920,50,150,50);
		l1.setBounds(500,140,290,50);
		l2.setBounds(220,220,190,40);
		t1.setBounds(520,220,190,40);
		l3.setBounds(220,290,190,40);
		c1.setBounds(520,290,190,40);
		l4.setBounds(220,360,190,40);
		t2.setBounds(520,360,190,40);
		c2.setBounds(220,440,230,40);
		btn1.setBounds(500,430,210,60);
		p2.setBounds(3,530,1175,270);
		l5.setBounds(500,0,290,50);
		l6.setBounds(200,65,190,30);
		l7.setBounds(200,100,190,30);
		l8.setBounds(150,145,220,40);
		lg1.setBounds(210,200,50,30);
		lg2.setBounds(290,200,50,30);
		lg3.setBounds(360,200,50,30);
		lg4.setBounds(630,65,450,150);
		l9.setBounds(470,235,290,40);
		f1.setLocation(350,110);
		p1.setLayout(null);
		p2.setLayout(null);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==btn1){
			if(t1.getText().equals("")||t2.getText().equals("")){
				JOptionPane.showMessageDialog(null,"Fill all Deposit");
				t1.requestFocus();
			}
			else{
				try{
					String prob=c2.getSelectedItem().toString();
					String id=c1.getSelectedItem().toString();
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost/management?user=root&pass=");
					String qry="update public set problem=? where reg_id=?";
					PreparedStatement ps=con.prepareStatement(qry);
					ps.setString(1,prob);
					ps.setString(2,id);
					int udt=ps.executeUpdate();
					if(udt==1)
						act.setText("Updated");
					else
						act.setText("Disabled");
				}
				catch(Exception exp){
					act.setText("Error");
				}
			}
		}
	}
}
class FeeForm extends UnderOperation implements ActionListener{
	FeeForm(){
		f1.setSize(1200,600);
		header=new JLabel("Fee Form");
		header.setFont(new Font("Arial",Font.BOLD,30));
		l1=new JLabel("Reg Number :");
		l1.setFont(new Font("Arial",Font.PLAIN,22));
		l2=new JLabel("Bank :");
		l2.setFont(new Font("Arial",Font.PLAIN,22));
		l3=new JLabel("Semester :");
		l3.setFont(new Font("Arial",Font.PLAIN,22));
		l4=new JLabel("Amount :");
		l4.setFont(new Font("Arial",Font.PLAIN,22));
		btn1=new JButton("PAY");
		btn1.setFont(new Font("Arial",Font.BOLD,22));
		btn1.setBackground(co1);
		btn1.setForeground(Color.WHITE);
		btn1.addActionListener(this);
		f1.add(header);
		f1.add(l1);
		f1.add(l2);
		f1.add(l3);
		f1.add(c1);
		c1.add("1");
		c1.add("2");
		c1.add("3");
		c1.add("4");
		c1.add("5");
		c1.add("6");
		c1.add("7");
		c1.add("8");
		f1.add(l4);
		f1.add(c2);
		c2.add("Credit Card");
		c2.add("Debit Card");
		c2.add("Check");
		c2.add("UPI");
		f1.add(btn1);
		header.setBounds(500,40,290,50);
		act.setBounds(920,50,150,50);
		l1.setBounds(350,130,190,40);
		t1.setBounds(630,130,190,40);
		l2.setBounds(350,200,190,40);
		t2.setBounds(630,200,190,40);
		l3.setBounds(350,270,190,40);
		c1.setBounds(630,270,190,40);
		l4.setBounds(350,340,190,40);
		t3.setBounds(630,340,190,40);
		c2.setBounds(823,342,190,40);
		btn1.setBounds(500,420,190,60);
		f1.setLocation(350,200);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==btn1){
			if(t1.getText().equals("")||t2.getText().equals("")||t3.getText().equals("")){
				JOptionPane.showMessageDialog(null,"Fill all Details");
				t1.requestFocus();
			}
			else{
				String id=t1.getText();
				try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost/management?user=root&pass=");
					String qry="update exam set status=? where reg_id=?";
					PreparedStatement ps=con.prepareStatement(qry);
					ps.setString(1,"Payed");
					ps.setString(2,id);
					int udt=ps.executeUpdate();
					if(udt==1)
						act.setText("Payed");
					else
						act.setText("Disabled");
				}
				catch(Exception exp){
					act.setText("Error");
				}
			}
		}
	}
}
class VwStruc extends UnderOperation implements ActionListener{
	String colo1[]={"Course","Semester1","Semester2","Semester3","Semester4","Semester5","Semester6","Semester7","Semester8"};
	String row1[][]={{"BCA","3232","8676","4342","49392","994","3930","9934","9544"},{"BBA","342","34253","433","1332","939","9238","7920","9272"},{"MCA","349","928","841","4829","439","238","239","983"}};
	VwStruc(){
		f1.setSize(1200,600);
		header=new JLabel("Fee Structure");
		header.setFont(new Font("Arial",Font.BOLD,30));
		tl1=new JTable(row1,colo1);
		tl1.setRowHeight(0,25);
		tl1.setRowHeight(1,25);
		tl1.setRowHeight(2,25);
		tl1.setFont(new Font("Arial",Font.PLAIN,22));
		sb1=new JScrollPane(tl1);
		btn1=new JButton("EXIT");
		btn1.setFont(new Font("Arial",Font.BOLD,22));
		btn1.setBackground(co1);
		btn1.setForeground(Color.WHITE);
		btn1.addActionListener(this);
		f1.add(header);
		f1.add(sb1);
		f1.add(btn1);
		header.setBounds(500,40,290,50);
		act.setBounds(920,50,150,50);
		sb1.setBounds(10,200,1170,100);
		btn1.setBounds(500,400,190,60);
		f1.setLocation(350,200);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==btn1)
			f1.setVisible(false);
	}
}
class UpdStu extends UnderOperation implements ActionListener{
	UpdStu(){
		f1.setSize(1200,850);
		header=new JLabel("Update Student");
		header.setFont(new Font("Arial",Font.BOLD,30));
		l1=new JLabel("Reg Number :");
		l1.setFont(new Font("Arial",Font.PLAIN,22));
		FacDet.inputChoice();
		btn1=new JButton("SEARCH");
		btn1.setFont(new Font("Arial",Font.BOLD,22));
		btn1.setBackground(co1);
		btn1.setForeground(Color.WHITE);
		l2=new JLabel("Name :");
		l2.setFont(new Font("Arial",Font.PLAIN,22));
		lg1=new JLabel();
		lg1.setFont(new Font("Arial",Font.PLAIN,22));
		l3=new JLabel("Reg Number :");
		l3.setFont(new Font("Arial",Font.PLAIN,22));
		lg2=new JLabel();
		lg2.setFont(new Font("Arial",Font.PLAIN,22));
		l4=new JLabel("Address :");
		l4.setFont(new Font("Arial",Font.PLAIN,22));
		l5=new JLabel("Email :");
		l5.setFont(new Font("Arial",Font.PLAIN,22));
		l6=new JLabel("XII(%) :");
		l6.setFont(new Font("Arial",Font.PLAIN,22));
		lg3=new JLabel();
		lg3.setFont(new Font("Arial",Font.PLAIN,22));
		l7=new JLabel("Aadhar ID :");
		l7.setFont(new Font("Arial",Font.PLAIN,22));
		lg4=new JLabel();
		lg4.setFont(new Font("Arial",Font.PLAIN,22));
		l8=new JLabel("Birth Date :");
		l8.setFont(new Font("Arial",Font.PLAIN,22));
		lg5=new JLabel();
		lg5.setFont(new Font("Arial",Font.PLAIN,22));
		l9=new JLabel("Phone :");
		l9.setFont(new Font("Arial",Font.PLAIN,22));
		l10=new JLabel("X(%) :");
		l10.setFont(new Font("Arial",Font.PLAIN,22));
		lg6=new JLabel();
		lg6.setFont(new Font("Arial",Font.PLAIN,22));
		l11=new JLabel("Branch :");
		l11.setFont(new Font("Arial",Font.PLAIN,22));
		lg7=new JLabel("");
		lg7.setFont(new Font("Arial",Font.PLAIN,22));
		btn2=new JButton("SUBMIT");
		btn2.setFont(new Font("Arial",Font.BOLD,22));
		btn2.setBackground(co1);
		btn2.setForeground(Color.WHITE);
		btn3=new JButton("RESET");
		btn3.setFont(new Font("Arial",Font.BOLD,22));
		btn3.setBackground(co1);
		btn3.setForeground(Color.WHITE);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		f1.add(header);
		f1.add(l1);
		f1.add(c1);
		f1.add(btn1);
		f1.add(l2);
		f1.add(lg1);
		f1.add(l3);
		f1.add(lg2);
		f1.add(l4);
		f1.add(l5);
		f1.add(l6);
		f1.add(lg3);
		f1.add(l7);
		f1.add(lg4);
		f1.add(l8);
		f1.add(lg5);
		f1.add(l9);
		f1.add(t3);
		f1.add(l10);
		f1.add(lg6);
		f1.add(l11);
		f1.add(lg7);
		f1.add(btn2);
		f1.add(btn3);
		header.setBounds(500,40,290,50);
		act.setBounds(920,50,150,50);
		l1.setBounds(220,120,190,40);
		c1.setBounds(470,120,190,40);
		btn1.setBounds(300,190,180,50);
		l2.setBounds(120,290,190,40);
		lg1.setBounds(320,290,190,40);
		l3.setBounds(120,370,190,40);
		lg2.setBounds(320,370,190,40);
		l4.setBounds(120,450,190,40);
		t1.setBounds(320,450,190,40);
		l5.setBounds(120,530,190,40);
		t2.setBounds(320,530,190,40);
		l6.setBounds(120,610,190,40);
		lg3.setBounds(320,610,190,40);
		l7.setBounds(670,290,190,40);
		lg4.setBounds(870,290,190,40);
		l8.setBounds(670,370,190,40);
		lg5.setBounds(870,370,190,40);
		l9.setBounds(670,450,190,40);
		t3.setBounds(870,450,190,40);
		l10.setBounds(670,530,190,40);
		lg6.setBounds(870,530,190,40);
		l11.setBounds(670,610,190,40);
		lg7.setBounds(870,610,190,40);
		btn2.setBounds(360,710,190,60);
		btn3.setBounds(640,710,190,60);
		f1.setLocation(350,110);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==btn1){
			UpdFac.myConnection(1);
		}
		else if(e.getSource()==btn2){
			UpdFac.myConnection(2);
		}
		else if(e.getSource()==btn3){
			UpdFac.myConnection(3);
		}
	}
}
class UpdFac extends UnderOperation implements ActionListener{
	UpdFac(){
		f1.setSize(1200,850);
		header=new JLabel("Renew Faculty");
		header.setFont(new Font("Arial",Font.BOLD,30));
		l1=new JLabel("Employee ID :");
		l1.setFont(new Font("Arial",Font.PLAIN,22));
		FacDet.inputChoice();
		btn1=new JButton("SEARCH");
		btn1.setFont(new Font("Arial",Font.BOLD,22));
		btn1.setBackground(co1);
		btn1.setForeground(Color.WHITE);
		l2=new JLabel("Name :");
		l2.setFont(new Font("Arial",Font.PLAIN,22));
		lg1=new JLabel();
		lg1.setFont(new Font("Arial",Font.PLAIN,22));
		l3=new JLabel("Reg ID :");
		l3.setFont(new Font("Arial",Font.PLAIN,22));
		lg2=new JLabel();
		lg2.setFont(new Font("Arial",Font.PLAIN,22));
		l4=new JLabel("Address :");
		l4.setFont(new Font("Arial",Font.PLAIN,22));
		l5=new JLabel("Email :");
		l5.setFont(new Font("Arial",Font.PLAIN,22));
		l6=new JLabel("XII(%) :");
		l6.setFont(new Font("Arial",Font.PLAIN,22));
		lg3=new JLabel();
		lg3.setFont(new Font("Arial",Font.PLAIN,22));
		l7=new JLabel("Aadhar ID :");
		l7.setFont(new Font("Arial",Font.PLAIN,22));
		lg4=new JLabel();
		lg4.setFont(new Font("Arial",Font.PLAIN,22));
		l8=new JLabel("Birth Date :");
		l8.setFont(new Font("Arial",Font.PLAIN,22));
		lg5=new JLabel();
		lg5.setFont(new Font("Arial",Font.PLAIN,22));
		l9=new JLabel("Phone :");
		l9.setFont(new Font("Arial",Font.PLAIN,22));
		l10=new JLabel("X(%) :");
		l10.setFont(new Font("Arial",Font.PLAIN,22));
		lg6=new JLabel();
		lg6.setFont(new Font("Arial",Font.PLAIN,22));
		l11=new JLabel("Department :");
		l11.setFont(new Font("Arial",Font.PLAIN,22));
		lg7=new JLabel("");
		lg7.setFont(new Font("Arial",Font.PLAIN,22));
		btn2=new JButton("SUBMIT");
		btn2.setFont(new Font("Arial",Font.BOLD,22));
		btn2.setBackground(co1);
		btn2.setForeground(Color.WHITE);
		btn3=new JButton("RESET");
		btn3.setFont(new Font("Arial",Font.BOLD,22));
		btn3.setBackground(co1);
		btn3.setForeground(Color.WHITE);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		f1.add(header);
		f1.add(l1);
		f1.add(c1);
		f1.add(btn1);
		f1.add(l2);
		f1.add(lg1);
		f1.add(l3);
		f1.add(lg2);
		f1.add(l4);
		f1.add(l5);
		f1.add(l6);
		f1.add(lg3);
		f1.add(l7);
		f1.add(lg4);
		f1.add(l8);
		f1.add(lg5);
		f1.add(l9);
		f1.add(t3);
		f1.add(l10);
		f1.add(lg6);
		f1.add(l11);
		f1.add(lg7);
		f1.add(btn2);
		f1.add(btn3);
		header.setBounds(500,40,290,50);
		act.setBounds(920,50,150,50);
		l1.setBounds(220,120,190,40);
		c1.setBounds(470,120,190,40);
		btn1.setBounds(300,190,180,50);
		l2.setBounds(120,290,190,40);
		lg1.setBounds(320,290,190,40);
		l3.setBounds(120,370,190,40);
		lg2.setBounds(320,370,190,40);
		l4.setBounds(120,450,190,40);
		t1.setBounds(320,450,190,40);
		l5.setBounds(120,530,190,40);
		t2.setBounds(320,530,190,40);
		l6.setBounds(120,610,190,40);
		lg3.setBounds(320,610,190,40);
		l7.setBounds(670,290,190,40);
		lg4.setBounds(870,290,190,40);
		l8.setBounds(670,370,190,40);
		lg5.setBounds(870,370,190,40);
		l9.setBounds(670,450,190,40);
		t3.setBounds(870,450,190,40);
		l10.setBounds(670,530,190,40);
		lg6.setBounds(870,530,190,40);
		l11.setBounds(670,610,190,40);
		lg7.setBounds(870,610,190,40);
		btn2.setBounds(360,710,190,60);
		btn3.setBounds(640,710,190,60);
		f1.setLocation(350,110);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==btn1){
			myConnection(1);
		}
		else if(e.getSource()==btn2){
			myConnection(2);
		}
		else if(e.getSource()==btn3){
			myConnection(3);
		}
	}
	static void myConnection(int temp){
		if(temp==1){
			try{
				String id=c1.getSelectedItem().toString();
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/management?user=root&pass=");
				String 	qry="select name,reg_id,address,email,xii,aadhar,birth,phone,x,department from public where reg_id=?";
				PreparedStatement ps=con.prepareStatement(qry);
				ps.setString(1,id);
				ResultSet rs=ps.executeQuery();
				while(rs.next()){
					lg1.setText(rs.getString(1));
					lg2.setText(rs.getString(2));
					t1.setText(rs.getString(3));
					t2.setText(rs.getString(4));
					lg3.setText(rs.getString(5));
					lg4.setText(Long.toString(rs.getLong(6)));
					lg5.setText(rs.getString(7));
					t3.setText(Long.toString(rs.getLong(8)));
					lg6.setText(Integer.toString(rs.getInt(9)));
					lg7.setText(rs.getString(10));
				}
			}
			catch(Exception exp){
				act.setText("Error");
			}
		}
		else if(temp==2){
			try{
				String addr=t1.getText();
				String email=t2.getText();
				Long phone=Long.parseLong(t3.getText());
				String id=c1.getSelectedItem().toString();
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/management?user=root&pass=");
				String qry="update public set address=?,email=?,phone=? where reg_id=?";
				PreparedStatement ps=con.prepareStatement(qry);
				ps.setString(1,addr);
				ps.setString(2,email);
				ps.setLong(3,phone);
				ps.setString(4,id);
				int udt=ps.executeUpdate();
				if(udt==1)
					act.setText("Updated");
				else
					act.setText("Disabled");
			}
			catch(Exception exp){
				act.setText("Error");
			}
		}
		else if(temp==3){
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
	}
}
class EntMark extends UnderOperation implements ActionListener{
	ImageIcon imag,setimag;
	Image scale;
	EntMark(){
		f1.setSize(1200,850);
		header=new JLabel("Marks Inputer");
		header.setFont(new Font("Arial",Font.BOLD,30));
		l1=new JLabel("Reg Number :");
		l1.setFont(new Font("Arial",Font.PLAIN,22));
		FacDet.inputChoice();
		l2=new JLabel("Semester :");
		l2.setFont(new Font("Arial",Font.PLAIN,22));
		l3=new JLabel("Subject");
		l3.setFont(new Font("Arial",Font.PLAIN,22));
		l4=new JLabel("Marks");
		l4.setFont(new Font("Arial",Font.PLAIN,22));
		btn1=new JButton("SUBMIT");
		btn1.setFont(new Font("Arial",Font.BOLD,22));
		btn1.setBackground(co1);
		btn1.setForeground(Color.WHITE);
		imag=new ImageIcon("Image/exam.jpg");
		scale=imag.getImage().getScaledInstance(600,630,Image.SCALE_DEFAULT);
		setimag=new ImageIcon(scale);
		l5=new JLabel(setimag);
		btn1.addActionListener(this);
		f1.add(header);
		f1.add(l1);
		f1.add(c1);
		f1.add(l2);
		f1.add(c2);
		c2.add("1");
		c2.add("2");
		c2.add("3");
		c2.add("4");
		c2.add("5");
		c2.add("6");
		c2.add("7");
		c2.add("8");
		f1.add(l3);
		f1.add(l4);
		f1.add(btn1);
		f1.add(l5);
		header.setBounds(500,50,290,50);
		act.setBounds(920,50,150,50);
		l1.setBounds(50,150,190,40);
		c1.setBounds(290,150,190,40);
		l2.setBounds(50,220,190,40);
		c2.setBounds(290,220,190,40);
		l3.setBounds(120,320,150,40);
		l4.setBounds(330,320,150,40);
		t1.setBounds(70,390,190,60);
		t2.setBounds(270,390,190,60);
		t3.setBounds(70,460,190,60);
		t4.setBounds(270,460,190,60);
		t5.setBounds(70,530,190,60);
		t6.setBounds(270,530,190,60);
		t7.setBounds(70,600,190,60);
		t8.setBounds(270,600,190,60);
		t9.setBounds(70,670,190,60);
		t10.setBounds(270,670,190,60);
		btn1.setBounds(160,750,180,50);
		l5.setBounds(530,130,600,630);
		f1.setLocation(350,110);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==btn1){
			if(t1.getText().equals("")||t2.getText().equals("")||t3.getText().equals("")||t4.getText().equals("")||t5.getText().equals("")||t6.getText().equals("")||t7.getText().equals("")||t8.getText().equals("")||t9.getText().equals("")||t10.getText().equals("")){
				JOptionPane.showMessageDialog(null,"Fill all Details");
				t1.requestFocus();
			}
			else{
				try{
					String id=c1.getSelectedItem().toString();
					int sem=Integer.parseInt(c2.getSelectedItem());
					String sub1=t1.getText();
					int mrk1=Integer.parseInt(t2.getText());
					String sub2=t3.getText();
					int mrk2=Integer.parseInt(t4.getText());
					String sub3=t5.getText();
					int mrk3=Integer.parseInt(t6.getText());
					String sub4=t7.getText();
					int mrk4=Integer.parseInt(t8.getText());
					String sub5=t9.getText();
					int mrk5=Integer.parseInt(t10.getText());
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost/management?user=root&pass=");
					String qry="insert into exam values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
					PreparedStatement ps=con.prepareStatement(qry);
					ps.setString(1,id);
					ps.setInt(2,sem);
					ps.setString(3,sub1);
					ps.setInt(4,mrk1);
					ps.setString(5,sub2);
					ps.setInt(6,mrk2);
					ps.setString(7,sub3);
					ps.setInt(8,mrk3);
					ps.setString(9,sub4);
					ps.setInt(10,mrk4);
					ps.setString(11,sub5);
					ps.setInt(12,mrk5);
					ps.setString(13,"");
					int udt=ps.executeUpdate();
					if(udt==1)
						act.setText("Processed");
					else 
						act.setText("Disabled");
				}
				catch(Exception exp){
					act.setText("Error");
				}
			}
		}
	}
}
class ResVw extends UnderOperation implements ActionListener{
	JPanel p1=new JPanel();
	int marks1,marks2,marks3,marks4,marks5;
	ResVw(){
		f1.setSize(1200,850);
		header=new JLabel("Examination Result");
		header.setFont(new Font("Arial",Font.BOLD,30));
		l1=new JLabel("Reg Number :");
		l1.setFont(new Font("Arial",Font.PLAIN,22));
		FacDet.inputChoice();
		btn1=new JButton("SEARCH");
		btn1.setFont(new Font("Arial",Font.BOLD,22));
		btn1.setBackground(co1);
		btn1.setForeground(Color.WHITE);
		btn2=new JButton("UPDATE");
		btn2.setFont(new Font("Arial",Font.BOLD,22));
		btn2.setBackground(co1);
		btn2.setForeground(Color.WHITE);
		l2=new JLabel("Name :");
		l2.setFont(new Font("Arial",Font.PLAIN,22));
		l3=new JLabel("");
		l3.setFont(new Font("Arial",Font.PLAIN,22));
		l4=new JLabel("Semester :");
		l4.setFont(new Font("Arial",Font.PLAIN,22));
		l5=new JLabel();
		l5.setFont(new Font("Arial",Font.PLAIN,22));
		l6=new JLabel("CGPA :");
		l6.setFont(new Font("Arial",Font.PLAIN,22));
		l7=new JLabel();
		l7.setFont(new Font("Arial",Font.PLAIN,22));
		l8=new JLabel("Birth Date :");
		l8.setFont(new Font("Arial",Font.PLAIN,22));
		l9=new JLabel();
		l9.setFont(new Font("Arial",Font.PLAIN,22));
		l10=new JLabel("Semester");
		l10.setFont(new Font("Arial",Font.PLAIN,22));
		l10.setForeground(Color.RED);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		f1.add(header);
		f1.add(l1);
		f1.add(c1);
		f1.add(btn1);
		f1.add(btn2);
		f1.add(l2);
		f1.add(l3);
		f1.add(l4);
		f1.add(l5);
		f1.add(l6);
		f1.add(l7);
		f1.add(l8);
		f1.add(l9);
		f1.add(l10);
		header.setBounds(500,50,290,50);
		act.setBounds(920,50,150,50);
		l1.setBounds(330,150,190,40);
		c1.setBounds(650,150,190,40);
		btn1.setBounds(350,210,180,60);
		btn2.setBounds(620,210,180,60);
		l2.setBounds(190,290,190,40);
		l3.setBounds(390,290,190,40);
		l4.setBounds(720,290,190,40);
		l5.setBounds(940,290,190,40);
		l6.setBounds(190,350,190,40);
		l7.setBounds(390,350,190,40);
		l8.setBounds(720,350,190,40);
		l9.setBounds(940,350,190,40);
		l10.setBounds(550,410,190,40);
		f1.setLocation(350,110);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==btn1){
			try{
				p1.setVisible(false);
				String id=c1.getSelectedItem().toString();
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/management?user=root&pass=");
				String qry="select name,birth from public where reg_id=?";
				PreparedStatement ps=con.prepareStatement(qry);
				ps.setString(1,id);
				ResultSet rs1=ps.executeQuery();
				while(rs1.next()){
					l3.setText(rs1.getString(1));
					l7.setText("9.3");
					l9.setText(rs1.getString(2));
				}
			}
			catch(Exception exp){
				act.setText("Error");
			}
			try{
				int i=0;
				String row1[][]=new String[1][10];
				String colo1[]={"1","Marks","2","Marks","3","Marks","4","Marks","5","Marks"};
				String id=c1.getSelectedItem().toString();
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/management?user=root&pass=");
				String qry="select sem,sub1,mrk1,sub2,mrk2,sub3,mrk3,sub4,mrk4,sub5,mrk5 from exam where reg_id=?";
				PreparedStatement ps=con.prepareStatement(qry);
				ps.setString(1,id);
				ResultSet rs=ps.executeQuery();
				while(rs.next()){
					l5.setText(rs.getString(1));
					row1[i][0]=rs.getString(2);
					row1[i][1]=Integer.toString(rs.getInt(3));
					row1[i][2]=rs.getString(4);
					row1[i][3]=Integer.toString(rs.getInt(5));
					row1[i][4]=rs.getString(6);
					row1[i][5]=Integer.toString(rs.getInt(7));
					row1[i][6]=rs.getString(8);
					row1[i][7]=Integer.toString(rs.getInt(9));
					row1[i][8]=rs.getString(10);
					row1[i++][9]=Integer.toString(rs.getInt(11));
				}
				tl1=new JTable(row1,colo1);
				tl1.setRowHeight(0,60);
				tl1.setFont(new Font("Arial",Font.PLAIN,22));
				sb1=new JScrollPane(tl1);
				f1.add(sb1);
				sb1.setBounds(20,500,1150,100);
			}
			catch(Exception exp1){
				act.setText("Error");
			}
		}
		else if(e.getSource()==btn2){
			p1.setVisible(true);
			p1.setBackground(Color.WHITE);
			String subs1="",subs2="",subs3="",subs4="",subs5="";
			try{
				String id=c1.getSelectedItem().toString();
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/management?user=root&pass=");
				String qry="select sub1,mrk1,sub2,mrk2,sub3,mrk3,sub4,mrk4,sub5,mrk5 from exam where reg_id=?";
				PreparedStatement ps=con.prepareStatement(qry);
				ps.setString(1,id);
				ResultSet rs=ps.executeQuery();
				while(rs.next()){
					subs1=rs.getString(1);
					subs2=rs.getString(3);
					subs3=rs.getString(5);
					subs4=rs.getString(7);
					subs5=rs.getString(9);
					marks1=rs.getInt(2);
					marks2=rs.getInt(4);
					marks3=rs.getInt(6);
					marks4=rs.getInt(8);
					marks5=rs.getInt(10);
				}
			}
			catch(Exception exp){
				act.setText("Error");
			}
			lg1=new JLabel(subs1);
			lg1.setFont(new Font("Arial",Font.PLAIN,22));
			lg2=new JLabel(subs2);
			lg2.setFont(new Font("Arial",Font.PLAIN,22));
			lg3=new JLabel(subs3);
			lg3.setFont(new Font("Arial",Font.PLAIN,22));
			lg4=new JLabel(subs4);
			lg4.setFont(new Font("Arial",Font.PLAIN,22));
			lg5=new JLabel(subs5);
			lg5.setFont(new Font("Arial",Font.PLAIN,22));
			btn3=new JButton("UPDATE");
			btn3.setFont(new Font("Arial",Font.BOLD,22));
			btn3.setBackground(co1);
			btn3.setForeground(Color.WHITE);
			btn3.addActionListener(this);
			p1.add(btn3);
			btn3.setBounds(730,150,190,60);
			f1.add(p1);
			p1.add(lg1);
			p1.add(t1);
			p1.add(lg2);
			p1.add(t2);
			p1.add(lg3);
			p1.add(t3);
			p1.add(lg4);
			p1.add(t4);
			p1.add(lg5);
			p1.add(t5);
			t1.setText(Integer.toString(marks1));
			t2.setText(Integer.toString(marks2));
			t3.setText(Integer.toString(marks3));
			t4.setText(Integer.toString(marks4));
			t5.setText(Integer.toString(marks5));
			p1.setBounds(20,500,1150,300);
			lg1.setBounds(180,80,150,40);
			t1.setBounds(380,80,150,40);
			lg2.setBounds(670,80,150,40);
			t2.setBounds(870,80,150,40);
			lg3.setBounds(180,140,150,40);
			t3.setBounds(380,140,150,40);
			lg4.setBounds(670,140,150,40);
			t4.setBounds(870,140,150,40);
			lg5.setBounds(180,190,150,40);
			t5.setBounds(380,190,150,40);
			p1.setVisible(true);
		}
		else if(e.getSource()==btn3){
			p1.setVisible(false);
			try{
				String id=c1.getSelectedItem().toString();
				marks1=Integer.parseInt(t1.getText());
				marks2=Integer.parseInt(t2.getText());
				marks3=Integer.parseInt(t3.getText());
				marks4=Integer.parseInt(t4.getText());
				marks5=Integer.parseInt(t5.getText());
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/management?user=root&pass=");
				String qry="update exam set mrk1=?,mrk2=?,mrk3=?,mrk4=?,mrk5=? where reg_id=?";
				PreparedStatement ps=con.prepareStatement(qry);
				ps.setInt(1,marks1);
				ps.setInt(2,marks2);
				ps.setInt(3,marks3);
				ps.setInt(4,marks4);
				ps.setInt(5,marks5);
				ps.setString(6,id);
				int udt=ps.executeUpdate();
				if(udt==1)
					act.setText("Updated");
				else
					act.setText("Disabled");
			}
			catch(Exception exp){
				act.setText("Error");
			}
		}
	}
}
class VwStu extends UnderOperation implements ActionListener{
	static JPanel p1=new JPanel();
	static String value1="",value2="";
	static int ptr=1;
	VwStu(){
		f1.setSize(1200,850);
		header=new JLabel("Student Leave");
		header.setFont(new Font("Arial",Font.BOLD,30));
		l1=new JLabel("Reg Number :");
		l1.setFont(new Font("Arial",Font.PLAIN,22));
		FacDet.inputChoice();
		btn1=new JButton("SEARCH");
		btn1.setFont(new Font("Arial",Font.BOLD,22));
		btn1.setBackground(co1);
		btn1.setForeground(Color.WHITE);
		btn2=new JButton("UPDATE");
		btn2.setFont(new Font("Arial",Font.BOLD,22));
		btn2.setBackground(co1);
		btn2.setForeground(Color.WHITE);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		f1.add(header);
		f1.add(l1);
		f1.add(c1);
		f1.add(btn1);
		f1.add(btn2);
		header.setBounds(500,50,290,50);
		act.setBounds(920,50,150,50);
		l1.setBounds(220,200,190,40);
		c1.setBounds(450,200,190,40);
		btn1.setBounds(240,300,180,60);
		btn2.setBounds(450,300,180,60);
		f1.setLocation(350,110);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==btn1){
			if(ptr==1){
				p1.setVisible(false);
				VwFac.myConnection(1);
				btn3=new JButton("Edit");
				btn3.setFont(new Font("Arival",Font.PLAIN,22));
				btn3.setBackground(co1);
				btn3.setForeground(Color.WHITE);
				f1.add(btn3);
				ptr=0;
				btn3.setBounds(500,650,200,60);
				btn3.addActionListener(this);
			}
		}
		else if(e.getSource()==btn2){
			VwFac.myConnection(2);
		}
		else if(e.getSource()==btn3){
			f1.remove(btn3);
			ptr=1;
			p1.setVisible(true);
			l2=new JLabel("Date :");
			l2.setFont(new Font("Arial",Font.PLAIN,22));
			l3=new JLabel("Duration :");
			l3.setFont(new Font("Arial",Font.PLAIN,22));
			f1.add(p1);
			p1.add(l2);
			p1.add(t1);
			p1.add(l3);
			p1.add(t2);
			p1.setBounds(200,650,1000,150);
			l2.setBounds(0,0,100,40);
			t1.setBounds(130,0,180,40);
			l3.setBounds(400,0,150,40);
			t2.setBounds(600,0,180,40);
			t1.setText(value1);
			t2.setText(value2);
			p1.setLayout(null);
		}
	}
}
class VwFac extends UnderOperation implements ActionListener{
	static JPanel p1=new JPanel();
	static String value1="",value2="";
	static int ptr=1;
	VwFac(){
		f1.setSize(1200,850);
		header=new JLabel("Faculty Leave");
		header.setFont(new Font("Arial",Font.BOLD,30));
		l1=new JLabel("Employee ID :");
		l1.setFont(new Font("Arial",Font.PLAIN,22));
		FacDet.inputChoice();
		btn1=new JButton("SEARCH");
		btn1.setFont(new Font("Arial",Font.BOLD,22));
		btn1.setBackground(co1);
		btn1.setForeground(Color.WHITE);
		btn2=new JButton("UPDATE");
		btn2.setFont(new Font("Arial",Font.BOLD,22));
		btn2.setBackground(co1);
		btn2.setForeground(Color.WHITE);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		f1.add(header);
		f1.add(l1);
		f1.add(c1);
		f1.add(btn1);
		f1.add(btn2);
		header.setBounds(500,50,290,50);
		act.setBounds(920,50,150,50);
		l1.setBounds(220,200,190,40);
		c1.setBounds(450,200,190,40);
		btn1.setBounds(240,300,180,60);
		btn2.setBounds(450,300,180,60);
		f1.setLocation(350,110);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==btn1){
			if(ptr==1){
				p1.setVisible(false);
				myConnection(1);
				btn3=new JButton("Edit");
				btn3.setFont(new Font("Arival",Font.PLAIN,22));
				btn3.setBackground(co1);
				btn3.setForeground(Color.WHITE);
				f1.add(btn3);
				ptr=0;
				btn3.setBounds(500,650,200,60);
				btn3.addActionListener(this);
			}
		}
		else if(e.getSource()==btn2){
			myConnection(2);
		}
		else if(e.getSource()==btn3){
			f1.remove(btn3);
			ptr=1;
			myConnection(3);
		}
	}
	static void myConnection(int temp){
		if(temp==1){
			try{
				String colo1[]={"Name","Date","Duration"};
				String id=c1.getSelectedItem().toString();
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/management?user=root&pass=");
				String qry="Select name,date,duration from public where reg_id=?";
				PreparedStatement ps=con.prepareStatement(qry);
				ps.setString(1,id);
				ResultSet rs=ps.executeQuery();
				int i=0;
				while(rs.next()){
					row[i][0]=rs.getString(1);
					row[i][1]=rs.getString(2);
					row[i++][2]=rs.getString(3);
				}
				tl1=new JTable(row,colo1);
				tl1.setRowHeight(0,60);
				tl1.setFont(new Font("Arial",Font.PLAIN,22));
				sb1=new JScrollPane(tl1);
				f1.add(sb1);
				sb1.setBounds(20,400,1130,100);
				value1=tl1.getValueAt(0,1).toString();
				value2=tl1.getValueAt(0,2).toString();
			}
			catch(Exception exp){
				value1="";
				value2="";
					
			}	
		}
		else if(temp==2){
			try{
				String date=t1.getText();
				int dur=Integer.parseInt(t2.getText());
				String id=c1.getSelectedItem().toString();
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/management?user=root&pass=");
				String qry="update public set date=?,duration=? where reg_id=?";
				PreparedStatement ps=con.prepareStatement(qry);
				ps.setString(1,date);
				ps.setInt(2,dur);
				ps.setString(3,id);
				int udt=ps.executeUpdate();
				if(udt==1)
					act.setText("Updated");
				else 
					act.setText("Disabled");
			}
			catch(Exception exp){
				act.setText("Error");
			}
		}
		else if(temp==3){
			p1.setVisible(true);
			l2=new JLabel("Date :");
			l2.setFont(new Font("Arial",Font.PLAIN,22));
			l3=new JLabel("Duration :");
			l3.setFont(new Font("Arial",Font.PLAIN,22));
			f1.add(p1);
			p1.add(l2);
			p1.add(t1);
			p1.add(l3);
			p1.add(t2);
			p1.setBounds(200,650,1000,150);
			l2.setBounds(0,0,100,40);
			t1.setBounds(130,0,180,40);
			l3.setBounds(400,0,150,40);
			t2.setBounds(600,0,180,40);
			t1.setText(value1);
			t2.setText(value2);
			p1.setLayout(null);
		}
	}
}
class StuLeav extends UnderOperation implements ActionListener{
	StuLeav(){
		f1.setSize(900,650);
		header=new JLabel("Apply Student");
		header.setFont(new Font("Arial",Font.BOLD,30));
		l1=new JLabel("Reg Number :");
		l1.setFont(new Font("Arial",Font.PLAIN,22));
		FacDet.inputChoice();
		l2=new JLabel("Date :");
		l2.setFont(new Font("Arial",Font.PLAIN,22));
		l3=new JLabel("Duration :");
		l3.setFont(new Font("Arial",Font.PLAIN,22));
		l4=new JLabel("/ Period");
		l4.setFont(new Font("Arial",Font.PLAIN,22));
		btn1=new JButton("SUBMIT");
		btn1.setFont(new Font("Arial",Font.BOLD,22));
		btn1.setBackground(co1);
		btn1.setForeground(Color.WHITE);
		btn2=new JButton("CANCEL");
		btn2.setFont(new Font("Arial",Font.BOLD,22));
		btn2.setBackground(co1);
		btn2.setForeground(Color.WHITE);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		f1.add(header);
		f1.add(l1);
		f1.add(c1);
		f1.add(l2);
		f1.add(l3);
		f1.add(l4);
		f1.add(btn1);
		f1.add(btn2);
		header.setBounds(355,50,290,50);
		act.setBounds(700,50,150,50);
		l1.setBounds(220,200,190,40);
		c1.setBounds(480,200,190,40);
		l2.setBounds(220,280,190,40);
		t1.setBounds(480,280,190,40);
		l3.setBounds(220,360,190,40);
		t2.setBounds(480,360,190,40);
		l4.setBounds(700,360,190,40);
		btn1.setBounds(250,450,150,60);
		btn2.setBounds(490,450,150,60);
		f1.setLocation(460,180);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==btn1){
			if(t1.getText().equals("")||t2.getText().equals("")){
				JOptionPane.showMessageDialog(null,"Fill all Details");
				t1.requestFocus();
			}
			else 
				FacLeav.myConnection();
		}
		else if(e.getSource()==btn2)
			f1.setVisible(false);
	}
}
class FacLeav extends UnderOperation implements ActionListener{
	FacLeav(){
		f1.setSize(900,650);
		header=new JLabel("Apply Faculty");
		header.setFont(new Font("Arial",Font.BOLD,30));
		l1=new JLabel("Employee ID :");
		l1.setFont(new Font("Arial",Font.PLAIN,22));
		FacDet.inputChoice();
		l2=new JLabel("Date :");
		l2.setFont(new Font("Arial",Font.PLAIN,22));
		l3=new JLabel("Duration :");
		l3.setFont(new Font("Arial",Font.PLAIN,22));
		l4=new JLabel("/ Period");
		l4.setFont(new Font("Arial",Font.PLAIN,22));
		btn1=new JButton("SUBMIT");
		btn1.setFont(new Font("Arial",Font.BOLD,22));
		btn1.setBackground(co1);
		btn1.setForeground(Color.WHITE);
		btn2=new JButton("CANCEL");
		btn2.setFont(new Font("Arial",Font.BOLD,22));
		btn2.setBackground(co1);
		btn2.setForeground(Color.WHITE);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		f1.add(header);
		f1.add(l1);
		f1.add(c1);
		f1.add(l2);
		f1.add(l3);
		f1.add(l4);
		f1.add(btn1);
		f1.add(btn2);
		header.setBounds(355,50,290,50);
		act.setBounds(700,50,150,50);
		l1.setBounds(220,200,190,40);
		c1.setBounds(480,200,190,40);
		l2.setBounds(220,280,190,40);
		t1.setBounds(480,280,190,40);
		l3.setBounds(220,360,190,40);
		t2.setBounds(480,360,190,40);
		l4.setBounds(700,360,190,40);
		btn1.setBounds(250,450,150,60);
		btn2.setBounds(490,450,150,60);
		f1.setLocation(460,180);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==btn1){
			if(t1.getText().equals("")||t2.getText().equals("")){
				JOptionPane.showMessageDialog(null,"Fill all Details");
				t1.requestFocus();
			}
			else
				myConnection();
		}
		else if(e.getSource()==btn2)
			f1.setVisible(false);
	}
	static void myConnection(){
		try{
			String date=t1.getText();
			int dur=Integer.parseInt(t2.getText());
			String id=c1.getSelectedItem().toString();
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/management?user=root&pass=");
			String qry="update public set date=?,duration=? where reg_id=?";
			PreparedStatement ps=con.prepareStatement(qry);
			ps.setString(1,date);
			ps.setInt(2,dur);	
			ps.setString(3,id);
			int udt=ps.executeUpdate();
			if(udt==1)
				act.setText("Approved");
			else
				act.setText("Rejected");
		}
		catch(Exception exp){
			act.setText("Error");
		}
	}
}
class StuDet extends UnderOperation implements ActionListener{
	StuDet(){
		f1.setSize(1200,850);
		header=new JLabel("Student Details");
		header.setFont(new Font("Arial",Font.BOLD,30));
		l1=new JLabel("Reg Number :");
		FacDet.inputChoice();
		l1.setFont(new Font("Arial",Font.PLAIN,22));
		btn1=new JButton("SEARCH");
		btn1.setFont(new Font("Arial",Font.PLAIN,22));
		btn1.setBackground(co1);
		btn1.setForeground(Color.WHITE);
		btn2=new JButton("REMOVE");
		btn2.setFont(new Font("Arial",Font.PLAIN,22));
		btn2.setBackground(co1);
		btn2.setForeground(Color.WHITE);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		f1.add(header);
		f1.add(l1);
		f1.add(c1);
		f1.add(btn1);
		f1.add(btn2);
		header.setBounds(500,50,290,50);
		act.setBounds(920,50,150,50);
		l1.setBounds(220,200,190,40);
		c1.setBounds(450,200,190,40);
		btn1.setBounds(240,300,180,60);
		btn2.setBounds(450,300,180,60);
		f1.setLocation(350,110);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==btn1)
			FacDet.myConnection(1);
		else if(e.getSource()==btn2)
			FacDet.myConnection(2);
	}
}
class FacDet extends UnderOperation implements ActionListener{
	FacDet(){
		f1.setSize(1200,850);
		header=new JLabel("Faculty Details");
		header.setFont(new Font("Arial",Font.BOLD,30));
		l1=new JLabel("Employee ID :");
		l1.setFont(new Font("Arial",Font.PLAIN,22));
		inputChoice();
		btn1=new JButton("SEARCH");
		btn1.setFont(new Font("Arial",Font.BOLD,22));
		btn1.setBackground(co1);
		btn1.setForeground(Color.WHITE);
		btn2=new JButton("REMOVE");
		btn2.setFont(new Font("Arial",Font.BOLD,22));
		btn2.setBackground(co1);
		btn2.setForeground(Color.WHITE);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		f1.add(header);
		f1.add(l1);
		f1.add(c1);
		f1.add(btn1);
		f1.add(btn2);
		header.setBounds(500,50,290,50);
		act.setBounds(920,50,150,50);
		l1.setBounds(220,200,190,40);
		c1.setBounds(450,200,190,40);
		btn1.setBounds(240,300,180,60);
		btn2.setBounds(450,300,180,60);
		f1.setLocation(350,110);
	}
	static void inputChoice(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/management?user=root&pass=");
			String qry=header.getText().substring(0,7).equals("Faculty")||header.getText().substring(6,13).equals("Faculty")?("select reg_id from public where power='Faculty'"):("select reg_id from public where power='Student'");
			PreparedStatement ps=con.prepareStatement(qry);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				c1.add(rs.getString(1));
			}
		}
		catch(Exception exp){
			act.setText("Error");
		}
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==btn1)
			myConnection(1);
		else if(e.getSource()==btn2)
			myConnection(2);
			
	}
	static void myConnection(int temp){
		if(temp==1){
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/management?user=root&pass=");
				String	id=c1.getSelectedItem().toString();
				String qry="select name,address,email,aadhar,birth,phone,xii from public where reg_id=?";
				PreparedStatement ps=con.prepareStatement(qry);
				ps.setString(1,id);
				ResultSet rs=ps.executeQuery();
				int i=0;
				while(rs.next()){
					row[i][0]=rs.getString(1);
					row[i][1]=rs.getString(2);
					row[i][2]=rs.getString(3);
					row[i][3]=Long.toString(rs.getLong(4));
					row[i][4]=rs.getString(5);
					row[i][5]=Long.toString(rs.getLong(6));
					row[i++][6]=Integer.toString(rs.getInt(7));	
				}
				tl1=new JTable(row,colo);
				for(int j=0;j<i;j++)
					tl1.setRowHeight(j, 64);
				tl1.getColumnModel().getColumn(0).setPreferredWidth(20);
				tl1.setFont(new Font("Arial",Font.PLAIN,22));
				sb1=new JScrollPane(tl1);
				f1.add(sb1);
				sb1.setBounds(20,430,1130,100);
			}
			catch(Exception exp){
				act.setText("Error");
			}
		}
		else{
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/management?user=root&pass=");
				String	id=c1.getSelectedItem().toString();
				String qry="delete from public where reg_id=?";
				PreparedStatement ps=con.prepareStatement(qry);
				ps.setString(1,id);
				int udt=ps.executeUpdate();
				if(udt==1){
					act.setText("Removed");
					JOptionPane.showMessageDialog(null,"Refresh it");
				}
				else
					act.setText("No Connection....");
			}
			catch(Exception exp){
				act.setText("Error");
			}
		}
	}
}
class StuInfo extends UnderOperation implements ActionListener{
	StuInfo(){
		f1.setSize(1200,850);
		header=new JLabel("Student Enrollment");
		header.setFont(new Font("Arial",Font.PLAIN,30));
		l1=new JLabel("Name :");
		l1.setFont(new Font("Arial",Font.PLAIN,22));
		l2=new JLabel("Reg Number :");
		l2.setFont(new Font("Arial",Font.PLAIN,22));
		l3=new JLabel("Address :");
		l3.setFont(new Font("Arial",Font.PLAIN,22));
		l4=new JLabel("Email :");
		l4.setFont(new Font("Arial",Font.PLAIN,22));
		l5=new JLabel("XII(%) :");
		l5.setFont(new Font("Arial",Font.PLAIN,22));
		l6=new JLabel("Aadhar ID :");
		l6.setFont(new Font("Arial",Font.PLAIN,22));
		l7=new JLabel("Birth Date :");
		l7.setFont(new Font("Arial",Font.PLAIN,22));
		l8=new JLabel("Phone :");
		l8.setFont(new Font("Arial",Font.PLAIN,22));
		l9=new JLabel("X(%) :");
		l9.setFont(new Font("Arial",Font.PLAIN,22));
		l10=new JLabel("Branch :");
		l10.setFont(new Font("Arial",Font.PLAIN,22));
		btn1=new JButton("SUBMIT");
		btn1.setFont(new Font("Arial",Font.BOLD,22));
		btn1.setBackground(co1);
		btn1.setForeground(Color.WHITE);
		btn2=new JButton("CANCEL");
		btn2.setFont(new Font("Arial",Font.BOLD,22));
		btn2.setBackground(co1);
		btn2.setForeground(Color.WHITE);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		f1.add(header);
		f1.add(l1);
		f1.add(l2);
		f1.add(l3);
		f1.add(l4);
		f1.add(l5);
		f1.add(l6);
		f1.add(l7);
		f1.add(l8);
		f1.add(l9);
		f1.add(l10);
		f1.add(c1);
		c1.add("CSE");
		c1.add("IT");
		c1.add("Mechanical");
		c1.add("Electrical");
		f1.add(btn1);
		f1.add(btn2);
		header.setBounds(500,50,290,50);
		act.setBounds(920,50,150,50);
		l1.setBounds(120,150,190,40);
		t1.setBounds(320,150,190,40);
		l2.setBounds(120,250,190,40);
		t2.setBounds(320,250,190,40);
		l3.setBounds(120,350,190,40);
		t3.setBounds(320,350,190,40);
		l4.setBounds(120,450,190,40);
		t4.setBounds(320,450,190,40);
		l5.setBounds(120,550,190,40);
		t5.setBounds(320,550,190,40);
		l6.setBounds(670,150,190,40);
		t6.setBounds(870,150,190,40);
		l7.setBounds(670,250,190,40);
		t7.setBounds(870,250,190,40);
		l8.setBounds(670,350,190,40);
		t8.setBounds(870,350,190,40);
		l9.setBounds(670,450,190,40);
		t9.setBounds(870,450,190,40);
		l10.setBounds(670,550,190,40);
		c1.setBounds(870,550,190,40);
		btn1.setBounds(260,670,200,60);
		btn2.setBounds(720,670,200,60);
		f1.setLocation(350,110);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==btn1){
			if(t1.getText().equals("")||t2.getText().equals("")||t3.getText().equals("")||t4.getText().equals("")||t5.getText().equals("")||t6.getText().equals("")||t7.getText().equals("")||t8.getText().equals("")||t9.getText().equals("")){
				JOptionPane.showMessageDialog(null,"Fill all Details");
				t1.requestFocus();
			}
			else
				TeacInfo.myConnection();
		}
		else if(e.getSource()==btn2)
			f1.setVisible(false);
	}
}
class TeacInfo extends UnderOperation implements ActionListener{
	TeacInfo(){
		f1.setSize(1200,850);
		header=new JLabel("Faculty Enrollment");
		header.setFont(new Font("Arial",Font.PLAIN,30));
		l1=new JLabel("Name :");
		l1.setFont(new Font("Arial",Font.PLAIN,22));
		l2=new JLabel("Reg ID :");
		l2.setFont(new Font("Arial",Font.PLAIN,22));
		l3=new JLabel("Address :");
		l3.setFont(new Font("Arial",Font.PLAIN,22));
		l4=new JLabel("Email :");
		l4.setFont(new Font("Arial",Font.PLAIN,22));
		l5=new JLabel("XII(%) :");
		l5.setFont(new Font("Arial",Font.PLAIN,22));
		l6=new JLabel("Aadhar ID :");
		l6.setFont(new Font("Arial",Font.PLAIN,22));
		l7=new JLabel("Birth Date :");
		l7.setFont(new Font("Arial",Font.PLAIN,22));
		l8=new JLabel("Phone :");
		l8.setFont(new Font("Arial",Font.PLAIN,22));
		l9=new JLabel("X(%) :");
		l9.setFont(new Font("Arial",Font.PLAIN,22));
		l10=new JLabel("Department :");
		l10.setFont(new Font("Arial",Font.PLAIN,22));
		btn1=new JButton("SUBMIT");
		btn1.setFont(new Font("Arial",Font.BOLD,22));
		btn1.setBackground(co1);
		btn1.setForeground(Color.WHITE);
		btn2=new JButton("CANCEL");
		btn2.setFont(new Font("Arial",Font.BOLD,22));
		btn2.setBackground(co1);
		btn2.setForeground(Color.WHITE);
		f1.add(header);
		f1.add(l1);
		f1.add(l2);
		f1.add(l3);
		f1.add(l4);
		f1.add(l5);
		f1.add(l6);
		f1.add(l7);
		f1.add(l8);
		f1.add(l9);
		f1.add(l10);
		f1.add(c1);
		c1.add("CSE");
		c1.add("IT");
		c1.add("Mechanical");
		c1.add("Electrical");
		f1.add(btn1);
		f1.add(btn2);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		header.setBounds(500,50,250,50);
		act.setBounds(920,50,150,50);
		l1.setBounds(120,150,190,40);
		t1.setBounds(320,150,190,40);
		l2.setBounds(120,250,190,40);
		t2.setBounds(320,250,190,40);
		l3.setBounds(120,350,190,40);
		t3.setBounds(320,350,190,40);
		l4.setBounds(120,450,190,40);
		t4.setBounds(320,450,190,40);
		l5.setBounds(120,550,190,40);
		t5.setBounds(320,550,190,40);
		l6.setBounds(670,150,190,40);
		t6.setBounds(870,150,190,40);
		l7.setBounds(670,250,190,40);
		t7.setBounds(870,250,190,40);
		l8.setBounds(670,350,190,40);
		t8.setBounds(870,350,190,40);
		l9.setBounds(670,450,190,40);
		t9.setBounds(870,450,190,40);
		l10.setBounds(670,550,190,40);
		c1.setBounds(870,550,190,40);
		btn1.setBounds(260,670,200,60);
		btn2.setBounds(720,670,200,60);
		f1.setLocation(350,110);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==btn1){
			if(t1.getText().equals("")||t2.getText().equals("")||t3.getText().equals("")||t4.getText().equals("")||t5.getText().equals("")||t6.getText().equals("")||t7.getText().equals("")||t8.getText().equals("")||t9.getText().equals("")){
				JOptionPane.showMessageDialog(null,"Fill all Details");
				t1.requestFocus();
			}
			else{
				myConnection();
			}
		}
		else if(e.getSource()==btn2){
			f1.setVisible(false);
		}
	}
	static void myConnection(){
		try{
			String name=t1.getText();
			String reg_id=t2.getText();
			String addr=t3.getText();
			String email=t4.getText();
			int mark1=Integer.parseInt(t5.getText());
			long adhar=Long.parseLong(t6.getText());
			String dob=t7.getText();
			long phone=Long.parseLong(t8.getText());
			int mark2=Integer.parseInt(t9.getText());
			String depart=c1.getSelectedItem().toString();
			String power=header.getText().substring(0,7);
			String date="";
			int dur=0;
			String prob="";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/management?user=root&pass=");
			String qry="insert into public values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(qry);
			ps.setString(1,name);
			ps.setString(2,reg_id);
			ps.setString(3,addr);
			ps.setString(4,email);
			ps.setInt(5,mark1);
			ps.setLong(6,adhar);
			ps.setString(7,dob);
			ps.setLong(8,phone);
			ps.setInt(9,mark2);
			ps.setString(10,depart);
			ps.setString(11,power);
			ps.setString(12,date);
			ps.setInt(13,dur);
			ps.setString(14,prob);
			int udt=ps.executeUpdate();
			if(udt==1)
				act.setText("Activated");
			else
				act.setText("No Connection....");
		}
		catch(Exception exp){
			act.setText("Error");
		}
	}
}
class UnderOperation{
	Color co1=new Color(0,0,153);
	static String row[][]=new String[1][7];
	static String colo[]={"Name","Address","Email","Adhar","Birth","Phone","XII"};
	static JFrame f1;
	static JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,lg1,lg2,lg3,lg4,lg5,lg6,lg7,header,act;
	static JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
	static Choice c1,c2;
	static JButton btn1,btn2,btn3;
	static JTable tl1;
	static JScrollPane sb1;
	UnderOperation(){
		f1=new JFrame();
		act=new JLabel("");
		act.setFont(new Font("Arial",Font.BOLD,25));
		act.setForeground(Color.GREEN);
		t1=new JTextField();
		t1.setFont(new Font("Arial",Font.PLAIN,22));
		t2=new JTextField();
		t2.setFont(new Font("Arial",Font.PLAIN,22));
		t3=new JTextField();
		t3.setFont(new Font("Arial",Font.PLAIN,22));
		t4=new JTextField();
		t4.setFont(new Font("Arial",Font.PLAIN,22));
		t5=new JTextField();
		t5.setFont(new Font("Arial",Font.PLAIN,22));
		t6=new JTextField();
		t6.setFont(new Font("Arial",Font.PLAIN,22));
		t7=new JTextField();
		t7.setFont(new Font("Arial",Font.PLAIN,22));
		t8=new JTextField();
		t8.setFont(new Font("Arial",Font.PLAIN,22));
		t9=new JTextField();
		t9.setFont(new Font("Arial",Font.PLAIN,22));
		t10=new JTextField();
		t10.setFont(new Font("Arial",Font.PLAIN,22));
		c1=new Choice();
		c1.setFont(new Font("Arial",Font.PLAIN,22));
		c2=new Choice();
		c2.setFont(new Font("Arial",Font.PLAIN,22));
		f1.add(act);
		f1.add(t1);
		f1.add(t2);
		f1.add(t3);
		f1.add(t4);
		f1.add(t5);
		f1.add(t6);
		f1.add(t7);
		f1.add(t8);
		f1.add(t9);
		f1.add(t10);
		f1.setLayout(null);
		f1.setVisible(true);
	}
}
class ManagementPage implements ActionListener{
	JFrame f1;
	ImageIcon imag,setimag;
	Image scale;
	JLabel l1;
	JMenuBar mb1;
	JMenu ni,vd,al,ld,exam,ud,fd,utility,exit1;
	JMenuItem mi0,mi1,mi2,mi3,mi4,mi5,mi6,mi7,mi8,mi9,mi10,mi11,mi12,mi13,mi14,mi15;
	ManagementPage(){
		f1=new JFrame();
		f1.setSize(1950,1090);
		mb1=new JMenuBar();
		ni=new JMenu("New Information");
		mi0=new JMenuItem("New Faculty Information");
		mi1=new JMenuItem("New Student Information");
		vd=new JMenu("View Details");
		mi2=new JMenuItem("Faculty Details");
		mi3=new JMenuItem("Students Details");
		al=new JMenu("Apply Leave");
		mi4=new JMenuItem("Faulty Leave");
		mi5=new JMenuItem("Student Leave");
		ld=new JMenu("Leave Details");
		mi6=new JMenuItem("View Faculty");
		mi7=new JMenuItem("View Student");
		exam=new JMenu("Examination");
		mi8=new JMenuItem("Result");
		mi9=new JMenuItem("Enter Marks");
		ud=new JMenu("Update Details");
		mi10=new JMenuItem("Update Faculty");
		mi11=new JMenuItem("Update Student");
		fd=new JMenu("Fee Details");
		mi12=new JMenuItem("View Structure");
		mi13=new JMenuItem("Fee Form");
		utility=new JMenu("Utility");
		mi14=new JMenuItem("Util View");
		exit1=new JMenu("Exit");
		mi15=new JMenuItem("Exit");
		imag=new ImageIcon("Image/third.jpg");
		scale=imag.getImage().getScaledInstance(1950,1090,Image.SCALE_DEFAULT);
		setimag=new ImageIcon(scale);
		l1=new JLabel(setimag);
		f1.setJMenuBar(mb1);
		f1.add(l1);
		mb1.add(ni);
		ni.add(mi0);
		ni.add(mi1);
		mb1.add(vd);
		vd.add(mi2);
		vd.add(mi3);
		mb1.add(al);
		al.add(mi4);
		al.add(mi5);
		mb1.add(ld);
		ld.add(mi6);
		ld.add(mi7);
		mb1.add(exam);
		exam.add(mi8);
		exam.add(mi9);
		mb1.add(ud);
		ud.add(mi10);
		ud.add(mi11);
		mb1.add(fd);
		fd.add(mi12);
		fd.add(mi13);
		mb1.add(utility);
		utility.add(mi14);
		mb1.add(exit1);
		exit1.add(mi15);
		mi0.addActionListener(this);
		mi1.addActionListener(this);
		mi2.addActionListener(this);
		mi3.addActionListener(this);
		mi4.addActionListener(this);
		mi5.addActionListener(this);
		mi6.addActionListener(this);
		mi7.addActionListener(this);
		mi8.addActionListener(this);
		mi9.addActionListener(this);
		mi10.addActionListener(this);
		mi11.addActionListener(this);
		mi12.addActionListener(this);
		mi13.addActionListener(this);
		mi14.addActionListener(this);
		mi15.addActionListener(this);
		l1.setBounds(0,0,1940,990);
		f1.setLocation(-8,-2);
		f1.setLayout(null);
		f1.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==mi0)
			new TeacInfo();
		else if(e.getSource()==mi1)
			new StuInfo();
		else if(e.getSource()==mi2)
			new FacDet();
		else if(e.getSource()==mi3)
			new StuDet();
		else if(e.getSource()==mi4)
			new FacLeav();
		else if(e.getSource()==mi5)
			new StuLeav();
		else if(e.getSource()==mi6)
			new VwFac();
		else if(e.getSource()==mi7)
			new VwStu();
		else if(e.getSource()==mi8)
			new ResVw();
		else if(e.getSource()==mi9)
			new EntMark();
		else if(e.getSource()==mi10)
			new UpdFac();
		else if(e.getSource()==mi11)
			new UpdStu();
		else if(e.getSource()==mi12)
			new VwStruc();
		else if(e.getSource()==mi13)
			new FeeForm();
		else if(e.getSource()==mi14)
			new UtilVw();
		else if(e.getSource()==mi15)
			System.exit(0);
	}
}
class LoginPage implements ActionListener{
	JFrame f1;
	JPanel p1;
	JLabel l1,l2,l5,act;
	JTextField t1,t2;
	JButton b1,b2,b3;
	ImageIcon imag,setimag;
	Image scale;
	LoginPage(){
		f1=new JFrame("University Management System.");
		f1.setSize(920,450);
		p1=new JPanel();
		p1.setBackground(Color.WHITE);
		act=new JLabel();
		act.setFont(new Font("Arial",Font.BOLD,24));
		act.setForeground(Color.GREEN);
		l1=new JLabel("USERNAME");
		l1.setFont(new Font("Arial",Font.PLAIN,20));
		t1=new JTextField();
		l2=new JLabel("PASSWORD");
		l2.setFont(new Font("Arial",Font.PLAIN,20));
		t2=new JTextField();
		b1=new JButton("LOGIN");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b2=new JButton("RESET");
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b3=new JButton("EXIT");
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);
		imag=new ImageIcon("Image/Second.jpg");
		scale=imag.getImage().getScaledInstance(420,350,Image.SCALE_DEFAULT);
		setimag=new ImageIcon(scale);
		l5=new JLabel(setimag);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		f1.add(p1);
		p1.add(act);
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(l5);
		p1.setBounds(0,0,920,450);
		act.setBounds(700,20,100,40);
		l1.setBounds(100,3,150,200);
		t1.setBounds(300,70,190,50);
		l2.setBounds(100,80,150,200);
		t2.setBounds(300,155,190,50);
		b1.setBounds(140,250,130,50);
		b2.setBounds(330,250,130,50);
		b3.setBounds(245,320,130,50);
		l5.setBounds(580,50,300,300);
		f1.setLocation(450,300);
		f1.setLayout(null);
		p1.setLayout(null);
		f1.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			String name=t1.getText();
			String pass=t2.getText();
			if(name.equals("admin")&&pass.equals("admin")){
				f1.setVisible(false);
				new ManagementPage();
			}
			else{
				act.setText("Invalid");
			}
		}
		else if(e.getSource()==b2){
			t1.setText("");
			t2.setText("");
		}
		else if(e.getSource()==b3){
			JOptionPane.showMessageDialog(null,"Confirm Exit");
			System.exit(0);
		}
	}
}
class StarterPage{
	JFrame f1;
	JLabel l1;
	ImageIcon imag,setimag;
	Image scale;
	JProgressBar jb1;
	Timer t1;
	StarterPage(){
		f1=new JFrame();
		f1.setSize(1750,900);
		imag=new ImageIcon("Image/first.jpg");
		scale=imag.getImage().getScaledInstance(1750,900,Image.SCALE_DEFAULT);
		setimag=new ImageIcon(scale);
		l1=new JLabel(setimag);
		jb1=new JProgressBar();
		jb1.setForeground(Color.BLACK);
		t1=new Timer(1000,new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				if(jb1.getValue()<100){
					jb1.setValue(jb1.getValue()+50);
				}
				else{
					t1.stop();
					f1.dispose();
					new LoginPage();
				}
			}
		});
		f1.add(l1);
		f1.add(jb1);
		l1.setBounds(0,0,1750,900);
		jb1.setBounds(1500,825,150,18);
		f1.setLocation(80,70);
		t1.start();
		f1.setLayout(null);
		f1.setVisible(true);
	}
}
class UniversityManagement{
	public static void main(String arr[]){
		new StarterPage();
	}
}