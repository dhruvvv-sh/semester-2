class Bank{
    private static String bankName = "HDFC";
    static class Account{
        private String accountNumber;
        private double balance;
    Account(String accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void display(){
        System.out.println("bank name:"+bankName);
        System.out.println("Account number:"+accountNumber);
        System.out.println("Balance:"+balance);
    }
    }

}
public class AccountMain {
    public static void main(String[] args){
        Bank.Account b1 = new Bank.Account("12345",2590.45);
        b1.display();
    }
}
