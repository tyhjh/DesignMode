package state;

public class NeedPhoneState implements OperateState {
    @Override
    public void share() {
        System.out.println("分享到朋友圈成功");
    }

    @Override
    public void like() {
        System.out.println("点赞成功");
    }

    @Override
    public void collect() {
        System.out.println("请先绑定手机号");
    }
}
