package com.omar.order.orderline;


public record OrderLineResponse(
        Integer id,
        double quantity
) { }