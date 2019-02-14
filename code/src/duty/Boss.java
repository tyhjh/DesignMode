package duty;

public class Boss extends User{

    @Override
    public int limit() {
        return Integer.MAX_VALUE;
    }

    @Override
    public void approval() {
        System.out.println("老板审批通过");
    }
}
