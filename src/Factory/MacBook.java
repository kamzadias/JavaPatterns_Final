package Factory;

public class MacBook implements Computer {

    @Override
    public void make() {
        System.out.println("Taken from the warehouse laptop model MacBook");
    }
}
