/**
 * Card class.
 */

public class Card {
	private char suit;
	private int value;

	/**
	 * constructor
	 * pre: char suit, int value
	 * post: Card object created
	 * The cost and prizes are set.
	 */
	public Card(char newSuit, int newValue) {
    newSuit = Character.toUpperCase(newSuit);
		suit = newSuit;
		value = newValue;
	}
	

	/** 
	 * returns the suit of the card.
	 * pre: none
	 * post: suit of card it returned
	 */
	public char getSuit() {
	 	return(suit);
	}

  /** 
	 * returns the value of the card.
	 * pre: none
	 * post: value of card it returned
	 */
	public int getValue() {
	 	return(value);
	}

  /** 
	 * sets the suit of the card.
	 * pre: char newSuit
	 * post: suit of card is updated
	 */
	public void setSuit(char newSuit) {
	 	suit = newSuit;
	}

  /** 
	 * sets the value of the card.
	 * pre: int newValue
	 * post: value of card is updated
	 */
	public void setValue(char newValue) {
	 	value = newValue;
	}

  /** 
	 * object to string
	 * pre: none
	 * post: returns the string of the object
	 */
	public String toString() {
    String valueChar = Integer.toString(value);

    if (value == 11){
      valueChar = "J";
    }
    else if (value == 12){
      valueChar = "Q";
    }
    else if (value == 13){
      valueChar = "K";
    }
    else if (value == 14){
      valueChar = "A";
    }
	 	return(valueChar+Character.toString(suit));
	}

}