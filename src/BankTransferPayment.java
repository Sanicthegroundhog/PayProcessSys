public class BankTransferPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Bank Transfer payment of " + amount + " processed");
    }
}