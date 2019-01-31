package abstractfactory;

public class HighwithFactory implements ComputerFactory {
    @Override
    public Cpu buildCpu() {
        return new ICpu();
    }

    @Override
    public MotherBoard buildBoard() {
        return new BoardZ390();
    }
}
