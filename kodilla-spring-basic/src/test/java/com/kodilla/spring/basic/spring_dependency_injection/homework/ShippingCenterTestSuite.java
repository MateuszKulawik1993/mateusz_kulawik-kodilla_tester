package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ShippingCenterTestSuite {

    @Autowired
    private ShippingCenter shippingCenter;

    @Test
    public void shouldReturnSuccessWhenPackageIsDelivered() {
        String result = shippingCenter.sendPackage("123 Test St", 10.0);
        assertEquals("Package delivered to: 123 Test St", result);
    }

    @Test
    public void shouldReturnFailWhenPackageIsNotDelivered() {
        String result = shippingCenter.sendPackage("456 Test Ave", 35.0);
        assertEquals("Package not delivered to: 456 Test Ave", result);
    }
}
