package com.example.lizhongxiang.myblogs.http;


import com.example.lizhongxiang.myblogs.model.ZHAbstractModel;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by admin on 2018/6/9.
 */
public interface ZHApi {

    /**
     * 获取最新消息
     * @return
     */
    @GET("/api/4/news/latest")
    Call<ZHAbstractModel> newsLatest();

}
