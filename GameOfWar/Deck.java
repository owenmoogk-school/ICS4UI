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
    for (int i = 1; i < 14; i++){
      Card currentCard = new Card(suit, i);
      deckArray.add(currentCard);
    }
    suit = 'h';
    for (int i = 1; i < 14; i++){
      Card currentCard = new Card(suit, i);
      deckArray.add(currentCard);
    }
    suit = 'c';
    for (int i = 1; i < 14; i++){
      Card currentCard = new Card(suit, i);
      deckArray.add(currentCard);
    }
    suit = 's';
    for (int i = 1; i < 14; i++){
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
    java.util.Collections.shuffle(deckArray);
  }

  /** 
	 * gets a random number in range
	 * pre: int min, int max
	 * post: a random integer in the range is returned
	 */
  static int getRandomNumber(int min, int max) {
    // add one to the max because random will never return 1
    max = max+1;
    return ((int) ((Math.random() * (max - min)) + min));
  }

  /** 
	 * gets the size of the deck
	 * pre: none
	 * post: int size is returned
	 */
  public int getSize(){
    return(deckArray.size());
  }

  /** 
	 * a random card is taken from the deck
	 * pre: none
	 * post: a random card is taken from the deck
	 */
  public Card takeRandomCard(){
    int num = getRandomNumber(0, deckArray.size()-1);
    Card returnCard = deckArray.get(num);
    deckArray.remove(num);
    return(returnCard);
  }

  /** 
	 * object to string
	 * pre: none
	 * post: string returned
	 */
  public String toString() {
    String returnString = "";

    for (int i = 0; i < deckArray.size(); i++){
      Card currCard = deckArray.get(i);
      returnString = returnString + currCard;
      if (i != deckArray.size()-1){
        returnString = returnString + ", ";
      }
    }

	 	return(returnString);
	}
}