package cn.albert.xmvp.base;

import java.lang.ref.WeakReference;

public class BasePresent<V extends BaseContract.IView> implements BaseContract.IPresent<V> {
    private WeakReference<V> v;

    @Override
    public void attachView(V view) {
        v = new WeakReference<>(view);
    }

    @Override
    public void detachView() {
        if (v.get() != null) {
            v.clear();
        }
        v = null;
    }

    public V getView() {
        if (v == null || v.get() == null) {
            throw new IllegalStateException("v can not be null");
        }
        return v.get();
    }


    @Override
    public boolean hasView() {
        return v != null && v.get() != null;
    }
}
