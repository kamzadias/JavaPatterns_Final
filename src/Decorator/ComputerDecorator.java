package Decorator;

public class ComputerDecorator implements Computer {

    public Computer computer;

    public ComputerDecorator(Computer computer) {
        this.computer = computer;
    }

    @Override
    public String printModel() {
        return computer.printModel();
    }
}
