class Bank{
    private Account[] accounts;
    private int numAccounts;
    public Bank(int capacity){
        accounts = new Account[capacity];
        numAccounts = 0;
    }
    public void addAccount(String name,double initialBalance){
        if(numAccounts<accounts.length){
            accounts[numAccounts] = new Account(name,initialBalance);
            numAccounts++;
        }
        else{
            System.out.println("Bank is full, cannot add more accounts.");
        }
    }
    
    class Account{
        private String name;
        private double balance;
        public Account(String name,double initialBalance){
            this.name = name;
            this.balance = initialBalance;
        }
        public void deposit(double amount){
            balance = balance + amount;
            System.out.println("Amount deposited:"+amount);
        }
        public void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Amount withdrawn. New balance: " + balance);
            } else {
                System.out.println("Insufficient balance.");
            }
        }
        public void displayAccountDetails() {
            System.out.println("Account holder: " + name + ", Balance: " + balance);
        }

        // Method to get the balance (for sorting)
        public double getBalance() {
            return balance;
        }
    }
}
public class bank{
    public static void main(String[] args){

    }
}