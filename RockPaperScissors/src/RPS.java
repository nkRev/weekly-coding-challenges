
public class RPS {
	
	public RPS() {
		
	}

	protected String rps(String p1, String p2) {
		String p1Win = "Player 1 wins";
		String p2Win = "Player 2 wins";
		String tie = "Tie";

		switch (p1) {
		case "paper":
		case "p":
			if (p1.equals(p2)) {
				return tie;
			} else if (p2.equals("scissors") || p2 == "s") {
				return p2Win;
			} else {
				return p1Win;
			}
		case "scissors":
		case "s":
			if (p1.equals(p2)) {
				return tie;
			} else if (p2.equals("paper") || p2.equals("p")) {
				return p1Win;
			} else {
				return p2Win;
			}

		case "rock":
		case "r":
			if (p1.equals(p2)) {
				return tie;
			} else if (p2.equals("paper")) {
				return p2Win;
			} else {
				return p1Win;
			}

		}
		return "";
	}
}
