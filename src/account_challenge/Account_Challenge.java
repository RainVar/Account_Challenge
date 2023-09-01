/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account_challenge;

/**
 *
 * @author User
 */
public class Account_Challenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BankAccount account = new BankAccount();
        account.setAccountNumber(12345);
        account.setAccountBalance(1000);
        account.setName("John Doe");
        account.setEmail("john@example.com");
        account.setPhoneNumber("1234567890");

        System.out.println("Initial account balance: " + account.getAccountBalance());

        boolean depositSuccess = account.deposit(500);  // Deposit $500
        if (depositSuccess) {
            System.out.println("Deposit successful. New balance: " + account.getAccountBalance());
        } else {
            System.out.println("Deposit failed.");
        }

        boolean withdrawSuccess = account.withdraw(200); // Withdraw $200
        if (withdrawSuccess) {
            System.out.println("Withdrawal successful. New balance: " + account.getAccountBalance());
        } else {
            System.out.println("Withdrawal failed.");
        }

        System.out.println("Final account balance: " + account.getAccountBalance());
    }
}

    
