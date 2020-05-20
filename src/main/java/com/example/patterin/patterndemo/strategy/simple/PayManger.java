package com.example.patterin.patterndemo.strategy.simple;

import com.example.patterin.patterndemo.strategy.service.IPayService;

/**
 * @author xiaobao.chen
 * Create at 2020/4/17
 */
public class PayManger {

    private IPayService iPayService;

    public PayManger(IPayService iPayService) {
        this.iPayService = iPayService;
    }

    public void pay(String payInfo) {
        iPayService.pay(payInfo);
    }
}
