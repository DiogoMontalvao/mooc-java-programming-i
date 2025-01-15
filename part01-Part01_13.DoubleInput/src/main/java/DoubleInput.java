
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        double number = Double.valueOf(scanner.nextLine());
        
        System.out.println(String.format("You gave the number %s", number));
    }
}
