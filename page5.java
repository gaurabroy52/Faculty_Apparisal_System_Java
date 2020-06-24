package project;
import java.util.Scanner;

import javax.accessibility.Accessible;
import javax.swing.*;

import java.awt.Font;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class page5 {
	static String sirname="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f5=new JFrame("Student Page");
		JLabel l9;
		l9=new JLabel("Student Name");
		l9.setBounds(10,15,100,20);
		l9.setFont(new Font("Sylfaen",Font.PLAIN,16));
		f5.add(l9);
		JTextField tf4;
		tf4=new JTextField("Enter your name");
		tf4.setBounds(10,32,115,45);
		f5.add(tf4);
		JLabel l10;
		l10=new JLabel("ID....");
		l10.setBounds(10,82,60,20);
		l10.setFont(new Font("Sylfaen",Font.PLAIN,16));
		f5.add(l10);
		Integer b;
		b=(int)(Math.random()*100);
		
	
		JTextField tf5;
		tf5=new JTextField();
		tf5.setBounds(10,100,110,40);
		
		f5.add(tf5);
		JLabel l11;
		l11=new JLabel("Date(dd/mm/yyyy)");
		l11.setBounds(10,150,130,40);
		l11.setFont(new Font("Sylfaen",Font.PLAIN,16));
		f5.add(l11);
		String[] dd= {"1","2","3","4","5","6","7","8","9","10","11",
				"12","13","14","15","16","17","18","19","20","21",
				"22","23","24","25","26","27","28","29","30","31"};
		JComboBox cb1=new JComboBox(dd);
		cb1.setBounds(10,180,50,30);
		f5.add(cb1);
		String[] mm= {"1","2","3","4","5","6","7","8","9","10","11","12"};
		JComboBox cb2=new JComboBox(mm);
		cb2.setBounds(70,180,50,30);
		f5.add(cb2);
		String[] yyyy= {"2016","2017","2018","2019","2020","2021","2022",
				"2023","2024","2025","2026","2027","2028","2029","2030"};
		JComboBox cb3=new JComboBox(yyyy);
		cb3.setBounds(130,180,80,30);
		f5.add(cb3);
		JLabel l12;
		l12=new JLabel("Semester");
		l12.setBounds(10,225,100,20);
		l12.setFont(new Font("Sylfaen",Font.PLAIN,16));
		f5.add(l12);
		String[] sem= {"1st","2nd","3rd","4th","5th","6th","7th","8th"};
		JComboBox cb4=new JComboBox(sem);
		cb4.setBounds(10,245,150,30);
		f5.add(cb4);
		JLabel l13;
		l13=new JLabel("Select Faculty");
		l13.setBounds(10,290,130,20);
		l13.setFont(new Font("Sylfaen",Font.PLAIN,18));
		f5.add(l13);
		JLabel l14;
		l14=new JLabel();
		l14.setBounds(10,300,200,50);
		f5.add(l14);
		JMenuBar mb=new JMenuBar();
		mb.setBounds(10, 375, 70, 50);
		
		JMenu set=new JMenu("Click Here");
		mb.setFont(new Font("Times New Roman",Font.ITALIC,28));
		
		JMenu cse=new JMenu("CSE Dept");
		JMenu ece=new JMenu("ECE Dept");
		JMenu ee=new JMenu("EE Dept");
		JMenu me=new JMenu("ME Dept");
		JMenu ce=new JMenu("CE Dept");
		JMenu math=new JMenu("Math Dept");
		JMenu phy=new JMenu("PHYSICS Dept");
		JMenu chm=new JMenu("CHEMISTRY Dept");
		JMenu eng=new JMenu("ENGLISH Dept");
		JMenu eco=new JMenu("ECONOMICS Dept");
		JMenuItem i1=new JMenuItem("Dr. Sourav De");
		JMenuItem i2=new JMenuItem("Dr. Sudip Adhikari");
		JMenuItem i3=new JMenuItem("Mr. Sukhendu Shekhar Mondal");
		JMenuItem i4=new JMenuItem("Mr. Soumen Mondal");
		JMenuItem i5=new JMenuItem("Mr. Arnab Gain");
		JMenuItem i6=new JMenuItem("Dr. Prasenjit Dey");
		cse.add(i1);
		cse.add(i2);
		cse.add(i3);
		cse.add(i4);
		cse.add(i5);
		cse.add(i6);
		JMenuItem i7=new JMenuItem("Dr. Sorrish Sanyal");
		JMenuItem i8=new JMenuItem("Dr. Goutam Das");
		JMenuItem i9=new JMenuItem("Dr. Aritra Acharyya");
		ece.add(i7);
		ece.add(i8);
		ece.add(i9);
		JMenuItem i10=new JMenuItem("Dr. Prabal Deb");
		JMenuItem i11=new JMenuItem("Sk Rabiul Hossain");
		JMenuItem i12=new JMenuItem("Mr. Atanu Maji");
		JMenuItem i13=new JMenuItem("Mr. Tanumay Halder");
		JMenuItem i14=new JMenuItem("Saptaparna Basu Roy Chowdhury");
		ee.add(i10);
		ee.add(i11);
		ee.add(i12);
		ee.add(i13);
		ee.add(i14);
		JMenuItem i15=new JMenuItem("Dr. Sushovan Chatterjee");
		JMenuItem i16=new JMenuItem("Mr. Dibyedu Das");
		JMenuItem i17=new JMenuItem("Mr. Gyan Tshering Lapcha");
		JMenuItem i18=new JMenuItem("Mr. Prasenjit Das");
		me.add(i15);
		me.add(i16);
		me.add(i17);
		me.add(i18);
		JMenuItem i19=new JMenuItem("Dr. Suman Koner");
		JMenuItem i20=new JMenuItem("Mr. Biren Gurung");
		JMenuItem i21=new JMenuItem("Dr. Kingshuk Dan");
		JMenuItem i22=new JMenuItem("Md Asif Sk");
		JMenuItem i23=new JMenuItem("Mr. Shamol Ghosh");
		ce.add(i19);
		ce.add(i20);
		ce.add(i21);
		ce.add(i22);
		ce.add(i23);
		JMenuItem i24=new JMenuItem("Mr. Mohsmmsd Salim");
		math.add(i24);
		JMenuItem i25=new JMenuItem("Mr. Suman Sadhukan");
		JMenuItem i26=new JMenuItem("Mr. Amit Singha Roy");
		phy.add(i25);
		phy.add(i26);
		JMenuItem i27=new JMenuItem("Dr. Sumik Nag");
		chm.add(i27);
		JMenuItem i28=new JMenuItem("Mr. Argha Chakraborty");
		eng.add(i28);
		JMenuItem i29=new JMenuItem("Mrs. Madhuchandra Bhadui");
		eco.add(i29);
		
		set.add(cse);
		set.add(ece);
		set.add(ee);
		set.add(me);
		set.add(ce);
		set.add(math);
		set.add(phy);
		set.add(chm);
		set.add(eng);
		set.add(eco);
		mb.add(set);
		f5.add(mb);
		
		
		i1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sirname="Dr. Sourav De";
				l14.setText("Dr. Sourav De");
			}
		});
		
		i2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sirname="Dr. Sudip Adhikari";
				l14.setText("Dr. Sudip Adhikari");
			}
		});
		i3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sirname="Mr. Sukhendu Shekhar Mondal";
				l14.setText("Mr. Sukhendu Shekhar Mondal");
			}
		});
		i4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sirname="Mr. Soumen Mondal";
				l14.setText("Mr. Soumen Mondal");
			}
		});
		i5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sirname="Mr. Arnab Gain";
				l14.setText("Mr. Arnab Gain");
			}
		});
		i6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sirname="Dr. Prasenjit Dey";
				l14.setText("Dr. Prasenjit Dey");
			}
		});
		i7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sirname="Dr. Sorrish Sanyal";
				l14.setText("Dr. Sorrish Sanyal");
			}
		});
		i8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sirname="Dr. Goutam Das";
				l14.setText("Dr. Goutam Das");
			}
		});
		i9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sirname="Dr. Aritra Acharyya";
				l14.setText("Dr. Aritra Acharyya");
			}
		});
		i10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sirname="Dr. Prabal Deb";
				l14.setText("Dr. Prabal Deb");
			}
		});
		i11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sirname="Sk Rabiul Hossain";
				l14.setText("Sk Rabiul Hossain");
			}
		});
		i12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sirname="Mr. Atanu Maji";
				l14.setText("Mr. Atanu Maji");
			}
		});
		i13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sirname="Mr. Tanumay Halder";
				l14.setText("Mr. Tanumay Halder");
			}
		});
		
		
		i14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sirname="Saptaparna Basu Roy Chowdhury";
				l14.setText("Saptaparna Basu Roy Chowdhury");
			}
		});
		i15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sirname="Dr. Sushovan Chatterjee";
				l14.setText("Dr. Sushovan Chatterjee");
			}
		});
		i16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sirname="Mr. Dibyedu Das";
				l14.setText("Mr. Dibyedu Das");
			}
		});
		i17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sirname="Mr. Gyan Tshering Lapcha";
				l14.setText("Mr. Gyan Tshering Lapcha");
			}
		});
		i18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sirname="Mr. Prasenjit Das";
				l14.setText("Mr. Prasenjit Das");
			}
		});
		i19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sirname="Dr. Suman Koner";
				l14.setText("Dr. Suman Koner");
			}
		});
		i20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sirname="Mr. Biren Gurung";
				l14.setText("Mr. Biren Gurung");
			}
		});
		i21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sirname="Dr. Kingshuk Dan";
				l14.setText("Dr. Kingshuk Dan");
			}
		});
		i22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sirname="Md Asif Sk";
				l14.setText("Md Asif Sk");
			}
		});
		i23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sirname="Mr. Shamol Ghosh";
				l14.setText("Mr. Shamol Ghosh");
			}
		});
		i24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sirname="Mr. Mohsmmsd Salim";
				l14.setText("Mr. Mohsmmsd Salim");
			}
		});
		i25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sirname="Mr. Suman Sadhukan";
				l14.setText("Mr. Suman Sadhukan");
			}
		});
		i26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sirname="Mr. Amit Singha Roy";
				l14.setText("Mr. Amit Singha Roy");
			}
		});
		i27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sirname="Dr. Sumik Nag";
				l14.setText("Dr. Sumik Nag");
			}
		});
		i28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sirname="Mr. Argha Chakraborty";
				l14.setText("Mr. Argha Chakraborty");
			}
		});
		i29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sirname="Mrs. Madhuchandra Bhadui";
				l14.setText("Mrs. Madhuchandra Bhadui");
			}
		});
		
		
		JTextArea area=new JTextArea("If you have any question then type it in this area");
		area.setBounds(230,20,300,300);
		f5.add(area);
		JLabel l15;
		l15=new JLabel("Rate the corresponding teacher");
		l15.setBounds(535,20,225,25);
		l15.setFont(new Font("Sylfaen",Font.PLAIN,18));
		f5.add(l15);
		JRadioButton r1,r2,r3,r4,r5;
		r1=new JRadioButton("1-POOR");
		r2=new JRadioButton("2-FAIR");
		r3=new JRadioButton("3-GOOD");
		r4=new JRadioButton("4-VERY GOOD");
		r5=new JRadioButton("5-SATISFACTORY");
		r1.setBounds(580,50,100,30);
		r1.setFont(new Font("Sylfaen",Font.ITALIC,16));
		r2.setBounds(580,75,100,30);
		r2.setFont(new Font("Sylfaen",Font.ITALIC,16));
		r3.setBounds(580,97,100,30);
		r3.setFont(new Font("Sylfaen",Font.ITALIC,16));
		r4.setBounds(580,119,150,30);
		r4.setFont(new Font("Sylfaen",Font.ITALIC,16));
		r5.setBounds(580,142,160,30);
		r5.setFont(new Font("Sylfaen",Font.ITALIC,16));
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		bg.add(r5);
		f5.add(r1);
		f5.add(r2);
		f5.add(r3);
		f5.add(r4);
		f5.add(r5);
		JButton b14=new JButton("Submit");
		b14.setBounds(600,375,100,30);
		b14.setFont(new Font("Trebuchet MS",Font.BOLD,16));
		b14.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				Connection con2=null;
				PreparedStatement pst2=null;
				String Userid1=tf5.getText();
				
				
				String question;
				String point="";
				question=area.getText();
				if(r1.isSelected()) {
					point="1";
				}
				if(r2.isSelected()) {
					point="2";
				}
				if(r3.isSelected()) {
					point="3";
				}
				if(r4.isSelected()) {
					point="4";
				}
				if(r5.isSelected()) {
					point="5";
				}
				
				try {
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
					con2=DriverManager.getConnection("jdbc:ucanaccess://D:\\data.accdb");
					pst2=con2.prepareStatement("insert into Table1 (userid,sir_name,question,point) values(?,?,?,?)");
					pst2.setString(1,Userid1);
					
					pst2.setString(2,sirname);
					pst2.setString(3,question);
					pst2.setString(4,point);
					int ok1=JOptionPane.showConfirmDialog(f5, "Conform to store","Are you sure..",JOptionPane.YES_NO_OPTION);
					if(ok1==0) {
						pst2.execute();
						JOptionPane.showMessageDialog( f5, "Submitted Successfully");
					}
					
				}catch(Exception ex2) {
					ex2.printStackTrace();
				}
			
			}
		});
		f5.add(b14);
		JButton b15=new JButton("Exit");
		b15.setBounds(475,375,100,30);
		b15.setFont(new Font("Trebuchet MS",Font.BOLD,16));
		b15.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
			if(JOptionPane.showConfirmDialog(null,"conform if you want to exit","Logic System",
					JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
				System.exit(0);
			}
				
			}
		});
		f5.add(b15);
		JButton b18=new JButton("Home");
		b18.setBounds(350, 375, 100, 30);
		b18.setFont(new Font("Trebuchet MS",Font.BOLD,16));
		f5.add(b18);
		b18.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				page1 p9=new page1();
				page1.main(null);
			}
		});
		f5.setSize(800,500);
		f5.setLayout(null);
		f5.setVisible(true);
	}

}
