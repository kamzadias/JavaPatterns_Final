package Strategy;

public class Cash implements PaymentBehaviour {
    @Override
    public void pay() {
        System.out.println("Paid using cash.");
    }
}
