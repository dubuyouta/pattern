package com.example.patterin.patterndemo.strategy.spring.construct;

import com.example.patterin.patterndemo.strategy.factory.PayTypeEnum;
import com.example.patterin.patterndemo.strategy.service.IPayService;
import com.example.patterin.patterndemo.strategy.service.impl.AliPayServiceImpl;
import com.example.patterin.patterndemo.strategy.service.impl.WeChatPayServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 策略+工厂+枚举
 *
 * @author xiaobao.chen
 * Create at 2020/4/20
 */
@Service
public class PayServiceEnumStrategyFactory {

    @Autowired
    private ApplicationContext applicationContext;

    private final static Map<PayTypeEnum, IPayService> map = new HashMap<>();

    /**
     * 容易引起循环引用
     *
     * @param payServiceList
     */
    public PayServiceEnumStrategyFactory(List<IPayService> payServiceList) {
        for (IPayService payService : payServiceList) {
            map.put(payService.getPayTypeEnum(), payService);
        }
    }

    /**
     * PostConstruct 注解实现延迟加载
     */
    @PostConstruct
    public void init() {
        Map<String, IPayService> serviceMap = applicationContext.getBeansOfType(IPayService.class);
        for (Map.Entry<String, IPayService> entry : serviceMap.entrySet()) {
            map.put(entry.getValue().getPayTypeEnum(), entry.getValue());
        }
    }

    public static IPayService getPayService(PayTypeEnum payType) {
        return map.get(payType);
    }

    public void pay(PayTypeEnum payType, String payInfo) {
        map.get(payType).pay(payInfo);
    }
}
