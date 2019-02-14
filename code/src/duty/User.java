package duty;

public abstract class User {

    /**
     * 上一级领导
     */
    protected User nextUser;

    /**
     * 处理请假
     *
     * @param vacation 请假
     */
    public final void handleRequest(Vacation vacation) {
        if (vacation.days <= limit()) {
            approval();
        } else {
            if (null != nextUser) {
                nextUser.handleRequest(vacation);
            }
        }
    }

    /**
     * 能审批的天数
     *
     * @return 天数
     */
    public abstract int limit();

    /**
     * 请假审批
     */
    public abstract void approval();
}
