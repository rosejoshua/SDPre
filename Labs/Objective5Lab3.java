import java.util.Scanner;

public class Objective5Lab3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int userNum;

    System.out.println("Please enter a whole number: ");
    userNum = input.nextInt();

    if(userNum < 0) {
      System.out.println("The number is negative");
    }

    else if(userNum > 0) {
      System.out.println("The number is positive");
    }

    else {
      System.out.println("The number is equal to 0");
    }

    input.close();
  }
}
