package com.vindy.demo;

/**
 * 使用构建模式。
 */
public class Order {
    private String id;
    private String orderId;
    private String produtName;
    private String produtId;

    public Order() {

    }

    public static Order builder(){
        return new Order();
    }

    public Order id( String id){
        this.id = id;
        return this;
    }
    public Order orderId( String orderId){
        this.orderId = orderId;
        return this;
    }
    public Order produtId( String produtId){
        this.produtId = produtId;
        return this;
    }
    public Order produtName( String produtName){
        this.produtName = produtName;
        return this;
    }
    public Order build(){
        validte();
        return this;
    }

    private void validte() {
        //校验规则；
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", orderId='" + orderId + '\'' +
                ", produtName='" + produtName + '\'' +
                ", produtId='" + produtId + '\'' +
                '}';
    }
}
