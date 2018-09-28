package cn.albert.xmvp.hello;

import cn.albert.xmvp.base.BasePresent;

public class HelloPresenter extends BasePresent<HelloContract.IView> implements HelloContract.IPresenter {
    @Override
    public void getData() {
        getView().showData("HelloPresenter 提供的数据");
    }
}
