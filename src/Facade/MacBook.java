package Facade;

public class MacBook implements ComputerShop{


    @Override
    public void showModel() {
        System.out.println("MacBook Pro");
    }
    @Override
    public void price() {
        System.out.println("1 309 990 ₸");
    }

    @Override
    public void showCharacteristics() {
        System.out.println("The MacBook Pro is our most powerful laptop. " +
                "A fast chip from the M1 line, stunning graphics and a great Retina display. " +
                "Now with a diagonal of 14 inches.");
    }
}
