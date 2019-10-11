import java.util.Scanner;


public class Palindrome {
  public static void main (String [] args) {
    Scanner read = new Scanner(System.in);

    System.out.println("Please enter a word or phrase:");

    String userWord = read.nextLine();

    int wordLength = userWord.length();

    int index = wordLength - 1;
    String phrase = "";
    char space = ' ';
    while (index >= 0 ) {
        char nextLetter = userWord.charAt(index);
        if(Character.compare(nextLetter, space) != 0){
          nextLetter = userWord.charAt(index);
          phrase = phrase + nextLetter;
          index--;
        }
        if(Character.compare(nextLetter, space) == 0){
          nextLetter = userWord.charAt(index-1);
          phrase = phrase + nextLetter + " " ;
          index = index-2;
        }
    }

    System.out.println(phrase);

    if (phrase.compareTo(userWord) == 0){
      System.out.println("You have a palindrome!");
    }
    else {
      System.out.println("You don't have a palindrome!");
    }

  }

}
