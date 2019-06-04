public class Game {
	
	String person;
	String comp;
	int compPlay;
	String response;
	int cPoints;
	int pPoints;
    
	//constructor 
    public Game() {
    	// initializes a random number that represents the computer's turn
    	compPlay = (int) (Math.random()*3 )+ 1;
    	
    	//sets initial points of player and computer to 0.
    	cPoints = 0;
    	pPoints = 0;
    	
    }

    // converts random number to a string representing computer's turn
	public String response(int num) {
		if(num == 1) {
			comp = "Rock";
			return "Rock";
		}else if(num == 2) {
			comp = "Paper";
			return "Paper";	
		}else {
			comp = "Scissors";
			return "Scissors";
		}	
	}
	
	// evaluates who wins and updates points
	public String result () {
		if(person.equals("Rock") && comp.equals("Scissors")) {
			pPoints++;
			return "Point for Player";
		}
		else if(person.equals("Rock") && comp.equals("Paper")) {
			cPoints++;
			return "Point for Computer";
		}
		else if(person.equals("Paper") && comp.equals("Rock")) {
			pPoints++;
			return "Point for Player";
		}
		else if(person.equals("Paper") && comp.equals("Scissors")) {
			cPoints++;
			return "Point for Computer";
		}
		else if(person.equals("Scissors") && comp.equals("Rock")) {
			cPoints++;
			return "Point for Computer";
		}else if(person.equals("Scissors") && comp.equals("Paper")) {
			pPoints++;
			return "Point for Player";
		}else {
			return "Tie";
		}
	}
}



