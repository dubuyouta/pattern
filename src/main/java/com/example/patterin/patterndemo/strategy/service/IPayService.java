package com.example.patterin.patterndemo.strategy.service;

import com.example.patterin.patterndemo.strategy.factory.PayTypeEnum;

/**
 * @author xiaobao.chen
 * Create at 2020/4/17
 */
public interface IPayService {

    void pay(String payInfo);

    PayTypeEnum getPayTypeEnum();
}
