/**
 * Game class.
 */

import java.util.ArrayList;

public class Game {
	private Deck startingDeck = new Deck();
  private Hand player = new Hand();
  private Hand computer = new Hand();

  public Game(){
    startingDeck.shuffleDeck();
    while (startingDeck.getSize() != 0){
      player.addCard(startingDeck.takeRandomCard());
      computer.addCard(startingDeck.takeRandomCard());
    }
  }


  /** 
	 * checks to see if the game should be terminated
	 * pre: none
	 * post: a bool is returned representing state of game
	 */
  private boolean isGameOver(){
    if (player.getCardCount() < 1 || computer.getCardCount() < 1){
      return(true);
    }
    else{
      return(false);
    }
  } 

  /** 
	 * gets the winner of the game
	 * pre: none
	 * post: winner is returned as bool
	 */
  private boolean getWinner(){
    if (player.getCardCount() < 1){
      return (false);
    }
    else{
      return (true);
    }
  }

  /** 
	 * plays the game
	 * pre: none
	 * post: the winner is returned as a bool
	 */
  public boolean play(){
    // holding all the risked cards
    ArrayList <Card> riskedCards = new ArrayList <Card>();

    while (true){

      if (isGameOver()){
        break;
      }

      Card playerCard = player.removeTopCard();
      Card computerCard = computer.removeTopCard();

      System.out.print("Player 1 plays: "+playerCard+"   ");
      System.out.println("Player 2 plays:"+computerCard);

      riskedCards.add(playerCard);
      riskedCards.add(computerCard);

      int isPlayerWin = war(playerCard, computerCard);

      if (isPlayerWin == 2){
        int riskedCardSize = riskedCards.size();
        for (int j = 0; j < riskedCardSize; j++){
          player.addCard(riskedCards.get(0));
          riskedCards.remove(0);
        }
        riskedCards = new ArrayList <Card>();
      }

      else if (isPlayerWin == 0){
        int riskedCardSize = riskedCards.size();
        for (int j = 0; j < riskedCardSize; j++){
          computer.addCard(riskedCards.get(0));
          riskedCards.remove(0);
        }
        riskedCards = new ArrayList <Card>();
      }

      else if (isPlayerWin == 1){
        // add three cards for each player to risked array
        for (int i = 0; i < 3; i++){

          if (isGameOver()){
            break;
          }

          riskedCards.add(player.removeTopCard());
          riskedCards.add(computer.removeTopCard());
        }
      }
      System.out.print("P1: "+ player.getCardCount());
      System.out.print("  ");
      System.out.println("P2: "+computer.getCardCount());
    }
    return(getWinner());
  }

  /** 
	 * compares two cards
	 * pre: Card card1, Card card2
	 * post: returns value representing winner of the two cards
	 */
  private int war(Card card1, Card card2){
    if (card1.getValue() > card2.getValue()){
      return(2);
    }
    else if (card1.getValue() < card2.getValue()){
      return(0);
    }
    else{
      return(1);
    }
  }
}