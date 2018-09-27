package cn.albert.xmvp.base;

public interface BaseContract {

    interface IModel {
    }


    interface IView<P extends IPresenter> {
        int getLayoutId();
        P getPresenter();
    }

    interface IPresenter<V extends IView>{
        V getView();
        void attachView(V view);
        void detachView();
        boolean hasView();
    }
}
