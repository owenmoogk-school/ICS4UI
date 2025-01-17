/**
 * models the player in a game of RPS
 */
public class BaseballTeam implements Stats{

  // variables
	public int wins;
  public int ties;
  public int losses;

	/**
	 * constructor
	 * pre: none
	 * post: object creates, wins, losses, and ties all set to 0
	 */
	public BaseballTeam() {
		wins = 0;
    ties = 0;
    losses = 0;
	}
	
	/**
	 * sets the number of wins.
	 * pre: integer number of wins.
	 * post: wins is updated.
	 */
	public void setWins(int numOfWins){
	 	wins = numOfWins;
	}

	/**
	 * sets the number of ties.
	 * pre: integer number of ties.
	 * post: ties is updated.
	 */
	public void setTies(int numOfTies) {
	 	ties = numOfTies;
	}

  /**
	 * sets the number of losses.
	 * pre: integer number of losses.
	 * post: losses is updated.
	 */
	public void setLosses(int numOfLosses) {
	 	losses = numOfLosses;
	}

  /**
	 * get the number of points.
	 * pre: none.
	 * post: returns number of points.
	 */
	public int overallPoints() {
	 	return(wins * 2 + ties);
	}
	
}