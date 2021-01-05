import java.util.Scanner;

public class Objective7Lab5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int selection;
    boolean run = true;

    while (run == true) {
      System.out.println("_____Menus_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List my favorite foods");
      System.out.println("3: Exit");
      System.out.println();

      selection = input.nextInt();

      if(selection == 1) {
        System.out.println("Hello, human!");
      }

      else if(selection == 2) {
        System.out.println("My favorite foods are electrons and silicone!");
      }

      else if(selection == 3) {
        System.out.println("Goodbye!");
        run = false;
      }

      else {
        System.out.println("Invalid input, please try again");
      }
    }

    input.close();
  }
}
