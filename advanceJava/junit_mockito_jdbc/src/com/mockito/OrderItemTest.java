package com.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class OrderItemTest {

    @Mock
    private PaymentGateway pg;

    @InjectMocks
    private OrderItem oi;

    @Test
    void placeOrder_shouldReturnSuccessMessage_whenPaymentSucceeds() {
        when(pg.processPayment(500.0)).thenReturn(true);

        String res = oi.placeOrderItem(500.0);

        assertEquals("Order Placed Successfully", res);
    }
}
