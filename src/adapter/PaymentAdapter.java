package adapter;

public class PaymentAdapter implements Payment {

    private OldPayment oldPayment;

    public PaymentAdapter(OldPayment oldPayment) {
        this.oldPayment = oldPayment;
    }

    @Override
    public void pay() {
        oldPayment.makePayment();
    }
}
