package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class page1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f1=new JFrame("Student Appraisal System");
		JLabel l1,l2;
		l1=new JLabel("Student Appraisal System");
		l1.setBounds(260, 50, 400, 100);
		l1.setForeground(Color.BLUE);
		l1.setFont(new Font("Times New Roman",Font.ITALIC,28));
		l2=new JLabel("Login As.....");
		l2.setBounds(200,200, 200, 50);
		l2.setForeground(Color.BLUE);
		l2.setFont(new Font("Times New Roman",Font.ITALIC,20));
		f1.add(l1);f1.add(l2);
		JButton b1,b2,b3;
		b1=new JButton("Student");
		b2=new JButton("Admin");
		b3=new JButton("Exit");
		b1.setBounds(200, 350, 100, 70);
		b1.setFont(new Font("Trebuchet MS",Font.BOLD,16));
		b2.setBounds(350, 350, 100, 70);
		b2.setFont(new Font("Trebuchet MS",Font.BOLD,16));
		b3.setBounds(500, 350, 100, 70);
		b3.setFont(new Font("Trebuchet MS",Font.BOLD,16));
		f1.add(b1);
		f1.add(b2);
		f1.add(b3);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				page2 p1=new page2();
				page2.main(null);
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				page4 p4=new page4();
				page4.main(null);
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(JOptionPane.showConfirmDialog(f1, "Confrom if you want to exit","Login System",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		
		
		f1.setSize(800,500);
		f1.setLayout(null);
		f1.setVisible(true);
	}

}
