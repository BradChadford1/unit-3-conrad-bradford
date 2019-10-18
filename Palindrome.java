import java.util.Scanner;


public class Palindrome {
  public static void main (String [] args) {
    Scanner read = new Scanner(System.in);

    System.out.println("Please enter a word or phrase:");

    String userWord = read.nextLine();

    String userPhrase = userWord.replaceAll("[^a-zA-Z]", "").toUpperCase().replaceAll(",","");
    int wordLength = userPhrase.length();
    int index = wordLength - 1;
    String phrase = "";

    while (index >= 0 ) {
        char nextLetter = userPhrase.charAt(index);
        nextLetter = userPhrase.charAt(index);
        phrase = phrase + nextLetter;
        index--;
    }

    System.out.println(phrase);

    if (phrase.compareTo(userPhrase) == 0){
      System.out.println("You have a palindrome!");
    }
    else {
      System.out.println("You don't have a palindrome!");
    }

  }

}
