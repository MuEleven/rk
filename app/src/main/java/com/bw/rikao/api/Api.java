package com.bw.rikao.api;

import com.bw.rikao.bean.MyBean;

import retrofit2.Call;

public interface Api {

    Call<MyBean> getNews();
}
