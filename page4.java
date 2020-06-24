package project;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class page4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f4=new JFrame("Admin Login Pannel");
		JLabel l7=new JLabel("User Id");
		JLabel l8=new JLabel("Password");
		l7.setBounds(50, 150, 80, 50);
		l7.setFont(new Font("Sylfaen",Font.PLAIN,18));
		l8.setBounds(50, 190, 80, 50);
		l8.setFont(new Font("Sylfaen",Font.PLAIN,18));
		f4.add(l7);
		f4.add(l8);
		JTextField ft3=new JTextField("Enter user id");
		ft3.setBounds(150, 154, 150, 30);
		f4.add(ft3);
		JPasswordField jp3=new JPasswordField();
		jp3.setBounds(150, 194, 150, 30);
		f4.add(jp3);
		JButton b11,b12,b13;
		b11=new JButton("Login");
		b12=new JButton("Reset");
		b13=new JButton("Exit");
		
		b11.setBounds(50, 350, 90, 50);
		b11.setFont(new Font("Trebuchet MS",Font.BOLD,16));
		b12.setBounds(170, 350, 80, 50);
		b12.setFont(new Font("Trebuchet MS",Font.BOLD,16));
		b13.setBounds(280, 350, 70, 50);
		b13.setFont(new Font("Trebuchet MS",Font.BOLD,16));
		
		f4.add(b11);
		f4.add(b12);
		f4.add(b13);
		b12.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ft3.setText(null);
				jp3.setText(null);
			}
		});
		b13.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(JOptionPane.showConfirmDialog(f4, "Confrom if you want to exit","Login System",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		b11.addActionListener(new ActionListener() {
			
			@Override
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String userid=ft3.getText();
				String password=jp3.getText();
				if(userid.contains("Admin") && password.contains("12345")) {
					page6 p6=new page6();
					page6.main(null);
			}
				else {
					JOptionPane.showMessageDialog( f4, "Invalid Input");
				}
			}
		});
		JButton b17=new JButton("Home");
		b17.setBounds(380, 350, 100, 50);
		b17.setFont(new Font("Trebuchet MS",Font.BOLD,16));
		f4.add(b17);
		b17.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				page1 p8=new page1();
				page1.main(null);
			}
		});

		
		f4.setSize(800,500);
		f4.setLayout(null);
		f4.setVisible(true);
	
	}

}
