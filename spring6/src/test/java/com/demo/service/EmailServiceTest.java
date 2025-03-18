package com.demo.service;

import com.demo.domain.Order;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class EmailServiceTest {

    private EmailService es;

    @Before
    public void setUp(){
        es = EmailService.getInstance();
    }

    @Test(expected = RuntimeException.class)
    public void testSendEmailWithoutCc_ShouldThrowRuntimeNotificationAndNotNotify(){
        Order order1 = new Order(3,"item1",200d);es.sendEmail(order1);
    }

    @Test
    public void testSendEmailWithCc_ShouldReturnTrueAndNotify(){
        Order order1 = new Order(2,"item1",1000d);
        assertTrue(es.sendEmail(order1,"string"));
        assertTrue(order1.isCustomerNotified());
    }
}