package com.gangganghao.unittest.core.service;

import java.util.Map;

import com.gangganghao.unittest.pojo.http.ResponseVO;

/**
 * Http service
 **/
public interface HttpService {

    /**
     * post请求
     *
     * @param uri 请求地址
     */
    void post(String uri);

    /**
     * post请求
     *
     * @param uri    请求地址
     * @param params 请求参数
     *
     * @return ResponseVO 请求返回
     */
    ResponseVO<Integer> postForResponse(String uri, Map<String, Object> params);
}
