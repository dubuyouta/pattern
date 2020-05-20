package com.example.patterin.patterndemo.strategy.factory;

import com.example.patterin.patterndemo.strategy.service.IPayService;
import com.example.patterin.patterndemo.strategy.service.impl.AliPayServiceImpl;
import com.example.patterin.patterndemo.strategy.service.impl.WeChatPayServiceImpl;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略+工厂+枚举
 *
 * @author xiaobao.chen
 * Create at 2020/4/20
 */
public class PayServiceEnumStrategyFactory {

    private final static Map<PayTypeEnum, IPayService> map = new HashMap<>();

    static {
        map.put(PayTypeEnum.ALI, new AliPayServiceImpl());
        map.put(PayTypeEnum.WECHAT, new WeChatPayServiceImpl());
    }

    public static IPayService getPayService(PayTypeEnum payType) {
        return map.get(payType);
    }
}
