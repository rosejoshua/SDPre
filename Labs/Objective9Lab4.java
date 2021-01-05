import java.util.Scanner;

public class Objective9Lab4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double num1, num2;

    System.out.print("Please give me a number: ");
    num1 = input.nextDouble();
    System.out.print("Please give me another number: ");
    num2 = input.nextDouble();

    double average = findAverage(num1, num2);
    System.out.println("The average of " + num1 + " and " + num2 + " is " + average);

    input.close();
  }

  public static double findAverage(double x, double y) {
    return (x + y)/2;
  }
}
