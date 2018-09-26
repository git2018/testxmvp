package cn.albert.xmvp.hello;

import cn.albert.xmvp.base.BaseContract;

public class HelloContract {
    interface View extends BaseContract.IView {
        void showData(String s);
    }

    interface Presenter extends BaseContract.IPresenter<View> {
        void getData();
    }

    interface Model extends BaseContract.IModel {
    }
}
