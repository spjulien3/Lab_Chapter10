package program1;

import java.util.Scanner;

public class TestLoan {
    /**
     * Main method
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 1;
        while (x == 1) {

            // Create a Loan object
            Loan carLoan = new Loan(.085, 5, 15000);

            //Display loan date, monthly payment, and total payment
            //will display:
            //The loan was created on Thu Jan 25 11:24:51 EST 2018
            //The monthly payment is 250.54
            //The total payment is 15032.43

            System.out.printf("The loan was created on %s\n" + "The monthly payment is %.2f\nThe total payment is %.2f\n",
                    carLoan.getLoanDate().toString(), carLoan.getMonthlyPayment(), carLoan.getTotalPayment());
            System.out.println("If you wish to run again press '1'. To quit the program press '0'");
            x = input.nextInt();
        }
    }
}

