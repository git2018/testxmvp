package cn.albert.xmvp.testplugin;

import cn.albert.xmvp.base.BaseContract;

/*
 * Created by AlbertSu at 2018/09/28 15:51:50.
 */

class TestPluginContract {

    interface IModel extends BaseContract.IModel {

    }

    interface IView extends BaseContract.IView {
        void showData(String s);
    }

    interface IPresenter extends BaseContract.IPresenter<IView> {
        void getData();
    }
}