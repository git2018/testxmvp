package cn.albert.xmvp.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseActivity<P extends BaseContract.IPresenter> extends RxAppCompatActivity implements BaseContract.IView {

    private P p;
    private Unbinder unbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getPresenter();
        if (getLayoutId() > 0) {
            setContentView(getLayoutId());
            unbinder = ButterKnife.bind(this);
        }
    }

    @Override
    public P getPresenter() {
        if (p == null) {
            p = BaseUtil.getT(this, 0);
        }

        if (p != null) {
            if (!p.hasView()) {
                p.attachView(this);
            }
        }
        return p;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();

        if (getPresenter() != null) {
            getPresenter().detachView();
        }

        p = null;
    }
}
