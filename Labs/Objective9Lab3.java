import java.util.Scanner;

public class Objective9Lab3 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean run = true;

    while(run == true) {
      printMenu();
      run = takeChoice(scan.nextInt());
    }
    scan.close();
  }

  //class methods:
  public static boolean takeChoice(int choice) {
    int n = choice;

    if(n == 1) {
      System.out.println("Hello, human!");
    }
    else if(n == 2) {
      System.out.println("My favorite foods are electrons and silicone!");
    }
    else if(n == 3) {
      System.out.println("Goodbye!");
      return false;
    }
    else {
      System.out.println("Invalid input, please try again");
    }

    return true;
  }

  public static void printMenu() {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List my favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }
}
