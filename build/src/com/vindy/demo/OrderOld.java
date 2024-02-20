package com.vindy.demo;

/**
 * 未使用构建模式。
 */
public class OrderOld {
    private String id;
    private String orderId;
    private String produtName;
    private String produtId;

    public OrderOld(String id, String orderId, String produtId) {
        this.id = id;
        this.orderId = orderId;
        this.produtId = produtId;
    }

    public OrderOld(String produtName, String produtId) {
        this.produtName = produtName;
        this.produtId = produtId;
    }


}
