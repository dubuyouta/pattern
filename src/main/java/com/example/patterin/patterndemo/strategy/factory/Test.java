package com.example.patterin.patterndemo.strategy.factory;

/**
 * @author xiaobao.chen
 * Create at 2020/4/20
 */
public class Test {

    private static String aliPayKey = "ALI";

    private static String weChatPayKey = "WECHAT";

    public static void main(String[] args) {
        PayServiceStrategyFactory.getPayService(aliPayKey).pay("test-aliPayKey");
        PayServiceStrategyFactory.getPayService(weChatPayKey).pay("test-weChatPayKey");

        PayServiceEnumStrategyFactory.getPayService(PayTypeEnum.ALI).pay("test-aliPayKey-enum");
        PayServiceEnumStrategyFactory.getPayService(PayTypeEnum.WECHAT).pay("test-weChatPayKey-enum");
    }
}
