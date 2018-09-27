package cn.albert.xmvp.view;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.albert.xmvp.R;
import cn.albert.xmvp.base.BaseActivity;
import cn.albert.xmvp.contract.ITestContract;
import cn.albert.xmvp.presenter.TestPresenter;

/**
 * Description :
 *
 * @author slf
 * @date 2018/9/27/027  10:18
 * - generate by MvpAutoCodePlus plugin.
 */

public class TestActivity extends BaseActivity<TestPresenter> implements ITestContract.View {

    @BindView(R.id.txt)
    TextView txt;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void showData(String t) {
        txt.setText(t);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getPresenter().getData();
    }
}

