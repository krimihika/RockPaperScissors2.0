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
    JTextArea tf2;
    JLabel l1,l2,l3,l4,l5; 
    Font font1 = new Font("SansSerif", Font.BOLD, 20);
    Game g;
    boolean quit = false;
    
	public Graphics() {
		
		// creates frame
		JFrame f=new JFrame("Rock Paper Scissors"); 
	    f.setLayout(null);  
	    f.setVisible(true);
	
	    // creates rock, paper, scissors, quit buttons
	    r=new JButton(new ImageIcon("rock.jpg"));    
	    r.setBounds(450,400,200,200); 
	    f.add(r); 
	    
	    p=new JButton(new ImageIcon("paper.png"));    
	    p.setBounds(700,400,200,200); 
	    f.add(p);
	    
	    s=new JButton(new ImageIcon("sc.jpg"));    
	    s.setBounds(950,400,200,200); 
	    f.add(s); 
	    
	    f.setLayout(null);    
	    f.setVisible(true); 
	
		// creates labels 
	    l1=new JLabel("Enter a move. ");  
	    l1.setBounds(750,100, 1000,100);  
	    f.add(l1);
	    
	    // creates text fields
	    tf1=new JTextField();
	    tf1.setFont(font1);
	    tf1.setHorizontalAlignment(JTextField.CENTER);
	    tf1.setBounds(1300,50,250,100); 
	    
	    tf2=new JTextArea();
	    tf2.setFont(font1);
	    //tf2.setHorizontalAlignment(JTextField.CENTER);
	    tf2.setBounds(1300,200,300,500); 
	    
	    r.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	    	            tf1.setText("You Played Rock");
	    	            g = new Game();
	    	            g.person = "Rock";
	    	            tf2.setText("Computer Played: " + g.response(g.compPlay) + "\n" + g.result());
	    	        }  
	    	    });
	    p.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	    	            tf1.setText("You Played Paper");
	    	            g = new Game();
	    	            g.person = "Paper";
	    	            tf2.setText("Computer Played: " + g.response(g.compPlay) + "\n" + g.result());
	    	        }  
	    	    });
	    s.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	    	            tf1.setText("You Played Scissors");
	    	            g = new Game();
	    	            g.person = "Scissors";
	    	            tf2.setText("Computer Played: " + g.response(g.compPlay) + "\n" + g.result());
	    	        }  
	    	    });
	    	    f.add(tf1);
	    	    f.add(tf2);
	    	    

	
	    f.pack();
	    
	}
}  
