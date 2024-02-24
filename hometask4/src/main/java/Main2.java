public class Main2 {
    public static void main(String[] args) {
        CreditCart user1 = new CreditCart("03234022",1000);
        CreditCart user2 = new CreditCart("44805475",2000);
        CreditCart user3 = new CreditCart("10807545",1500);

        user1.deposit(500);
        user2.deposit(1500);
        user3.withdrawal(1600);
        user3.withdrawal(1000);

        user1.cartInfo();
        user2.cartInfo();
        user3.cartInfo();


    }
}
