package com.omar.order.kafka;


import com.omar.order.customer.CustomerResponse;
import com.omar.order.order.PaymentMethod;
import com.omar.order.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}