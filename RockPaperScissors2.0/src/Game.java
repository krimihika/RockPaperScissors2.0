public class Game {
	
	String person;
	String comp;
	int compPlay;
	String response;
	int cPoints;
	int pPoints;
    
    public Game() {
    	compPlay = (int) (Math.random()*3 )+ 1;
    	cPoints = 0;
    	pPoints = 0;
    	
    }

	public String response(String str) {
		if(str.equals("R")) {
			person = "Rock";
			return "Rock";
		}else if(str.equals("P")) {
			person = "Paper";
			return "Paper";
		}else {
			person = "Scissors";
			return "Scissors";
		}	
	}
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
	public String result () {
		if(person.equals("Rock") && comp.equals("Scissors")) {
			cPoints++;
			return "You win";
		}
		else if(person.equals("Rock") && comp.equals("Paper")) {
			cPoints++;
			return "Computer wins";
		}
		else if(person.equals("Paper") && comp.equals("Rock")) {
			cPoints++;
			return "You win";
		}
		else if(person.equals("Paper") && comp.equals("Scissors")) {
			cPoints++;
			return "Computer wins";
		}
		else if(person.equals("Scissors") && comp.equals("Rock")) {
			cPoints++;
			return "Computer wins";
		}else if(person.equals("Scissors") && comp.equals("Paper")) {
			cPoints++;
			return "You win";
		}else {
			return "Tie";
		}
	}
}



