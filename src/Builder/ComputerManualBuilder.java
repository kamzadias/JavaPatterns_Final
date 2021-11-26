package Builder;

import Builder.Computers.ComputerType;
import Builder.Computers.Manual;


public class ComputerManualBuilder implements Builder{
    private ComputerType computerType;
    private int ram;
    private int ssd;
    private String gpu;
    private String videoCard;

    public void setComputerType(ComputerType computerType) {
        this.computerType = computerType;
    }

    @Override
    public void setRAM(int ram) {
        this.ram = ram;
    }

    @Override
    public void setSSD(int ssd) {
        this.ssd = ssd;
    }

    @Override
    public void setGPU(String gpu) {
        this.gpu = gpu;
    }

    @Override
    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public Manual getResult() {
        return new Manual(computerType, ram, ssd, gpu, videoCard);
    }
}
