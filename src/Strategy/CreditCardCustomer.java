package Strategy;

public class CreditCardCustomer extends Customer{

    public CreditCardCustomer() {
        paymentBehaviour = new Cash();
    }
}
