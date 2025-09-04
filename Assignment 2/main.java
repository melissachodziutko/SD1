
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner (System.in);
      System.out.println("What is your major?");
      String major = sc.nextLine();
      System.out.println("What is your school?");
      String school = sc.nextLine();
      System.out.println("What year are you?");
      String year = sc.nextLine();
      System.out.println("You go to " + school + ", you're majoring in " + major + ", and you're a " + year);
      



    }
}
