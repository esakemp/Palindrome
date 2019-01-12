import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("enter word 'exit' to quit");

        Scanner scanner = new Scanner(System.in);

        while(true) {

            System.out.println("Give a string: ");
            String string = scanner.nextLine();

            if (palindrome(string)) {
                System.out.println("\nString '" + string + "' is a palindrome \n");
            } else if (string.equals("exit")) {
                break;
            } else {
                System.out.println("\nString '" + string + "' isn't a palindrome \n");
            }
        }
    }

    public static boolean palindrome(String string) {

        String reverse = "";

        for(int i = string.length() - 1; i >= 0 ; i--) {
            reverse = reverse + string.charAt(i);
        }

        if(reverse.equalsIgnoreCase(string)) {
            return true;
        }
        return false;
    }
}
