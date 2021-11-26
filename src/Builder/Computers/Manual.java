package Builder.Computers;

public class Manual {
    private final ComputerType computerType;
    private final int ram;
    private final int ssd;
    private final String gpu;
    private final String videoCard;

    public Manual(ComputerType computerType, int ram,int ssd, String gpu, String videoCard) {
        this.computerType = computerType;
        this.ram = ram;
        this.ssd = ssd;
        this.gpu = gpu;
        this.videoCard = videoCard;
    }

    public String print() {
        String info = "";
        info += "Type of computer: " + computerType + "\n";
        info += "RAM: " + ram + "\n";
        info += "SSD: " + ssd + "\n";
        info += "GPU: " + gpu + "\n";
        info += "VideoCard: " + videoCard + "\n";

        return info;
    }
}
