package abstractfactory;

public class ACpu implements Cpu {
    @Override
    public void cpuName() {
        System.out.println("Ryzen 5 1500X");
    }
}
