package cn.albert.xmvp.testplugin;

import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.albert.xmvp.R;
import cn.albert.xmvp.base.BaseActivity;

/*
 * Created by AlbertSu at 2018/09/28 15:51:50.
 */

public class TestPluginActivity extends BaseActivity<TestPluginPresenter> implements TestPluginContract.IView {

    @BindView(R.id.txt)
    TextView txt;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void showData(String s) {
        txt.setText(s);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getPresenter().getData();
    }
}
