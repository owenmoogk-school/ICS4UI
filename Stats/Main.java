/*
 * Stats Problem
 * Chapter 8 Test
 * ICS 4UI
 * Owen Moogk
 */

public class Main {

	public static void main(String[] args) {
		
    // ALL TESTER CODE

    BaseballTeam myTeam = new BaseballTeam();

    myTeam.setWins(10);
    myTeam.setTies(2);
    myTeam.setLosses(199);

    System.out.println(myTeam.overallPoints());

	}
}