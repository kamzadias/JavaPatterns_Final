package Builder;


import Builder.Computers.ComputerType;

public interface Builder {
    void setComputerType(ComputerType computerType);
    void setRAM(int ram);
    void setSSD(int ssd);
    void setGPU(String gpu);
    void setVideoCard(String videoCard);
}
