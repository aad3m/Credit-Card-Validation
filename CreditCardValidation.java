import java.util.Scanner;

public class CreditCardValidation {
    public static void main(String[] args){
        System.out.println("Welcome to Credit Card Validator");

        // Get user input
        Scanner scrn = new Scanner(System.in);
        System.out.print("Enter an 8-digit number: ");
        String userinput = scrn.nextLine();

        // Validate user input
        if (userinput.length() != 8){
            System.out.println("That's not an 8-digit number!! ");
            return;
        }

        // Calculate double digit sum
        int ddsum = 0;
        for (int i = 0; i < userinput.length(); i += 2) {
            char c = userinput.charAt(i);
            int n = Character.getNumericValue(c);
            n *= 2;
            if (n >= 10) {
                ddsum += (n % 10) + (n / 10);
            }
            else {
                ddsum += n;
            }

        }

        // Calculate remaining digits sum
        int rdsum = 0;
        for (int i = 1; i < userinput.length(); i += 2) {
            char c = userinput.charAt(i);
            int n = Character.getNumericValue(c);
            rdsum += n;
        }


        // Validate credit card
        int total = ddsum + rdsum;
        if (total % 10 == 0) {
            System.out.println("Valid credit card number"); }
        else {
            System.out.println("Invalid credit card number");
        }




    }
}