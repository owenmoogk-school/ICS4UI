class Main {
  public static void main(String[] args) {
    // 1. Make a deck of cards
    Deck myDeck = new Deck();

    // 2. Print out the deck of cards
    System.out.println(myDeck);

    // 3. Shuffle the deck
    myDeck.shuffleDeck();

    // 4. Print out shuffled deck
    System.out.println(myDeck);

    // 5. Print out a random card
    System.out.println(myDeck.getRandomCard());
  }
}