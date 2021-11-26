package Decorator;

public class LinuxComputerDecorator extends ComputerDecorator {

    public LinuxComputerDecorator(Computer computer) {
        super(computer);
    }

    String LinuxFeatures(){
        return "Linux features";
    }

    @Override
    public String printModel() {
        return super.printModel() + LinuxFeatures();
    }
}