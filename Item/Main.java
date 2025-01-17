/*
 * Item Problem
 * Chapter 7 Test
 * ICS 4UI
 * Owen Moogk
 */

import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    // config
    boolean running = true;
    Item myStock = new Item();
    Scanner input = new Scanner(System.in);
    

    // main
    while (running){
      System.out.println("1. Show current inventory");
      System.out.println("2. Add to current inventory");
      System.out.println("3. Remove from current inventory");
      System.out.println("Enter 0 to quit");

      int choice = Integer.parseInt(input.nextLine());
      System.out.println();
      if (choice == 1){
        System.out.println(String.format("Current stock is %d", myStock.getStock()));
      }
      if (choice == 2){
        myStock.addToStock(1);
        System.out.println("Added 1 item to stock.");
      }
      if (choice == 3){
        myStock.removeFromStock(1);
        System.out.println("Removed 1 item from stock.");
      }
      if (choice == 0){
        running = false;
      }
      System.out.println();
    }
  }
}