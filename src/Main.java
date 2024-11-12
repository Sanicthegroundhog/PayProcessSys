public class Main {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment();
        Payment paypal = new PayPalPayment();
        Payment bankTransfer = new BankTransferPayment();

        processPayment(creditCard, 150.0);
        processPayment(paypal, 200.5);
        processPayment(bankTransfer, 1000.0);
    }

    public static void processPayment(Payment paymentMethod, double amount){
        paymentMethod.processPayment(amount);
    }
}
