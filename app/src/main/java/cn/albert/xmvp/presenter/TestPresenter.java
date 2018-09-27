package cn.albert.xmvp.presenter;

import cn.albert.xmvp.contract.ITestContract;
import cn.albert.xmvp.base.BasePresent;

/**
 * Description :
 *
 * @author slf
 * @date 2018/9/27/027  10:18
 * - generate by MvpAutoCodePlus plugin.
 */

public class TestPresenter extends BasePresent<ITestContract.View> implements ITestContract.Presenter {

    @Override
    public void getData() {
        getView().showData("teeeeeeeeeeeeeeeeeeeeeest!");
    }
}

