package homework2.shuffle;

import java.util.Random;
import java.util.Scanner;

public class ShuffleGame {


  public boolean playGame(Scanner sc) {
      int ans = generateRandomNumber();
      System.out.println("Pick 1, 2 or 3!");

      int user = sc.nextInt();
      sc.nextLine();

      return ans == user;

  }
  
  
  public int generateRandomNumber() {
      Random rand = new Random();
      return rand.nextInt(3) + 1;
  }

  
  
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      ShuffleGame obj = new ShuffleGame();

      System.out.println("Welcome to Shuffle Game!\n");
      System.out.println("Take a guess where the 0 is!\n");
      System.out.println("Are you ready to play?");
      String userChoice = sc.nextLine();

      while (userChoice.equalsIgnoreCase("y")) {

          boolean win = obj.playGame(sc);
          if (win) {
              System.out.println("Good Guess!");
          } else {
              System.out.println("Sorry!!! Wrong guess");
          }

          System.out.println("Do you want to try again?");
          userChoice = sc.nextLine();

          if (userChoice.equalsIgnoreCase("n")) {
              break;
          } else if (userChoice.equalsIgnoreCase("y")) {
              continue;
          } else {
              while (!userChoice.equalsIgnoreCase("y") && !userChoice.equalsIgnoreCase("n")) {
                  System.out.println("Do you want to try again?");
                  userChoice = sc.nextLine();
              }
          }

      }

      System.out.println("See you next time!");

  }
	
}
