
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.valueOf(scan.nextLine());
        
        if (number % 2 != 0) {
            System.out.println(String.format("Number %s is odd.", number));
            return;
        }
        
        System.out.println(String.format("Number %s is even.", number));
    }
}
