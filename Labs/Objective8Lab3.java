public class Objective8Lab3 {
  public static void main(String[] args) {
    int count = 1;

    for(int i=1; i<21; i++) {
      System.out.print(i);
      if(i%2 == 0) {
        System.out.println(" is even");
      }
      else {
        System.out.println(" is odd");
      }
    }
  }
}
