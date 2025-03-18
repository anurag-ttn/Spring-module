package com.demo.service;

import com.demo.domain.Order;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class OrderServiceTest {

    @Mock
    private EmailService emailService;

    @InjectMocks
    private OrderService orderService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testPlaceOrderWithCc_ShouldReturnTrueAndNotifyCustomer() {
        Order order1 = new Order(1, "item1", 100.0);
        when(emailService.sendEmail(order1, "str")).thenReturn(true);
        boolean isNotified = orderService.placeOrder(order1, "str");
        assertTrue(isNotified);
        verify(emailService).sendEmail(order1, "str");
        assertEquals(240.0, order1.getPriceWithTax(), 0.001);
        assertTrue(order1.isCustomerNotified());
    }
}
