package java_tasks;

import java.util.Scanner;

public class Task016_ATM_Withdrawal {
    public static void main(String[] args) {
        int balance = 20000;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Amount you want to withdraw: ");
        int amount = scan.nextInt();

        if (amount <= 0){
            System.out.println("Invalid: Please enter amount greater than 0");
        } else if (amount % 100 != 0) {
            System.out.println("Invalid: Amount must be multiple of 100");

        } else if (amount > balance) {
            System.out.println("Insufficient Balance");
            
        }else {
            balance -= amount;
            System.out.println("Withdrawal Successful");
            System.out.println("Balance Remaining " + balance);
        }
    }
}
