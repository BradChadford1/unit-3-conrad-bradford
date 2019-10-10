import java.util.Scanner;
import java.text.DecimalFormat;

public class WinPercentage {
  public static void main (String [] args) {
    Scanner scan = new Scanner(System.in);
    DecimalFormat prcnt = new DecimalFormat("0.0");
    System.out.println("How many games were played?");
    double numGames = scan.nextDouble();

    System.out.println("How many games were won?");
    double numGamesWon = scan.nextDouble();

    while ((numGames < 1) || (numGamesWon < 0)){
      System.out.println("Invalid input; Must have played at least one game and won at least zero games.");

      System.out.println("How many games were played?");
      numGames = scan.nextDouble();

      System.out.println("How many games were won?");
      numGamesWon = scan.nextDouble();
    }

    while (numGamesWon > numGames){
      System.out.println("Invalid input; Cannot have won more games than played");

      System.out.println("How many games were played?");
      numGames = scan.nextDouble();

      System.out.println("How many games were won?");
      numGamesWon = scan.nextDouble();
    }

    while (((numGames%1) != 0) || ((numGamesWon%1) != 0)){
      System.out.println("Invalid input; Cannot have played or won a non-whole number of games");

      System.out.println("How many games were played?");
      numGames = scan.nextDouble();

      System.out.println("How many games were won?");
      numGamesWon = scan.nextDouble();
    }

    double winPrcnt = (((double) numGamesWon)/((double) numGames))*100;

    System.out.println("(" + numGames + "," + numGamesWon + ") => " + prcnt.format(winPrcnt) + "%");
   }
}
