package Facade;

public class Lenovo implements ComputerShop{
    @Override
    public void showModel() {
        System.out.println("Lenovo IdeaPad L3");
    }
    @Override
    public void price() {
        System.out.println("344 990 ₸");
    }

    @Override
    public void showCharacteristics() {
        System.out.println("The Lenovo IdeaPad L3 laptop has everything you might need from a laptop for everyday use." +
                "The FHD display, stereo speakers and a battery that supports long battery life will allow you to enjoy " +
                "your favorite movies and TV shows wherever you are.");
    }
}