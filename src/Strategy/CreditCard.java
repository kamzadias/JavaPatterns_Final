package Strategy;

public class CreditCard implements PaymentBehaviour {

    @Override
    public void pay() {
        System.out.println("Paid with credit/debit card");
    }
}
