package cn.albert.xmvp.testplugin;

import cn.albert.xmvp.base.BasePresent;

/*
 * Created by AlbertSu at 2018/09/28 15:51:50.
 */

public class TestPluginPresenter extends BasePresent<TestPluginContract.IView> implements TestPluginContract.IPresenter {

    @Override
    public void getData() {
        getView().showData("TestPluginPresenter提供的数据");
    }
}