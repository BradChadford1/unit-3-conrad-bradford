import java.util.Scanner;

public class Splicer {

  public static void main (String [] args) {

    Scanner read = new Scanner(System.in);

    System.out.println("Write something: ");
    String userPhrase = read.nextLine();

    for (int i = 0; i != userPhrase.length(); i++){
      char letter = userPhrase.charAt(i);
      System.out.println(letter);
    }

  }
}
