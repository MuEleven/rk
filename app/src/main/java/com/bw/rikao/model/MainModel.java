package com.bw.rikao.model;

import com.bw.rikao.bean.TwoBean;
import com.bw.rikao.contract.IMainContract;
import com.bw.rikao.tools.NetUtil;
import com.google.gson.Gson;

public class MainModel implements IMainContract.IModel{

    @Override
    public void getMainData(IModelCallBack iModelCallBack) {
        String httpUrl = "http://172.17.8.100/small/commodity/v1/bannerShow";

        NetUtil.getInstance().getJsonGet(httpUrl, new NetUtil.MyCallBack() {
            @Override
            public void onGetJson(String json) {

                TwoBean bean = new Gson().fromJson(json, TwoBean.class);
                iModelCallBack.onMainSuccess(bean);
            }

            @Override
            public void onError(Throwable throwable) {
                iModelCallBack.onMainFailure(throwable);
            }
        });
    }
}

