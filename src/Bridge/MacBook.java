package Bridge;

public class MacBook extends Computer {
    public MacBook(Color color, Memory memory) {
        super(color, memory);
    }

    @Override
    public void applyColor()
    {
        System.out.print("MacBook with ");
        color.applyColor();
    }
    @Override
    public void applyMemory() {
        System.out.println("Memory has ");
        memory.applyMemory();
    }
}