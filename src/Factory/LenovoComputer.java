package Factory;

public class LenovoComputer implements Computer {

    @Override
    public void make() {
        System.out.println("Taken from the warehouse laptop model Lenovo");
    }
}
