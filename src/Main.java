import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            // Palindrome for an Integer
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the Integer to check");
            int input = scanner.nextInt();
            String reversedInput = "";
            String stringNumber = Integer.toString(input);

            for (int i = stringNumber.length() - 1; i >= 0; i--) {
                reversedInput = reversedInput + stringNumber.charAt(i);
            }

            if (stringNumber.equals(reversedInput)) {
                System.out.println("It is a palindrome");
            } else {
                System.out.println("It is not a palindrome");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
