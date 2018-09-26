package cn.albert.xmvp.hello;

import cn.albert.xmvp.base.BasePresent;

public class HelloPresenter extends BasePresent<HelloContract.View> implements HelloContract.Presenter {
    @Override
    public void getData() {
        getView().showData("HelloPresenter 提供的数据");
    }
}
