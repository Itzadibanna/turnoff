import java.util.Scanner;

public class turnOff {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter To Continue");
        scanner.next();
        System.out.println(Runtime.getRuntime().freeMemory());
        scanner.next();
      try {
          Runtime.getRuntime().exec("sudo poweroff");
      }
      catch (Exception e){
          System.out.println(e.getMessage());
      }
finally {
          System.out.println("fuckoff");
      }
    }

}
