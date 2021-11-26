package Builder.Director;

import Builder.Builder;
import Builder.Computers.ComputerType;

public class Director {
    public void constructGamingComputer(Builder builder) {
        builder.setComputerType(ComputerType.gaming);
        builder.setGPU("Intel Core I9");
        builder.setRAM(8);
        builder.setSSD(1000);
        builder.setVideoCard("NVIDIA");
    }

    public void constructOfficeComputer(Builder builder) {
        builder.setComputerType(ComputerType.office);
        builder.setGPU("Intel Core I5");
        builder.setRAM(4);
        builder.setSSD(512);
        builder.setVideoCard("NVIDIA");
    }
}
