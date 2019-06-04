import javax.swing.*; 
import java.awt.event.*;  
import java.awt.Color;
import java.awt.Font;
import java.util.Hashtable;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Graphics {
	JFrame f;  
    JButton b,r,p,s;
    JTextField tf1,tf2,tf3;
    //JTextArea ta;
    JLabel l1,plPoints,coPoints,streakLabel,sliderLabel; 
    Font font1 = new Font("SansSerif", Font.BOLD, 20);
    Font font2 = new Font("Aharoni", Font.BOLD, 60);
    Game g;
    Color myColor;
    boolean quit = false;
    int compPoints = 0 ,playerPoints = 0, streak = 0, pointsToWin;
    JSlider slider;
    JProgressBar progressBar;
    
   
    
	public Graphics() {
		
		// creates frame
		JFrame f=new JFrame("Rock Paper Scissors");
	    f.setLayout(null);  
	    f.setVisible(true);
	    
	    
	    // sets background color
	    myColor = new Color(144, 215, 229);
		f.getContentPane().setBackground(myColor);
	
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
	    
		// creates labels 
	    l1=new JLabel("Pick a move: ");
	    l1.setFont(font2);
	    l1.setForeground(Color.BLUE);
	    l1.setBounds(400,100, 1000,100);  
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
	    streakLabel.setBounds(1100,700,300,100);  
	    f.add(streakLabel);
	    
	    sliderLabel =new JLabel("Points to win : ");
	    sliderLabel.setFont(font1);
	    sliderLabel.setBounds(650,-250,1000,1000);  
	    f.add(sliderLabel);
	    
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
	    	            
	    	            if(g.result().equals("Point for Computer")) {
	    	    	    	compPoints ++;
	    	    	    	streak = 0;
	    	    	    }else if (g.result().equals("Point for Player")){
	    	    	    	playerPoints ++;
	    	    	    	streak ++;
	    	    	    } else if (g.result().equals("Tie")){
	    	    	    	streak  =0 ;
	    	    	    }
	    	            coPoints.setText("Computer's Points: " + compPoints);
	    	            plPoints.setText("Player's Points: " + playerPoints);
	    	            streakLabel.setText("Streak: " + streak);
	    	            if(compPoints == pointsToWin) {
	    	            	tf1.setText("");
		    	            tf2.setText("");
		    	            tf3.setText("Computer Wins!");
	    	            }else if (playerPoints == pointsToWin) {
	    	            	tf1.setText("");
		    	            tf2.setText("");
		    	            tf3.setText("You Win!");
	    	            }
	    	            
	    	        }  
	    	    });
	    p.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	    	            tf1.setText("You Played Paper");
	    	            g = new Game();
	    	            g.person = "Paper";
	    	            tf2.setText("Computer Played: " + g.response(g.compPlay));
	    	            tf3.setText(g.result());
	    	            
	    	            if(g.result().equals("Point for Computer")) {
	    	    	    	compPoints ++;
	    	    	    	streak = 0;
	    	    	    }else if (g.result().equals("Point for Player")){
	    	    	    	playerPoints ++;
	    	    	    	streak ++;
	    	    	    } else if (g.result().equals("Tie")){
	    	    	    	streak  =0 ;
	    	    	    }
	    	            coPoints.setText("Computer's Points: " + compPoints);
	    	            plPoints.setText("Player's Points: " + playerPoints);
	    	            streakLabel.setText("Streak: " + streak);
	    	            if(compPoints == pointsToWin) {
	    	            	tf1.setText("");
		    	            tf2.setText("");
		    	            tf3.setText("Computer Wins!");
	    	            }else if (playerPoints == pointsToWin) {
	    	            	tf1.setText("");
		    	            tf2.setText("");
		    	            tf3.setText("You Win!");
	    	            }
	    	        }  
	    	    });
	    s.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	    	            tf1.setText("You Played Scissors");
	    	            g = new Game();
	    	            g.person = "Scissors";
	    	            tf2.setText("Computer Played: " + g.response(g.compPlay));
	    	            tf3.setText(g.result());
	    	            
	    	            if(g.result().equals("Point for Computer")) {
	    	    	    	compPoints ++;
	    	    	    	streak = 0;
	    	    	    }else if (g.result().equals("Point for Player")){
	    	    	    	playerPoints ++;
	    	    	    	streak ++;
	    	    	    } else if (g.result().equals("Tie")){
	    	    	    	streak  =0 ;
	    	    	    }
	    	            coPoints.setText("Computer's Points: " + compPoints);
	    	            plPoints.setText("Player's Points: " + playerPoints);
	    	            streakLabel.setText("Streak: " + streak);
	    	            if(compPoints == pointsToWin) {
	    	            	tf1.setText("");
		    	            tf2.setText("");
		    	            tf3.setText("Computer Wins!");
	    	            }else if (playerPoints == pointsToWin) {
	    	            	tf1.setText("");
		    	            tf2.setText("");
		    	            tf3.setText("You Win!");
	    	            } 
	    	}
	    	    });
	    	    f.add(tf1);
	    	    f.add(tf2);
	    	    f.add(tf3);
	    	    
	    slider = new JSlider(JSlider.HORIZONTAL);; 
	    slider.setBounds(450,230,150,50);
	    slider.setMajorTickSpacing(25);
	    slider.setPaintTicks(true);
	    
	 // Set the labels to be painted on the slider
	    slider.setPaintLabels(true);
	             
	    // Add positions label in the slider
	    Hashtable position = new Hashtable();
	    position.put(0, new JLabel("0"));
        position.put(25, new JLabel("25"));
        position.put(50, new JLabel("50"));
        position.put(75, new JLabel("75"));
        position.put(100, new JLabel("100"));
	    
	             
	    // Set the label to be drawn
	    slider.setLabelTable(position); 
	    
	    // Add change listener to the slider
        slider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                sliderLabel.setText("Points to win : " + ((JSlider)e.getSource()).getValue()) ;
                pointsToWin = ((JSlider)e.getSource()).getValue();
            }
        });
        
	    f.add(slider);
	    
	   
	    
	 
	    
	}
}  
