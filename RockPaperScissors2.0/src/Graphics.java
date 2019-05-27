import javax.swing.*; 
import java.util.*;
public class Graphics {
	JFrame f;  
    JButton b,r,p,s;  
	public Graphics() {
		JFrame f=new JFrame("Rock Paper Scissors");  
	    f.setSize(800,800);  
	    f.setLayout(null);  
	    f.setVisible(true);
	
	
		JLabel l1,l2,l3,l4,l5;  
	    l1=new JLabel("Enter a move. ");  
	    l1.setBounds(310,100, 1000000,100);  
	    l2=new JLabel("Rock = R, Paper" + 
	            "= P, and Scissors = S." + "\n Enter 'Q' to quit");  
	    l2.setBounds(200,150, 1000000,30);
	    f.add(l1); f.add(l2);
	}
}  
