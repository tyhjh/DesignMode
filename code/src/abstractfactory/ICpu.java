package abstractfactory;

public class ICpu implements Cpu{
    @Override
    public void cpuName() {
        System.out.println("i7 9700k");
    }
}
