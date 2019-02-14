package duty;

public class Manager extends User {
    @Override
    public int limit() {
        return 2;
    }

    @Override
    public void approval() {
        System.out.println("项目经理审批通过");
    }
}
