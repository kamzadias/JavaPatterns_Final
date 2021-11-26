package Bridge;

public abstract class Computer {
    public Color color;
    public Memory memory;

    public Computer(Color color, Memory memory)
    {
        this.color = color;
        this.memory = memory;
    }

    abstract public void applyColor();
    abstract public void applyMemory();
}

