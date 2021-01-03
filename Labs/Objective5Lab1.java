import java.util.Scanner;

public class Objective5Lab1 {
  public static void main(String[] args) {
    int num1, num2;

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the first whole number to compare: ");
    num1 = input.nextInt();

    System.out.print("Enter the second whole number to compare: ");
    num2 = input.nextInt();

    if(num1 > num2) {
      System.out.println(num1 + " is greater than " + num2);
    }

    else if(num2 > num1) {
      System.out.println(num2 + " is greater than " + num1);
    }

    else if(num2 == num1) {
      System.out.println(num2 + " equals " + num1);
    }

    input.close();
  }
}
