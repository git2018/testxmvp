package cn.albert.xmvp.contract;

import cn.albert.xmvp.base.BaseContract.IView;
import cn.albert.xmvp.base.BaseContract.IPresenter;

/**
 * Description :
 *
 * @author slf
 * @date 2018/9/27/027  10:18
 * - generate by MvpAutoCodePlus plugin.
 */

public interface ITestContract {
    interface View extends IView {
        void showData(String t);
    }

    interface Presenter extends IPresenter<View> {
        void getData();
    }
}
