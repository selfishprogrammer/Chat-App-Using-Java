package ChattingApp;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;


import java.net.*;

import javax.swing.*;
import javax.swing.border.Border;

public class Chat2Class extends JFrame implements ActionListener{
JLabel l1,l2,l3,l4,l5,l6,l7,l9,l10,l11;
JPanel pl,pm;
static JTextField t1;
JButton b1;
static JTextArea te1;

static Socket s;
static DataInputStream di;
static DataOutputStream oi;
static String msg="";


//public class Borders2UndecoFrame extends JFrame{
//    JLabel label = new JLabel("Welcome!", JLabel.CENTER);
//    public Borders2UndecoFrame(){
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(new Dimension(200, 200));
//        add(label, BorderLayout.CENTER);
//        setUndecorated(true);
//        getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.RED));
//        setVisible(true);
//
//    }







Container c;

	
Chat2Class(){
		
		setTitle("Jha'sApp");
		setBounds(1000,100,300,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	     getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.BLACK));
		c=getContentPane();
		c.setLayout(null);
		c.setBackground(Color.WHITE);
		
		
		 pl=new JPanel();
		pl.setBounds(0,0,300,40);
	pl.setBackground(new Color (2,4,6));
		Border border2 = BorderFactory.createLineBorder(Color.BLACK);
		 pl.setBorder(BorderFactory.createCompoundBorder(border2,
		            BorderFactory.createEmptyBorder(10,10,10,10)));
		 
		 
		 pm=new JPanel();
			pm.setBounds(0,45,300,50);
		pm.setBackground(new Color (2,4,6));
			Border border3 = BorderFactory.createLineBorder(Color.BLACK);
			 pm.setBorder(BorderFactory.createCompoundBorder(border3,
			            BorderFactory.createEmptyBorder(10,10,10,10)));
		
		
		l1=new JLabel("JhA'SApp");
		l1.setBounds(95,5,100,20);
		l1.setForeground(Color.WHITE);
		
		
		Font font =new Font("Arial", Font.BOLD,20);
		l1.setFont(font);
		c.add(l1);
		
		ImageIcon image=new ImageIcon("C:\\Users\\RAHUL\\OneDrive\\Desktop\\icons\\3.png");
		Image img=image.getImage().getScaledInstance(35,35,Image.SCALE_DEFAULT);
		ImageIcon img1=new ImageIcon(img); 
		l3=new JLabel(img1);
		l3.setBounds(0,3,25,25);
		c.add(l3);
		
		
		
		ImageIcon image1=new ImageIcon("C:\\Users\\RAHUL\\OneDrive\\Desktop\\icons\\video.png");
		Image img2=image1.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
		ImageIcon img3=new ImageIcon(img2); 
		l4=new JLabel(img3);
		l4.setBounds(170,45,50,50);
		c.add(l4);
		
		
		ImageIcon image2=new ImageIcon("C:\\Users\\RAHUL\\OneDrive\\Desktop\\icons\\phone.png");
		Image img0=image2.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
		ImageIcon img4=new ImageIcon(img0); 
		l2=new JLabel(img4);
		l2.setBounds(230,45,50,50);
		c.add(l2);
		
		ImageIcon image3=new ImageIcon("C:\\Users\\RAHUL\\OneDrive\\Desktop\\icons\\3icon.png");
		Image img5=image3.getImage().getScaledInstance(45,20,Image.SCALE_DEFAULT);
		ImageIcon img6=new ImageIcon(img5); 
		l5=new JLabel(img6);
		l5.setBounds(260,0,5,30);
		c.add(l5);
		
		
//		ImageIcon image4=new ImageIcon("C:\\Users\\RAHUL\\OneDrive\\Desktop\\icons\\logo5.jpg");
//		Image img7=image4.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
//		ImageIcon img8=new ImageIcon(img7); 
//		l6=new JLabel(img8);
//		l6.setBounds(0,0,50,30);
//		c.add(l6);
		
		
		

		ImageIcon image9=new ImageIcon("C:\\Users\\RAHUL\\OneDrive\\Desktop\\icons\\lo1.png");
		Image img10=image9.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
		ImageIcon img11=new ImageIcon(img10); 
		l7=new JLabel(img11);
		l7.setBounds(0,45,50,50);
		c.add(l7);
		
		l9=new JLabel("Sharma Ji");
		l9.setBounds(70,50,100,20);
		l9.setForeground(Color.WHITE);
		
		
		l9.setFont(new Font("Arial", Font.BOLD,15));
		c.add(l9);
		
		
		l10=new JLabel("Online");
		l10.setBounds(80,70,100,20);
		l10.setForeground(Color.WHITE);
		
		
		l10.setFont(new Font("Arial", Font.PLAIN,10));
		c.add(l10);
		
		
		
		t1=new JTextField();
		t1.setBounds(2,555,210,35);
		t1.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.GREEN));
		t1.setFont(new Font("Arial", Font.PLAIN,15));
		
		c.add(l10);
		
		
		
		te1=new JTextArea();
		te1.setBounds(3,100,285,450);
//		te1.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.GREEN));
		te1.setFont(new Font("Arial", Font.BOLD,17));
		te1.setEditable(false);
		te1.setBackground(Color.DARK_GRAY);
		te1.setForeground(Color.WHITE);
		
		
		
		te1.setWrapStyleWord(false);
		te1.setLineWrap(true);
		c.add(te1);
		
		
		
		
		
		b1=new JButton("SEND");
		b1.setBounds(216,555,75,35);
		b1.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.GREEN));
		b1.setBackground(Color.GREEN);
		c.add(b1);
		
		l3.addMouseListener( new MouseAdapter(){
			public void mouseClicked(MouseEvent ae) {
				System.exit(0);
				
			}
		});
		
		c.add(t1);
		
		
		c.add(pl);	
		c.add(pm);
		b1.addActionListener(this);
	
			
		
		
	

		  setUndecorated(true);
		setVisible(true);
		
		
	}

	
	public void actionPerformed(ActionEvent e) {
		
		try {
		
		te1.setText("\n"+te1.getText()+"\t"+t1.getText());
		oi.writeUTF(t1.getText());
		t1.setText("");
		
		
		
		}catch(Exception e1) {
			
			e1.printStackTrace();
			
		}
	
	}
	


public static void main(String[] args) {
	 new Chat2Class().setVisible(true);
	
	
	
	try {
		
		s=new Socket("127.0.0.1",3698);
		
		
		di=new DataInputStream(s.getInputStream());
		oi=new DataOutputStream(s.getOutputStream());
		
	msg=di.readUTF();	
	te1.setText("\n"+te1.getText()+"\n"+msg);

		
//	s.close();
	
		
	}catch(Exception e1) {
		
		e1.printStackTrace();
		
	}
}
}
