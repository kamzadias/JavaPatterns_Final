package Factory;

public class LenovoComputerFactory implements ComputerFactory {

    @Override
    public Computer createComputer(){
        return new LenovoComputer();
    }
}
