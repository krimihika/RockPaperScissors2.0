

	import java.util.Scanner;

	public class Main {
		public static void main (String[] args) {
			Scanner scan = new Scanner(System.in); 
			Game g = new Game();
		    
		    
		    System.out.println("Please enter a move.\n" + "Rock = R, Paper" + 
		            "= P, and Scissors = S." + "\n Enter 'Q' to quit");
		    g.person = scan.next();
		    
		    System.out.println(g.response(g.person));
		    System.out.println(g.response(g.compPlay));
		    System.out.println(g.result());
		    //System.out.println("hi");
		}
		
	}


