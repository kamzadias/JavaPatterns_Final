package Facade;

public class ConsultantFacade {
    private ComputerShop MacBook;
    private ComputerShop Acer;
    private ComputerShop Lenovo;

    public ConsultantFacade(){
        MacBook = new MacBook();
        Acer = new Acer();
        Lenovo = new Lenovo();
    }
    public void MacBookSale(){
        MacBook.showModel();
        MacBook.price();
        MacBook.showCharacteristics();
    }
    public void AcerSale(){
        Acer.showModel();
        Acer.price();
        Acer.showCharacteristics();
    }
    public void LenovoSale(){
        Lenovo.showModel();
        Lenovo.price();
        Lenovo.showCharacteristics();
    }
}
