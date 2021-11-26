package Strategy;

public class Kaspi implements PaymentBehaviour {
    @Override
    public void pay() {
        System.out.println("Paid using Kaspi.");
    }
}
