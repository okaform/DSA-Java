package week08;

public class eightDotTwo {
    public static void main(String[] args) {
        //step 1
        System.out.println("This program tests the BankAccount class by ... ");
        //step2
        System.out.println("...Creating account number 123 with an initial balance of $5.00");
        BankAccount bnk = new BankAccount(123,5);
        //step3
        double deposit = 10.50;
        System.out.println("...Making a deposit of $" + deposit);
        bnk.makeDeposit(deposit);

        //step4
        double deposit2 = 3.25;
        System.out.println("...Making a deposit of $" + deposit2);
        bnk.makeDeposit(deposit2);

        //step5
        double withdraw = 1.50;
        System.out.println("...Making a withdrawal of $"+withdraw);
        bnk.makeWithdrawal(withdraw);

        //step6
        System.out.println("The balance in account number" + bnk.getAccountNumber() + " is $" + bnk.getBalance());
        //step7
        System.out.println("Goodbye ...");

    }

    public static class BankAccount {
        public int accountNumber;
        public double balance;

        public BankAccount () {
            this.accountNumber = 0;
            this.balance = 0;
        }

        public BankAccount(int accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public double getBalance() {
            return balance;
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        public double makeDeposit(double value) {
            return this.balance+=value;
        }

        public double makeWithdrawal(double value) {
            return this.balance -=value;
        }
    }
}
