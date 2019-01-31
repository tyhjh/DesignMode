package abstractfactory;

public class MediumFactory implements ComputerFactory {
    @Override
    public Cpu buildCpu() {
        return new ACpu();
    }

    @Override
    public MotherBoard buildBoard() {
        return new BoardB250();
    }
}
