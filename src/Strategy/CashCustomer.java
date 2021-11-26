package Strategy;

public class CashCustomer extends Customer{

    public CashCustomer() {
        paymentBehaviour = new Cash();
    }
}
