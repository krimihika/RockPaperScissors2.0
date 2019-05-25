import javax.swing.*; 
import java.util.*;
public class Graphics {
	JFrame f;  
    JButton b,r,p,s;  
	public Graphics() {
		JFrame f=new JFrame("Rock Paper Scissors");  
	    JButton b=new JButton("START");
	    b.setBounds(50,100,95,30);  
	    f.add(b);  
	    f.setSize(800,800);  
	    f.setLayout(null);  
	    f.setVisible(true); 
	    JLabel l1,l2,l3,l4,l5;  
	    l1=new JLabel("Enter a move. ");  
	    l1.setBounds(310,100, 1000000,100);  
	    l2=new JLabel("Rock = R, Paper" + 
	            "= P, and Scissors = S." + "\n Enter 'Q' to quit");  
	    l2.setBounds(200,150, 1000000,30);
	    Icon ri = new ImageIcon("yourFile.gif");
	    r = new JButton("yourFile.gif");
	   // r.setIcon(new ImageIcon(""));
	   // r.setBounds(310,300, 1000000,100);
	    
	    f.add(l1); f.add(l2);//f.add(r);
	    //System.exit(0);
	    
	    		//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    		// frame stuffs here ...

	    		//frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
	}
}  

