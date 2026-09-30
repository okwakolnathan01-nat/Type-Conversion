import java.util.Scanner;
public class SavingsInterest {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("Enter deposit amount (UGX): ");
        int deposit = a.nextInt();
        double InterestRate = 0.055;

        double Interest = deposit * InterestRate;
    }
}
