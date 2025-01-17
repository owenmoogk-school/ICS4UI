/**
 * Hand class.
 */

import java.util.ArrayList;

public class Hand {
  // start of the array is the top, last is bottom
	private ArrayList <Card> handArray = new ArrayList <Card>();

  // no constructor needed
	
  /** 
	 * removes the top card
	 * pre: none
	 * post: returns the top card, and the top card is removed from the deck
	 */
  public Card removeTopCard(){
    Card topCard = handArray.get(0);
    handArray.remove(0);
    return(topCard);
  }

  /** 
	 * gets the number of cards in the hand
	 * pre: none
	 * post: integer is returned
	 */
  public int getCardCount(){
    return(handArray.size());
  }

  /** 
	 * adds a card to the hand
	 * pre: Card card
	 * post: the card is added to hand
	 */
  public void addCard(Card card){
    handArray.add(handArray.size(), card);
  }

  /** 
	 * returns string representing object
	 * pre: none
	 * post: string is returned
	 */
  public String toString() {
    String returnString = "";

    for (int i = 0; i < handArray.size(); i++){
      Card currCard = handArray.get(i);
      returnString = returnString + currCard;
      if (i != handArray.size()-1){
        returnString = returnString + ", ";
      }
    }
	 	return(returnString);
	}
}