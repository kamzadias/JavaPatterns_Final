package Factory;

public class AcerComputerFactory implements ComputerFactory {

    @Override
    public Computer createComputer() {
        return new AcerComputer();
    }
}
