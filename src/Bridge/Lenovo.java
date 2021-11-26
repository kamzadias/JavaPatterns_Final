package Bridge;

public class Lenovo extends Computer {
    public Lenovo(Color color, Memory memory) {
        super(color, memory);
    }

    @Override
    public void applyColor(){
            System.out.print("Lenovo with ");
            color.applyColor();
    }

    @Override
    public void applyMemory() {
        System.out.println("Memory has ");
        memory.applyMemory();
    }
}