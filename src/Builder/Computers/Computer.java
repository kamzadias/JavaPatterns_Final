package Builder.Computers;

public class Computer {
    private final ComputerType computerType;
    private final int ram;
    private final int ssd;
    private final String gpu;
    private final String videoCard;

    public Computer(ComputerType computerType, int ram,int ssd, String gpu, String videoCard) {
        this.computerType = computerType;
        this.ram = ram;
        this.ssd = ssd;
        this.gpu = gpu;
        this.videoCard = videoCard;
    }

    public ComputerType getComputerType() {
        return computerType;
    }

    public int getRAM() {
        return ram;
    }

    public int getSSD() {
        return ssd;
    }

    public String getGPU() {
        return gpu;
    }

    public String getVideoCard() {
        return videoCard;
    }
}
