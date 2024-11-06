package com.kodilla.spring.basic.spring_scopes.homework;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClockTestSuite {
    @Test
    void shouldReturnDifferentTimeForEachBeanInstance() {
        // Tworzymy kontekst Springa, który zarządza naszymi beanami
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_scopes");

        // Pobieramy dwa różne beany Clock
        Clock clock1 = context.getBean(Clock.class);
        Clock clock2 = context.getBean(Clock.class);

        // Sprawdzamy, czy czas w obu instancjach jest różny
        Assertions.assertNotEquals(clock1.getTime(), clock2.getTime(), "Czas w obu beanach powinien być różny");
    }
}
