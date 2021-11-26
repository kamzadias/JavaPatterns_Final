package Bridge;

public class Acer extends Computer {
    public Acer(Color color, Memory memory) {
        super(color, memory);
    }

    @Override
    public void applyColor(){
        System.out.print("Acer with ");
        color.applyColor();
    }

    @Override
    public void applyMemory() {
        System.out.println("Memory has ");
        memory.applyMemory();
    }
}
