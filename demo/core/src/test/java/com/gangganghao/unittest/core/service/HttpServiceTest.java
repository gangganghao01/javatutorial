package com.gangganghao.unittest.core.service;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.gangganghao.unittest.pojo.http.ResponseVO;

/**
 * HttpService 单元测试类
 **/
@RunWith(MockitoJUnitRunner.class)
public class HttpServiceTest {

    /**
     * Mock 对象
     */
    @Mock
    private HttpService httpService;

    /**
     * Mock测试post
     */
    @Test
    public void testCallServer() {
        // 定义Mock对象行为
        Mockito.doNothing().when(httpService).post(Mockito.anyString());
        String uri = "test";
        // 执行方法
        httpService.post(uri);
        // 校验结果
        Mockito.verify(httpService, Mockito.times(1)).post(uri);
    }

    /**
     * Mock测试postForResponse
     */
    @Test
    public void testPostForResponse() {
        // 准备测试数据
        String responseCode = "testCode";
        ResponseVO<Integer> responseVO = new ResponseVO<Integer>();
        responseVO.setCode(responseCode);
        String uri = "test";
        // 定义Mock对象行为
        Mockito.when(httpService.postForResponse(Mockito.anyString(), Mockito.anyMapOf(String.class, Object.class)))
                .thenReturn(responseVO);
        Map<String, Object> params = new HashMap<String, Object>();
        // 执行方法
        ResponseVO<Integer> testResponseVO = httpService.postForResponse(uri, params);
        // 校验结果
        Assert.assertEquals(responseCode, testResponseVO.getCode());
        Mockito.verify(httpService, Mockito.times(1)).postForResponse(uri, params);
    }
}