public class CreditCart {
    private String accountNumber;
    private double balance;

    public CreditCart(String accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public void deposit(double sum){
        balance+=sum;
    }
    public void withdrawal(double sum){
        if (balance-sum < 0){
            System.out.println("insufficient funds on the card");
        }
        else
            balance -= sum;
    }

    public void cartInfo(){
        System.out.println("account number: "+this.accountNumber);
        System.out.println("balance: "+ this.balance);
    }
}
