/*
 * Stones
 * Question 1
 * Chapter 9 Practical Test
 * Owen Moogk
 * March 4, 2021
 */


class Main {
  
  /** 
	 * Returns a random number in the specified range
	 * pre: int min, int max
	 * post: random int in the range has been returned.
	 */
  static int getRandomNumber(int min, int max) {
    // add one to the max because random will never return 1
    max = max+1;
    return ((int) ((Math.random() * (max - min)) + min));
  }

  /** 
	 * Displays the board to the console
	 * pre: boolean [][] board
	 * post: board is displayed
	 */
  static void displayBoard(boolean [][] board){
    System.out.println("\nEach dash is an empty square, the '0' represents a stone:\n");
    for (int i = 0; i < board.length; i++){
      for (int j = 0; j < board[i].length; j++){
        if (board[i][j] == false){
          System.out.print("- ");
        }
        else{
          System.out.print("0 ");
        }
      }
      System.out.println();
    }
  }

  /** 
	 * Displays the coordinates of the stones to the console
	 * pre: boolean [][] board
	 * post: stone coordinates are displays
	 */
  static void displayStoneCoords(boolean [][] board){
    for (int i = 0; i < board.length; i++){
      for (int j = 0; j < board[i].length; j++){
        if (board[i][j] == true){
          System.out.print("("+Integer.toString(i+1)+","+Integer.toString(j+1)+"), ");
        }
      }
    }
  }
  

  public static void main(String[] args) {
    boolean[][] board = new boolean[10][10];

    // get a random number of stones
    int numOfStones = getRandomNumber(1,25);

    // place the stones, every time one is placed we subtract one from the number of stones until it reaches 0
    while (numOfStones != 0){
      boolean boardPlacementValid = false;

      while (!boardPlacementValid){
        int x = getRandomNumber(0, 9);
        int y = getRandomNumber(0,9);

        if (board[y][x] == false){
          board[y][x] = true;
          boardPlacementValid = true;
          numOfStones -= 1;
        }
      }
    }
    // displaying results to console
    displayBoard(board);
    displayStoneCoords(board);
  }
}