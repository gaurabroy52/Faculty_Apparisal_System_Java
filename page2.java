package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class page2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f2=new JFrame("Student Login Page");
		JLabel l3=new JLabel("User Id");
		JLabel l4=new JLabel("Password");
		l3.setBounds(50, 150, 80, 50);
		
		l3.setFont(new Font("Sylfaen",Font.PLAIN,18));
		l4.setBounds(50, 190, 80, 50);
		
		l4.setFont(new Font("Sylfaen",Font.PLAIN,18));
		f2.add(l3);
		f2.add(l4);
		JTextField ft1=new JTextField("Enter your user id");
		ft1.setBounds(150, 152, 150, 30);
		f2.add(ft1);
		JPasswordField jp1=new JPasswordField();
		jp1.setBounds(150, 192, 150, 30);
		f2.add(jp1);
		JButton b4,b5,b6,b7;
		b4=new JButton("Login");
		b5=new JButton("Reset");
		b6=new JButton("Exit");
		b7=new JButton("New Registration");
		b4.setBounds(50, 350, 80, 50);
		b4.setFont(new Font("Trebuchet MS",Font.BOLD,16));
		b5.setBounds(150, 350, 80, 50);
		b5.setFont(new Font("Trebuchet MS",Font.BOLD,16));
		b6.setBounds(250, 350, 70, 50);
		b6.setFont(new Font("Trebuchet MS",Font.BOLD,16));
		b7.setBounds(350, 350, 170, 50);
		b7.setFont(new Font("Trebuchet MS",Font.BOLD,16));
		f2.add(b4);
		f2.add(b5);
		f2.add(b6);
		f2.add(b7);
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Connection con1=null;
				PreparedStatement pst1=null;
				ResultSet rst1=null;
				 String Userid=ft1.getText();
				String Password=jp1.getText();
			
				
				try {
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
					con1=DriverManager.getConnection("jdbc:ucanaccess://D:\\data.accdb");
					
					
					pst1=con1.prepareStatement("select * from login_table where userid=? and pass=?");
					pst1.setString(1,Userid);
					pst1.setString(2,Password);
					rst1=pst1.executeQuery();

					while(rst1.next()) {
						page5 p5=new page5();
						page5.main(null);
					}
				con1.close();
				
				}catch(HeadlessException | ClassNotFoundException | SQLException ex1) {
					ex1.printStackTrace();
				}
					}
				
			
		});
		b5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ft1.setText(null);
				jp1.setText(null);
			}
		});
		b6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(JOptionPane.showConfirmDialog(f2, "Confrom if you want to exit","Login System",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
b7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				page3 p3=new page3();
				page3.main(null);
			}
		});
	JButton b16=new JButton("Home");
	b16.setBounds(550, 350, 100, 50);
	b16.setFont(new Font("Trebuchet MS",Font.BOLD,16));
	f2.add(b16);
	b16.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			page1 p7=new page1();
			page1.main(null);
		}
	});
	
		f2.setSize(800,500);
		f2.setLayout(null);
		f2.setVisible(true);
	}

}
