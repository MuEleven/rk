package com.bw.rikao.presenter;

import com.bw.rikao.base.BasePresenter;
import com.bw.rikao.bean.TwoBean;
import com.bw.rikao.contract.IMainContract;
import com.bw.rikao.model.MainModel;

public class MainPresenter extends BasePresenter<IMainContract.IView> implements IMainContract.IPresenter {
    private MainModel mainModel;
    @Override
    protected void initModel() {
        mainModel = new MainModel();
    }

    @Override
    public void getMainData() {
        mainModel.getMainData(new IMainContract.IModel.IModelCallBack() {
            @Override
            public void onMainSuccess(TwoBean bean) {
                view.onMainSuccess(bean);
            }

            @Override
            public void onMainFailure(Throwable throwable) {
                view.onMainFailure(throwable);
            }
        });
    }
}
