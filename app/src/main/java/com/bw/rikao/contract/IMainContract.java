package com.bw.rikao.contract;


import com.bw.rikao.bean.TwoBean;

public interface IMainContract {

    interface IView{
        void onMainSuccess(TwoBean bean);
        void onMainFailure(Throwable throwable);
    }

    interface IPresenter{
        void getMainData();
    }

    interface IModel{
        void getMainData(IModelCallBack iModelCallBack);

        interface IModelCallBack{
            void onMainSuccess(TwoBean bean);
            void onMainFailure(Throwable throwable);
        }
    }
}
