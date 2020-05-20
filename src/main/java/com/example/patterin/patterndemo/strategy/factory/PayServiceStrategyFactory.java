package com.example.patterin.patterndemo.strategy.factory;

import com.example.patterin.patterndemo.strategy.service.IPayService;
import com.example.patterin.patterndemo.strategy.service.impl.AliPayServiceImpl;
import com.example.patterin.patterndemo.strategy.service.impl.WeChatPayServiceImpl;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略+工厂
 *
 * @author xiaobao.chen
 * Create at 2020/4/20
 */
public class PayServiceStrategyFactory {

    private final static Map<String, IPayService> map = new HashMap<>();

    static {
        map.put("ALI", new AliPayServiceImpl());
        map.put("WECHAT", new WeChatPayServiceImpl());
    }

    public static IPayService getPayService(String payType) {
        return map.get(payType);
    }
}
