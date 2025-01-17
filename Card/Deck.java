/**
 * Deck class.
 */

import java.util.ArrayList;

public class Deck {
	private ArrayList <Card> deckArray = new ArrayList <Card>();

	/**
	 * constructor
	 * pre: none
	 * post: deck object created 
	 */
	public Deck() {
    char suit = 'd';
    for (int i = 2; i < 15; i++){
      Card currentCard = new Card(suit, i);
      deckArray.add(currentCard);
    }
    suit = 'h';
    for (int i = 2; i < 15; i++){
      Card currentCard = new Card(suit, i);
      deckArray.add(currentCard);
    }
    suit = 'c';
    for (int i = 2; i < 15; i++){
      Card currentCard = new Card(suit, i);
      deckArray.add(currentCard);
    }
    suit = 's';
    for (int i = 2; i < 15; i++){
      Card currentCard = new Card(suit, i);
      deckArray.add(currentCard);
    }
	}

  /** 
	 * shuffles the deck
	 * pre: none
	 * post: the deck is shuffled
	 */
  public void shuffleDeck(){
    // the best method would just be to call collections.shuffle, but I will do it the way you want as well :)
    // java.util.Collections.shuffle(deckArray);

    // performing 1000 swaps
    for (int i = 0; i < 1000; i++){
      swapCards(getRandomNumber(0,51),getRandomNumber(0,51));
    }
  }

  private void swapCards(int index1, int index2){
    Card card1 = deckArray.get(index1);
    Card card2 = deckArray.get(index2);
    deckArray.set(index2, card1);
    deckArray.set(index1, card2);
  }
	
  /** 
	 * gets a random card
	 * pre: none
	 * post: a random card from the deck is returned
	 */
  public Card getRandomCard(){
    int cardNum = getRandomNumber(0,51);
    Card currCard = deckArray.get(cardNum);
    return(currCard);
  }

  /** 
	 * object to string
	 * pre: none
	 * post: returns the string of the object
	 */
	public String toString() {
    String returnString = "";

    for (int i = 0; i < 52; i++){
      Card currCard = deckArray.get(i);
      returnString = returnString + currCard;
      if (i != 51){
        returnString = returnString + ", ";
      }
    }

	 	return(returnString);
	}

  /** 
	 * gets a random number in a range
	 * pre: int min, int max
	 * post: returns the integer number
	 */
  static int getRandomNumber(int min, int max) {
    // add one to the max because random will never return 1
    max = max+1;
    return ((int) ((Math.random() * (max - min)) + min));
  }

}