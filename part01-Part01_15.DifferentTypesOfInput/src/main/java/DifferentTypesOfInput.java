
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a string:");
        String text = scanner.nextLine();
        
        System.out.println("Give an integer:");
        int integer = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give a double:");
        double doubleValue = Double.valueOf(scanner.nextLine());
        
        System.out.println("Give a boolean:");
        boolean booleanValue = Boolean.valueOf(scanner.nextLine());
        
        System.out.println(String.format("You gave the string %s", text));
        System.out.println(String.format("You gave the integer %s", integer));
        System.out.println(String.format("You gave the double %s", doubleValue));
        System.out.println(String.format("You gave the boolean %s", booleanValue));
    }
}
