/*
 * Essay Problem
 * Chapter 8 Test
 * ICS 4UI
 * Owen Moogk
 */

public class Main {

	public static void main(String[] args) {
		
    // ALL TESTER CODE

    Essay myEssay = new Essay();

    myEssay.setWords(2000);
    System.out.println(myEssay.validLength());
    myEssay.setWords(199);
    System.out.println(myEssay.validLength());
    myEssay.setWords(5000);
    System.out.println(myEssay.validLength());

	}
}