package duty;

public class Director extends User {

    @Override
    public int limit() {
        return 5;
    }

    @Override
    public void approval() {
        System.out.println("主管审批通过");
    }
}
