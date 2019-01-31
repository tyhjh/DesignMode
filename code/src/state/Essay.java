package state;

public class Essay {
    //未登录
    private static final int NEED_REGISTER = 1;
    //没有绑定手机号
    private static final int NEED_PHONE = 2;
    //正常登录
    private static final int REGISTERED = 3;
    /**
     * 当前状态
     */
    private int mState = 1;

    /**
     * 点赞，登录就可以了
     */
    public void like() {
        if (mState == NEED_REGISTER) {
            System.out.println("请先登录");
        } else if (mState == NEED_PHONE || mState == REGISTERED) {
            System.out.println("点赞成功");
        }
    }

    /**
     * 分享，可以随意分享
     */
    public void share() {
        System.out.println("分享到朋友圈成功");
    }

    /**
     * 收藏，必须绑定手机号
     */
    public void collect() {
        if (mState == NEED_REGISTER) {
            System.out.println("请先登录");
        } else if (mState == NEED_PHONE) {
            System.out.println("请先绑定手机号");
        } else if (mState == REGISTERED) {
            System.out.println("收藏成功");
        }
    }

    public int getmState() {
        return mState;
    }

    public void setmState(int mState) {
        this.mState = mState;
    }
}
