import java.util.Scanner;
import java.util.Random;
public class Mini {
  public static void main (String [] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Would you like to draw stars (Enter 1) or play rock paper scissors (Enter 2)?");
    int game = scan.nextInt();

    while (game !=1 || game != 2) {
      System.out.println("Error; Please enter 1 or 2.");
      System.out.println("Would you like to draw (Enter 1) or play rock paper scissors (Enter 2)?");
      game = scan.nextInt();
    }

    if (game == 1) {
      System.out.println("What star pattern would you like to draw?");
      System.out.println("Options are 1-5 (Enter number corresponding to the option you want).");
      int option = scan.nextInt();

      while (!(option > 0) && !(option < 7)){
        System.out.println("Error: \nOptions are 1-5 (Enter number corresponding to the option you want).");
        option = scan.nextInt();
      }

      if (option == 1) {
        String star = "";
        for (int i = 10; i > 0; i--){
          for (int k = 10; k > 0; k--){
            String asterik = star + "*";
          }
          System.out.println(asterik);
        }
      }
    }


    if (game == 2){
      System.out.println("Choose 1 for Rock, 2 for Paper, or 3 for Scissors.");
      int choice = scan.nextInt();
      int Rock = 1;
      int Paper = 2;
      int Scissors = 3;

      Random rand = new Random();

      int comp = (int)(Math.random()*3);
      int per = input.nextInt();

      if((comp == 1 && per = 1) || (comp ==2 && per == 2) || (comp == 3 && per == 3)){
        System.out.println("It is a tie");
        }



    }
  }

}
