package Factory;

public class AcerComputer implements Computer {

    @Override
    public void make() {
        System.out.println("Taken from the warehouse laptop model Acer");
    }
}
