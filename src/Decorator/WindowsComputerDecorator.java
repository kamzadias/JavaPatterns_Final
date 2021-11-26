package Decorator;

public class WindowsComputerDecorator extends ComputerDecorator {

    public WindowsComputerDecorator(Computer computer) {
        super(computer);
    }

    String WindowsFeatures(){
        return "Windows 11 features";
    }

    @Override
    public String printModel() {
        return super.printModel() + WindowsFeatures();
    }
}
