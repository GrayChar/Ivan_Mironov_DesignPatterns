package adapter;

public class Main {
    public static void main(String[] args) {

        OldPayment oldPayment = new OldPayment();

        Payment payment = new PaymentAdapter(oldPayment);

        payment.pay();
    }
}
