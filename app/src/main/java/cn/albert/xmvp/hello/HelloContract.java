package cn.albert.xmvp.hello;

import cn.albert.xmvp.base.BaseContract;

public class HelloContract {
    interface IView extends BaseContract.IView {
        void showData(String s);
    }

    interface IPresenter extends BaseContract.IPresenter<IView> {
        void getData();
    }

    interface IModel extends BaseContract.IModel {
    }
}
