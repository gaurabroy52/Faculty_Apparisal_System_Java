package project;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class page6 {
	static String sir1="";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f6=new JFrame("Result Page");
		
		JLabel l16,l17;
		l16=new JLabel("Select Faculty");
		l16.setBounds(10,50,120,20);
		l16.setFont(new Font("Sylfaen",Font.PLAIN,18));
		f6.add(l16);
		
		l17=new JLabel();
		l17.setBounds(10,80,200,50);
		f6.add(l17);
		JMenuBar mb=new JMenuBar();
		mb.setBounds(10, 160, 70, 50);
		JMenu set=new JMenu("Click Here");
		
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
		f6.add(mb);
		
		
		i1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sir1="Dr. Sourav De";
				l17.setText("Dr. Sourav De");
			}
		});
		
		i2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sir1="Dr. Sudip Adhikari";
				l17.setText("Dr. Sudip Adhikari");
			}
		});
		i3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sir1="Mr. Sukhendu Shekhar Mondal";
				l17.setText("Mr. Sukhendu Shekhar Mondal");
			}
		});
		i4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sir1="Mr. Soumen Mondal";
				l17.setText("Mr. Soumen Mondal");
			}
		});
		i5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sir1="Mr. Arnab Gain";
				l17.setText("Mr. Arnab Gain");
			}
		});
		i6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sir1="Dr. Prasenjit Dey";
				l17.setText("Dr. Prasenjit Dey");
			}
		});
		i7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sir1="Dr. Sorrish Sanyal";
				l17.setText("Dr. Sorrish Sanyal");
			}
		});
		i8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sir1="Dr. Goutam Das";
				l17.setText("Dr. Goutam Das");
			}
		});
		i9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sir1="Dr. Aritra Acharyya";
				l17.setText("Dr. Aritra Acharyya");
			}
		});
		i10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sir1="Dr. Prabal Deb";
				l17.setText("Dr. Prabal Deb");
			}
		});
		i11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sir1="Sk Rabiul Hossain";
				l17.setText("Sk Rabiul Hossain");
			}
		});
		i12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sir1="Mr. Atanu Maji";
				l17.setText("Mr. Atanu Maji");
			}
		});
		i13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sir1="Mr. Tanumay Halder";
				l17.setText("Mr. Tanumay Halder");
			}
		});
		
		
		i14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sir1="Saptaparna Basu Roy Chowdhury";
				l17.setText("Saptaparna Basu Roy Chowdhury");
			}
		});
		i15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sir1="Dr. Sushovan Chatterjee";
				l17.setText("Dr. Sushovan Chatterjee");
			}
		});
		i16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sir1="Mr. Dibyedu Das";
				l17.setText("Mr. Dibyedu Das");
			}
		});
		i17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sir1="Mr. Gyan Tshering Lapcha";
				l17.setText("Mr. Gyan Tshering Lapcha");
			}
		});
		i18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sir1="Mr. Prasenjit Das";
				l17.setText("Mr. Prasenjit Das");
			}
		});
		i19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sir1="Dr. Suman Koner";
				l17.setText("Dr. Suman Koner");
			}
		});
		i20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sir1="Mr. Biren Gurung";
				l17.setText("Mr. Biren Gurung");
			}
		});
		i21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sir1="Dr. Kingshuk Dan";
				l17.setText("Dr. Kingshuk Dan");
			}
		});
		i22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sir1="Md Asif Sk";
				l17.setText("Md Asif Sk");
			}
		});
		i23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sir1="Mr. Shamol Ghosh";
				l17.setText("Mr. Shamol Ghosh");
			}
		});
		i24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sir1="Mr. Mohsmmsd Salim";
				l17.setText("Mr. Mohsmmsd Salim");
			}
		});
		i25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sir1="Mr. Suman Sadhukan";
				l17.setText("Mr. Suman Sadhukan");
			}
		});
		i26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sir1="Mr. Amit Singha Roy";
				l17.setText("Mr. Amit Singha Roy");
			}
		});
		i27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sir1="Dr. Sumik Nag";
				l17.setText("Dr. Sumik Nag");
			}
		});
		i28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sir1="Mr. Argha Chakraborty";
				l17.setText("Mr. Argha Chakraborty");
			}
		});
		i29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sir1="Mrs. Madhuchandra Bhadui";
				l17.setText("Mrs. Madhuchandra Bhadui");
			}
		});
		JButton b20=new JButton("Result");
		b20.setBounds(10,250, 100, 50);
		b20.setFont(new Font("Trebuchet MS",Font.BOLD,16));
		f6.add(b20);
		JTextArea area1=new JTextArea();
		area1.setBounds(170,50,250,250);
		f6.add(area1);
		JLabel l18,l19;
		l18=new JLabel("Overall Result:");
		l18.setBounds(450,54,110,20);
		l18.setFont(new Font("Sylfaen",Font.PLAIN,18));
		f6.add(l18);
		
		l19=new JLabel("/5");
		l19.setBounds(655,37,50,50);
		f6.add(l19);
		JTextField ft6=new JTextField();
		ft6.setBounds(603, 53, 50, 18);
		f6.add(ft6);
		b20.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Connection con3=null;
				PreparedStatement pst3=null;
				ResultSet rst2=null;
				int count=0;
				String point1;
				String text;
				String text1=" ";
				int point2;
				int sum=0;
				float result;
				String result1=" ";
				try {
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
					con3=DriverManager.getConnection("jdbc:ucanaccess://D:\\data.accdb");
					pst3=con3.prepareStatement("select * from Table1 where sir_name=?");
					pst3.setString(1,sir1);
					rst2=pst3.executeQuery();
					while(rst2.next())
					{
						
						
						text=rst2.getString("question");
						point1=rst2.getString("point");
						if(point1.contains("1")) {
							point2=1;
						}
						else if(point1.contains("2")) {
							point2=2;
						}
						else if(point1.contains("3")) {
							point2=3;
						}
						else if(point1.contains("4")) {
							point2=4;
						}
						else if(point1.contains("5")) {
							point2=5;
						}
						else {
							point2=0;
						}
						 text1=text1+"  "+text;
						 sum=sum+point2;
						count++;
						
						
					}
					area1.setText(text1);
					result=sum/count;
					if(result>0.0f && result <=1.0f) {
						result1="1";
					}
					if(result>1.0f && result <=2.0f) {
						result1="2";
					}
					if(result>2.0f && result <=3.0f) {
						result1="3";
					}
					if(result>3.0f && result <=4.0f) {
						result1="4";
					}
					if(result>4.0f && result <=5.0f) {
						result1="5";
					}
					ft6.setText(result1);
					
					con3.close();
				}catch(Exception ex3) {
					ex3.printStackTrace();
				}
			}
		});
		
		f6.setSize(800,500);
		f6.setLayout(null);
		f6.setVisible(true);
	}

}
