package cn.albert.xmvp.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseActivity<P extends BaseContract.IPresent> extends RxAppCompatActivity implements BaseContract.IView {

    private P p;
    private Unbinder unbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getPresent();
        if (getLayoutId() > 0) {
            setContentView(getLayoutId());
            unbinder = ButterKnife.bind(this);
        }
    }

    public P getPresent() {
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

        if (getPresent() != null) {
            getPresent().detachView();
        }

        p = null;
    }
}
