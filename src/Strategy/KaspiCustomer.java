package Strategy;

public class KaspiCustomer extends Customer{

    public KaspiCustomer() {
        paymentBehaviour = new Kaspi();
    }
}
