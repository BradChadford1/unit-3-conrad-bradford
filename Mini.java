import java.util.Scanner;
import java.util.Random;
public class Mini {
  public static void main (String [] args) {
    Scanner scan = new Scanner(System.in);

      int game = 0;

      String asterik = "";
      String space = "";
      String draw = "";
      int option = 0;

      while (option < 6) {
        System.out.println("What star pattern would you like to draw?");
        System.out.println("Options are 1-5 (Enter number corresponding to the option you want; Option 6 is quit).");
        option = scan.nextInt();

        while (option <= 0 || option >= 7){
          System.out.println("Error: \nOptions are 1-6 (Enter number corresponding to the option you want; Option 6 is Quit).");
          option = scan.nextInt();
        }

        if (option == 1) {
        asterik = "**********";
        for (int i = 0; i < 9; i++){
          asterik = asterik.substring(0 , asterik.length()-1);
          System.out.println(asterik);
        }
        continue;
      }

      if (option == 2) {
        asterik = "          ";
        for (int i = 9; i > -1; i--){
          asterik = asterik.substring(1) + "*";
          System.out.println(asterik);
        }
        continue;
      }

      if (option == 3) {
        asterik = "**********";
        space = "          ";
        for (int i = 0; i < asterik.length(); i++){
          System.out.println(asterik);
          asterik = space.substring(0 , i + 1) + asterik.substring(1 + i);
        }
        continue;
      }

      if (option == 4) {
        asterik = "*";
        space = "    ";
        draw = "";
        System.out.println("    " + asterik);
        for (int i = 0; i < 4; i++) {
          asterik = asterik + "**";
          space = space.substring(0, space.length() - 1);
          draw = space + asterik;
          System.out.println(draw);
        }
        System.out.println(draw);
        for (int i = 0; i < 4; i++) {
          asterik = asterik.substring(0, asterik.length() - 2);
          space = space + " ";
          draw = space + asterik;
          System.out.println(draw);
        }
        continue;
      }

      if (option == 5) {
        asterik = "*********";
        space = "";
        draw = "";
        System.out.println(asterik);
        for (int i = 0; i < 4; i++) {
          asterik = asterik.substring(0, asterik.length() - 2);
          space = space + " ";
          draw = space + asterik;
          System.out.println(draw);
        }
        System.out.println(draw);
        for (int i = 0; i < 4; i++) {
          asterik = asterik + "**";
          space = space.substring(0, space.length() - 1);
          draw = space + asterik;
          System.out.println(draw);
        }
        continue;
      }
      if (option == 6) {
        break;
      }


    }
 }
 }
