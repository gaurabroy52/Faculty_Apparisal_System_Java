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
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class page3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f3=new JFrame("Registration Form");
		JLabel l5=new JLabel("User Id");
		JLabel l6=new JLabel("Password");
		l5.setBounds(50, 150, 80, 50);
		l5.setFont(new Font("Sylfaen",Font.PLAIN,18));
		l6.setBounds(50, 190, 80, 50);
		l6.setFont(new Font("Sylfaen",Font.PLAIN,18));
		f3.add(l5);
		f3.add(l6);
		JTextField ft2=new JTextField("Enter user id");
		ft2.setBounds(150, 153, 150, 30);
		f3.add(ft2);
		JPasswordField jp2=new JPasswordField();
		jp2.setBounds(150, 193, 150, 30);
		f3.add(jp2);
		JButton b8,b9,b10;
		b8=new JButton("Submit");
		b9=new JButton("Reset");
		b10=new JButton("Exit");
		
		b8.setBounds(50, 350, 100, 50);
		b8.setFont(new Font("Trebuchet MS",Font.BOLD,16));
		b9.setBounds(180, 350, 80, 50);
		b9.setFont(new Font("Trebuchet MS",Font.BOLD,16));
		b10.setBounds(280, 350, 80, 50);
		b10.setFont(new Font("Trebuchet MS",Font.BOLD,16));
		
		f3.add(b8);
		f3.add(b9);
		f3.add(b10);
		b9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ft2.setText(null);
				jp2.setText(null);
			}
		});
		b10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(JOptionPane.showConfirmDialog(f3, "Confrom if you want to exit","Login System",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
b8.addActionListener(new ActionListener() {
			
			@Override
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Connection con=null;
				PreparedStatement pst=null;
			
				String Userid= ft2.getText();
				String Password=jp2.getText();
				try {
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
					con=DriverManager.getConnection("jdbc:ucanaccess://D:\\data.accdb");
					pst=con.prepareStatement("insert into login_table (userid,pass) values(?,?)");
					pst.setString(1, Userid);
					pst.setString(2, Password);
					int ok=JOptionPane.showConfirmDialog(f3, "Conform to store","Are you sure..",JOptionPane.YES_NO_OPTION);
					if(ok==0) {
						pst.execute();
						JOptionPane.showMessageDialog( f3, "Submitted Successfully");
					}
				}catch(Exception ex) {
					ex.printStackTrace();
				}
				
			}
		});
	JButton b19=new JButton("Home");
	b19.setBounds(380, 350, 100, 50);
	b19.setFont(new Font("Trebuchet MS",Font.BOLD,16));
	f3.add(b19);
	b19.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		page1 p10=new page1();
		page1.main(null);
	}
});

		
		f3.setSize(800,500);
		f3.setLayout(null);
		f3.setVisible(true);
	}

}
