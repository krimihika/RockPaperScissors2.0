import javax.swing.*; 
import java.awt.event.*;  
import java.util.*;
import java.awt.font.*;
import java.awt.Color;
import java.awt.Font;
public class Graphics {
	JFrame f;  
    JButton b,r,p,s;
    JTextField tf1;
    JTextArea ta;
    JLabel l1,l2,l3,l4,l5; 
    Font font1 = new Font("SansSerif", Font.BOLD, 20);
    Game g;
    Color myColor;
    boolean quit = false;
    
	public Graphics() {
		
		// creates frame
		JFrame f=new JFrame("Rock Paper Scissors");
		myColor = new Color(237, 153, 45);
		f.getContentPane().setBackground(myColor);
	    f.setLayout(null);  
	    f.setVisible(true);
	
	    // creates rock, paper, scissors, quit buttons
	    r=new JButton(new ImageIcon("rock.gif"));    
	    r.setBounds(250,400,200,200); 
	    f.add(r); 
	    
	    p=new JButton(new ImageIcon("paper.png"));    
	    p.setBounds(500,400,200,200); 
	    f.add(p);
	    
	    s=new JButton(new ImageIcon("sc.jpg"));    
	    s.setBounds(750,400,200,200); 
	    f.add(s); 
	    
	    f.setLayout(null);    
	    f.setVisible(true); 
	
		// creates labels 
	    l1=new JLabel("Enter a move. ");
	    l1.setFont(font1);
	    l1.setBounds(550,100, 1000,100);  
	    f.add(l1);
	    
	    // creates text fields
	    tf1=new JTextField();
	    tf1.setFont(font1);
	    tf1.setHorizontalAlignment(JTextField.CENTER);
	    tf1.setBounds(1100,50,250,100); 
	    
	    ta=new JTextArea();
	    ta.setFont(font1);
	    //ta.setHorizontalAlignment(JTextField.CENTER);
	    ta.setBounds(1100,200,300,100); 
	    
	    r.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	    	            tf1.setText("You Played Rock");
	    	            g = new Game();
	    	            g.person = "Rock";
	    	            ta.setText("Computer Played: " + g.response(g.compPlay) + "\n" + g.result());
	    	        }  
	    	    });
	    p.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	    	            tf1.setText("You Played Paper");
	    	            g = new Game();
	    	            g.person = "Paper";
	    	            ta.setText("Computer Played: " + g.response(g.compPlay) + "\n" + g.result());
	    	        }  
	    	    });
	    s.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	    	            tf1.setText("You Played Scissors");
	    	            g = new Game();
	    	            g.person = "Scissors";
	    	            ta.setText("Computer Played: " + g.response(g.compPlay) + "\n" + g.result());
	    	        }  
	    	    });
	    	    f.add(tf1);
	    	    f.add(ta);
	    	    

	
	    f.pack();
	    
	}
}  
