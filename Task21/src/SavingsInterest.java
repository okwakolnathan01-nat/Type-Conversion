import java.util.Scanner;
public class SavingsInterest {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("Enter deposit amount (UGX): ");
        int deposit = a.nextInt();
        double InterestRate = 0.055;

        double Interest = deposit * InterestRate;
        double Total = deposit + Interest;

        long RoundedInterest = (long) Interest;

        System.out.println("---MANAGEMENT ACCOUNTING REPORT---");
        System.out.println("Initial Deposit : UGX "+deposit);
        System.out.println("Interest : UGX "+ Interest);
        System.out.println("Rounded Interest: UGX "+ RoundedInterest);
        System.out.println("Total: UGX "+ Total);
    }
}
