import java.util.Scanner;


public class Palindrome {
  public static void main (String [] args) {
    Scanner read = new Scanner(System.in);

    System.out.println("Please enter a word or phrase:");

    String userWord = read.nextLine();

    int wordLength = userWord.length();

    int count = 0;
    int index = wordLength-1;
    String phrase = "";

    while (count < wordLength + 1) {
        String nextLetter = userWord.substring(index, index);
        phrase.concat(nextLetter);
        index--;
        count++;

    }

    if (phrase.compareTo(userWord) == 0){
      System.out.println("You have a palindrome!");
    }
    else {
      System.out.println("You don't have a palindrome!");
    }

  }

}
