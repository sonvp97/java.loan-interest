import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the deposit amount:");
        double Deposits = scanner.nextDouble();
        System.out.println("Enter the number of months to send:");
        int Months = scanner.nextInt();
        System.out.println("Enter deposit interest:");
        double Interest = scanner.nextDouble();
        double totalInterest = 0;
        for(int i = 0; i < Months; i++){
            totalInterest += Deposits * (Interest/100)/12 * Months;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}