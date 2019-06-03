import javax.swing.*; 
import java.awt.event.*;  
import java.util.*;
import java.awt.font.*;
import java.awt.Color;
import java.awt.Font;
public class Graphics {
	JFrame f;  
    JButton b,r,p,s;
    JTextField tf1,tf2,tf3;
    //JTextArea ta;
    JLabel l1,plPoints,coPoints,streakLabel; 
    Font font1 = new Font("SansSerif", Font.BOLD, 20);
    Font font2 = new Font("Aharoni", Font.BOLD, 50);
    Game g;
    Color myColor;
    boolean quit = false;
    int cp = 0 ,pp = 0, streak = 0;
    
	public Graphics() {
		
		// creates frame
		JFrame f=new JFrame("Rock Paper Scissors");
		myColor = new Color(144, 215, 229);
		f.getContentPane().setBackground(myColor);
	    f.setLayout(null);  
	    f.setVisible(true);
	
	    // creates rock, paper, scissors buttons
	    r=new JButton(new ImageIcon("rock.gif"));    
	    r.setBounds(250,400,200,200); 
	    f.add(r); 
	    
	    p=new JButton(new ImageIcon("paper.gif"));    
	    p.setBounds(500,400,200,200); 
	    f.add(p);
	    
	    s=new JButton(new ImageIcon("sc.gif"));    
	    s.setBounds(750,400,200,200); 
	    f.add(s); 
	    
	    f.setLayout(null);    
	    f.setVisible(true); 
	
		// creates labels 
	    l1=new JLabel("Enter a move. ");
	    l1.setFont(font2);
	    l1.setBounds(500,100, 1000,100);  
	    f.add(l1);
	    
	    plPoints=new JLabel("Your Points: " );
	    plPoints.setFont(font1);
	    plPoints.setBounds(1100,500,300,100);  
	    f.add(plPoints);
	    
	    coPoints=new JLabel("Computer's Points: " );
	    coPoints.setFont(font1);
	    coPoints.setBounds(1100,600,300,100);  
	    f.add(coPoints);
	    
	    streakLabel =new JLabel("Streak: " );
	    streakLabel.setFont(font1);
	    streakLabel.setBounds(500,300,300,100);  
	    f.add(streakLabel);
	    
	    // creates text fields
	    tf1=new JTextField();
	    tf1.setFont(font1);
	    tf1.setHorizontalAlignment(JTextField.CENTER);
	    tf1.setBounds(1100,50,300,100); 
	    
	    tf2=new JTextField();
	    tf2.setFont(font1);
	    tf2.setHorizontalAlignment(JTextField.CENTER);
	    tf2.setBounds(1100,200,300,100); 
	    
	    tf3=new JTextField();
	    tf3.setFont(font1);
	    tf3.setHorizontalAlignment(JTextField.CENTER);
	    tf3.setBounds(1100,350,300,100); 
	    
	    r.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	    	            tf1.setText("You Played Rock");
	    	            g = new Game();
	    	            g.person = "Rock";
	    	            tf2.setText("Computer Played: " + g.response(g.compPlay));
	    	            tf3.setText(g.result());
	    	            
	    	            if(g.result().equals("Computer wins")) {
	    	    	    	cp ++;
	    	    	    	streak = 0;
	    	    	    }else if (g.result().equals("You win")){
	    	    	    	pp ++;
	    	    	    	streak ++;
	    	    	    }
	    	            coPoints.setText("Computer's Points: " + cp);
	    	            plPoints.setText("Player's Points: " + pp);
	    	            streakLabel.setText("Streak: " + streak);
	    	            
	    	        }  
	    	    });
	    p.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	    	            tf1.setText("You Played Paper");
	    	            g = new Game();
	    	            g.person = "Paper";
	    	            tf2.setText("Computer Played: " + g.response(g.compPlay));
	    	            tf3.setText(g.result());
	    	            
	    	            if(g.result().equals("Computer wins")) {
	    	    	    	cp ++;
	    	    	    	streak = 0;
	    	    	    }else if (g.result().equals("You win")){
	    	    	    	pp ++;
	    	    	    	streak ++;
	    	    	    }
	    	            coPoints.setText("Computer's Points: " + cp);
	    	            plPoints.setText("Player's Points: " + pp);
	    	            streakLabel.setText("Streak: " + streak);
	    	        }  
	    	    });
	    s.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	    	            tf1.setText("You Played Scissors");
	    	            g = new Game();
	    	            g.person = "Scissors";
	    	            tf2.setText("Computer Played: " + g.response(g.compPlay));
	    	            tf3.setText(g.result());
	    	            
	    	            if(g.result().equals("Computer wins")) {
	    	    	    	cp ++;
	    	    	    	streak = 0;
	    	    	    }else if (g.result().equals("You win")){
	    	    	    	pp ++;
	    	    	    	streak ++;
	    	    	    }
	    	            coPoints.setText("Computer's Points: " + cp);
	    	            plPoints.setText("Player's Points: " + pp);
	    	            streakLabel.setText("Streak: " + streak);
	    	        }  
	    	    });
	    	    f.add(tf1);
	    	    f.add(tf2);
	    	    f.add(tf3);
	    	    

	
	    f.pack();
	    
	 
	    
	}
}  
