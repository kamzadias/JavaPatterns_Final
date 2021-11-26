package Strategy;

public class Customer {
    PaymentBehaviour paymentBehaviour;

    public Customer(){

    }

    public void Pay(){
        paymentBehaviour.pay();
    }

    public PaymentBehaviour getPaymentBehaviour() {
        return paymentBehaviour;
    }

    public void setPaymentBehaviour(PaymentBehaviour paymentBehaviour) {
        this.paymentBehaviour = paymentBehaviour;
    }
}
