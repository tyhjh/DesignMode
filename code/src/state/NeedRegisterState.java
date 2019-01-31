package state;

public class NeedRegisterState implements OperateState {

    @Override
    public void share() {
        System.out.println("分享到朋友圈成功");
    }

    @Override
    public void like() {
        System.out.println("请先登录");
    }

    @Override
    public void collect() {
        System.out.println("请先登录");
    }
}
