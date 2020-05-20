package com.example.patterin.patterndemo.strategy.simple;

import com.example.patterin.patterndemo.strategy.service.impl.AliPayServiceImpl;
import com.example.patterin.patterndemo.strategy.service.impl.WeChatPayServiceImpl;

/**
 * @author xiaobao.chen
 * Create at 2020/4/17
 */
public class Test {

    private static String aliPayKey = "ALI";

    private static String weChatPayKey = "WECHAT";

    public static void main(String[] args) {
        String strategyKey = aliPayKey;

        PayManger aliPay = new PayManger(new AliPayServiceImpl());
        PayManger weChatPay = new PayManger(new WeChatPayServiceImpl());

        if (strategyKey.equals(aliPayKey)) {
            aliPay.pay("alipay test");
        }
        if (strategyKey.equals(weChatPayKey)) {
            weChatPay.pay("wechatpay test");
        }
    }
}
