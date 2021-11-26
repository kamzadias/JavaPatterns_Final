package Decorator;

public class BasicComputer implements Computer {

    @Override
    public String printModel() {
        return "Basic computer with DOS OS modified by ";
    }

}
