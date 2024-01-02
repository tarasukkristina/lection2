//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //int number = 123123123;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();

        String numberStr = String.valueOf(number);
        int numberStrLength = numberStr.length();

        String lastdigit = numberStr.substring(numberStrLength -1);
        System.out.println(lastdigit);




    }
}