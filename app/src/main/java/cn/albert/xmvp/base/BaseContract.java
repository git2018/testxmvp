package cn.albert.xmvp.base;

import android.os.Bundle;

public interface BaseContract {

    interface IModel {
    }


    interface IView {
        int getLayoutId();
    }

    interface IPresenter<V>{
        V getView();
        void attachView(V view);
        void detachView();
        boolean hasView();
    }
}
