
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        String mensagem = scanner.nextLine();
        
        System.out.println(mensagem);
    }
}
