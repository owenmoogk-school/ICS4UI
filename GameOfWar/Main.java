class Main {

  public static void main(String[] args) {
    //main should not contain much more than this
    
    Game gow = new Game();

    boolean winner = gow.play(); // this starts the game
    if (winner){
      System.out.println("PLAYER ONE WINS!!!");
    }
    else{
      System.out.println("PLAYER TWO WINS!!!");
    }
  }
}