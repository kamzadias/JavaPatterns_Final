package Factory;

public class MacBookFactory implements ComputerFactory {
    @Override
    public Computer createComputer() {
        return new MacBook();
    }
}
