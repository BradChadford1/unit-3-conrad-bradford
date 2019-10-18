import java.util.Scanner;
import java.text.DecimalFormat;

public class Multiples {

  public static void main (String [] args) {

    Scanner read = new Scanner(System.in);

    System.out.println("Provide a positive integer");
    int userNum = read.nextInt();

    while (!(userNum >= 1)){
     System.out.println("Provide a positive integer");
     userNum = read.nextInt();
    }

    System.out.println("Provide an Upper Limit");
    int UpLim = read.nextInt();

    while (!(UpLim >= userNum)){
      System.out.println("Provide an Upper Limit greater than or equal to the integer provided");
      UpLim = read.nextInt();
    }

    System.out.println("(" + userNum + "," + UpLim + ") => ");

    int multiple = userNum;

    String format = UpLim + "";
    String placeHolder = "";

    for (int i = 0; i != format.length(); i++){
      placeHolder = placeHolder + 0;
    }

    DecimalFormat colomn = new DecimalFormat(placeHolder);

    int count = 1;

    for (int i = 1; (UpLim - multiple) > userNum; i++) {
      multiple = userNum * i;
      if(count < 5 ) {
      System.out.print(colomn.format(multiple) + " ");
      count++;
    }
    else{
      System.out.println(colomn.format(multiple) + " ");
      count = 1;
      }
    }
  }
}
