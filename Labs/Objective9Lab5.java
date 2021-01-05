import java.util.Scanner;

public class Objective9Lab5 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double num1, num2;
    boolean run = true;
    int choice;
    double answer = 0.0;

    System.out.print("Please provide a number: ");
    num1 = input.nextDouble();
    System.out.println();

    System.out.print("Please provide a second number: ");
    num2 = input.nextDouble();
    System.out.println();

    while(run) {
      printMenu();
      System.out.print("Menu choice: ");
      choice = input.nextInt();

      switch(choice) {
        case 1:
        sumNums(num1, num2);
        System.out.println();
        break;

        case 2:
        findAvg(num1, num2);
        System.out.println();
        break;

        case 3:
        getTax(num1, num2);
        System.out.println();
        break;

        case 4:
        System.out.println("You've chosen to quit. Goodbye!");
        run = false;
        break;

        default:
          System.out.println("That is not a valid choice");
      }
    }

    input.close();
  }

  //methods

  public static void printMenu() {
    System.out.println();
		System.out.println("======== MENU ========");
		System.out.println("|                    |");
		System.out.println("|  1. Add Numbers    |");
		System.out.println("|  2. Find Average   |");
		System.out.println("|  3. Calculate Tax  |");
		System.out.println("|  4. Exit           |");
		System.out.println("|                    |");
		System.out.println("======================");
		System.out.println();
  }

  public static void sumNums(double x, double y) {
    double sum = x + y;
    System.out.print(x + " + " + y + " = " + sum);
  }

  public static void findAvg(double x, double y) {
    double avg = (x + y)/2;
    System.out.print("The average of " + x + " and " + y + " is: " + avg);
  }
  public static void getTax(double x, double y) {
    double tax = (x + y)*.0831;
    System.out.print("The amount of tax to be collected from a purchase of " + x + " and " + y + " is: " + tax);
  }

}
