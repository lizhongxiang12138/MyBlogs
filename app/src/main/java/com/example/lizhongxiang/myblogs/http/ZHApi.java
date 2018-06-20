package com.example.lizhongxiang.myblogs.http;


import com.example.lizhongxiang.myblogs.model.ZHAbstractModel;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

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

    @GET("{imagesUrl}")
    Call<ResponseBody> loadImage(@Path("imagesUrl") String imagesUrl);

}
