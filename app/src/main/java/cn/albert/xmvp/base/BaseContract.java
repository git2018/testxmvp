package cn.albert.xmvp.base;

import android.os.Bundle;

public interface BaseContract {

    interface IModel {
    }


    interface IView {
        int getLayoutId();
    }

    interface IPresent<V> {
        void attachView(V view);
        void detachView();
        boolean hasView();
    }
}
