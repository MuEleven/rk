package com.bw.rikao;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bw.rikao.adapter.MyAdapter;
import com.bw.rikao.adapter.ThreeAdapter;
import com.bw.rikao.base.BaseActivity;
import com.bw.rikao.bean.TwoBean;
import com.bw.rikao.contract.IMainContract;
import com.bw.rikao.presenter.MainPresenter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity<MainPresenter> implements IMainContract.IView {

    @BindView(R.id.recy)
    RecyclerView recyclerView;

    @Override
    protected MainPresenter providePresenter() {
        return new MainPresenter();
    }

    @Override
    protected void initData() {
        mPresenter.getMainData();
    }

    @Override
    protected void initView() {

    }

    @Override
    protected int layoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void onMainSuccess(TwoBean bean) {
        List<TwoBean.ResultBean> data = bean.getResult();
        //布局管理器
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(linearLayoutManager);
        //适配器
        MyAdapter myAdapter = new MyAdapter(data);
        myAdapter.setOnItemClickLintLner(new MyAdapter.OnItemClickLintLner() {
            @Override
            public void OnItemClick(int posintion) {
                Toast.makeText(MainActivity.this, "这是个recycleview", Toast.LENGTH_SHORT).show();
            }
        });
        recyclerView.setAdapter(myAdapter);

    }

    @Override
    public void onMainFailure(Throwable throwable) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
