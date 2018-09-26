package cn.albert.xmvp.hello;

import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import cn.albert.xmvp.R;
import cn.albert.xmvp.base.BaseActivity;

public class HelloActivity extends BaseActivity<HelloPresenter> implements HelloContract.View {
    @BindView(R.id.txt)
    TextView txt;

    @Override
    public void showData(String s) {
        txt.setText(s);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getPresenter().getData();
    }
}
