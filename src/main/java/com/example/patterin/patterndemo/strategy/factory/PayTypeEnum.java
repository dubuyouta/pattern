package com.example.patterin.patterndemo.strategy.factory;

/**
 * @author xiaobao.chen
 * Create at 2020/4/20
 */
public enum PayTypeEnum {
    /** ali-pay */
    ALI(1, "ali-pay"),

    /** wechat-pay */
    WECHAT(2, "wechat-pay"),
    ;

    private int value;

    private String description;

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    PayTypeEnum(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public static PayTypeEnum valueOf(int value) {
        for (PayTypeEnum anEnum : values()) {
            if (value == anEnum.getValue()) {
                return anEnum;
            }
        }
        throw new IllegalArgumentException();
    }
}
