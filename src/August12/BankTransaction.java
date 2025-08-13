package August12;

import java.util.Scanner;

public class BankTransaction {
    public static void main(String[] args) {
        double amount;
        int choice;
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        do{
        System.out.println("0 for DEPOSIT \n 1 for BALANCE \n 2 for WITHDRAW \3 for Exit");
        choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("ENTER THE DEPOSIT AMOUNT");
                    amount = scanner.nextDouble();
                    double p = bank.deposit(amount);
                    System.out.println("New Balance is:" + p);
                    break;
                case 1:
                    double b = bank.balance();
                    System.out.println("New Balance is:" + b);
                    break;
                case 2:
                    System.out.println("Enter the withdrawal amount");
                    double a = scanner.nextDouble();
                    if (a > bank.getBalance()) {
                        throw new InsuficiantBalanceExeception("Insufficiant Balance");

                    }

                    double d = bank.withdraw(a);
                    System.out.println("New Balance is" + d);
                    break;
                default:
                    System.out.println("Invalid Entry");


            }
        }while (choice!=3);

    }
}
