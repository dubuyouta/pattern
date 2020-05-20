package com.example.patterin.patterndemo.strategy.service.impl;

import com.example.patterin.patterndemo.strategy.factory.PayTypeEnum;
import com.example.patterin.patterndemo.strategy.service.IPayService;
import org.springframework.stereotype.Service;

/**
 * @author xiaobao.chen
 * Create at 2020/4/17
 */
@Service
public class WeChatPayServiceImpl implements IPayService {

    @Override
    public void pay(String payInfo) {
        System.out.println(payInfo);
    }

    @Override
    public PayTypeEnum getPayTypeEnum() {
        return PayTypeEnum.WECHAT;
    }
}
