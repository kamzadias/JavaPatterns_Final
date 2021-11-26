package Decorator;

public class MacOSComputerDecorator extends ComputerDecorator {

    public MacOSComputerDecorator(Computer computer) {
        super(computer);
    }

    String MacOSFeatures(){
        return "macOS features";
    }

    @Override
    public String printModel() {
        return super.printModel() + MacOSFeatures();
    }
}