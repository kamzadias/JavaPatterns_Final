package Facade;

public class Acer implements ComputerShop{
    @Override
    public void showModel() {
        System.out.println("Asus ROG Strix G15");
    }
    @Override
    public void price() {
        System.out.println("419 990 ₸");
    }

    @Override
    public void showCharacteristics() {
        System.out.println("ROG Strix G15/17 is a gaming platform for the mass user. " +
                "Thanks to its powerful configuration, which can include an AMD Ryazan 7 4800H processor and an " +
                "NVIDIA GeForce GTX 1650 graphics card, this laptop is suitable for a wide range of tasks.");
    }

}