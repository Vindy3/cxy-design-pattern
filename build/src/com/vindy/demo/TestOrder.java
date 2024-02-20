package com.vindy.demo;

public class TestOrder {

    public static void main(String[] args) {
        Order order1 = Order.builder()
                .id("123")
                .orderId("123")
                .produtName("商品1")
                .produtId("454").build();
        System.out.println(order1);

        Order order2 = Order.builder()
                .id("234")
                .orderId("234")
                .produtName("商品2")
                .produtId("542").build();
        System.out.println(order2);

        Order order3 = Order.builder()
                .id("345")
                .orderId("345")
                .produtName("商品3")
                .produtId("564").build();
        System.out.println(order3);


    }
}
