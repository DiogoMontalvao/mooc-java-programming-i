
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
    
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        
        if (first > second) {
            System.out.println(String.format("Greater number is: %s", first));
            return;
        }
        
        if (first == second) {
            System.out.println("The numbers are equal!");
            return;
        }
        
        System.out.println(String.format("Greater number is: %s", second));
    }
}
