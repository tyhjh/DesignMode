package abstractfactory;

public interface ComputerFactory {

    /**
     * 组装CPU
     *
     * @return
     */
    Cpu buildCpu();

    /**
     * 组装主板
     *
     * @return
     */
    MotherBoard buildBoard();


    public static void main(String[] args) {
        ComputerFactory computerFactory=new HighwithFactory();
        computerFactory.buildBoard().boardName();
        computerFactory.buildCpu().cpuName();
    }
}
