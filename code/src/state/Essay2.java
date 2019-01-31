package state;

public class Essay2 {

    private OperateState operateState;

    public Essay2() {
        operateState = new NeedRegisterState();
    }

    /**
     * 改变状态
     *
     * @param operateState
     */
    public void changeState(OperateState operateState) {
        this.operateState = operateState;
    }

    public void like() {
        operateState.like();
    }

    public void share() {
        operateState.share();
    }

    public void collect() {
        operateState.collect();
    }
}
