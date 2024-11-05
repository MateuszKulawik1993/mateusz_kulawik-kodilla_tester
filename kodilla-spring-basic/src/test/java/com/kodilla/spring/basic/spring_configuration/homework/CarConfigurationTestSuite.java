package com.kodilla.spring.basic.spring_configuration.homework;

import com.kodilla.spring.basic.spring_configuration.homewrok.Car;
import com.kodilla.spring.basic.spring_configuration.homewrok.CarConfiguration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarConfigurationTest {

    private AnnotationConfigApplicationContext context;

    @BeforeEach
    public void setup() {
        context = new AnnotationConfigApplicationContext(CarConfiguration.class);
    }

    @Test
    public void shouldReturnCabrioInSummer() {
        Car car = context.getBean(Car.class);
        String carType = car.getCarType();

        // Przyjmujemy, że jest lato (możemy skonfigurować czas na czerwiec)
        if (isSummer()) {
            assertEquals("Cabrio", carType, "Latem powinno być Cabrio");
        }
    }

    @Test
    public void shouldReturnSUVInWinter() {
        Car car = context.getBean(Car.class);
        String carType = car.getCarType();

        // Przyjmujemy, że jest zima (możemy skonfigurować czas na grudzień)
        if (isWinter()) {
            assertEquals("SUV", carType, "Zimą powinno być SUV");
        }
    }

    @Test
    public void shouldReturnSedanInSpringOrAutumn() {
        Car car = context.getBean(Car.class);
        String carType = car.getCarType();

        // Przyjmujemy, że jest wiosna lub jesień (marzec-maj lub wrzesień-listopad)
        if (isSpringOrAutumn()) {
            assertEquals("Sedan", carType, "Wiosną i jesienią powinien być Sedan");
        }
    }

    @Test
    public void shouldHaveHeadlightsOnAtNight() {
        Car car = context.getBean(Car.class);

        LocalTime testTime = LocalTime.of(21, 0);  // Czas wieczorny
        boolean headlightsOn = car.hasHeadlightsTurnedOn();

        if (testTime.isAfter(LocalTime.of(20, 0)) || testTime.isBefore(LocalTime.of(6, 0))) {
            assertTrue(headlightsOn, "Światła powinny być włączone między 20:00 a 06:00");
        }
    }

    @Test
    public void shouldHaveHeadlightsOffDuringTheDay() {
        Car car = context.getBean(Car.class);

        LocalTime testTime = LocalTime.of(12, 0);  // Czas dzienny
        boolean headlightsOn = car.hasHeadlightsTurnedOn();

        if (testTime.isAfter(LocalTime.of(6, 0)) && testTime.isBefore(LocalTime.of(20, 0))) {
            assertTrue(!headlightsOn, "Światła powinny być wyłączone w ciągu dnia między 06:00 a 20:00");
        }
    }

    // Metody pomocnicze do określenia pory roku
    private boolean isSummer() {
        return LocalDate.now().getMonth().equals(Month.JUNE) ||
                LocalDate.now().getMonth().equals(Month.JULY) ||
                LocalDate.now().getMonth().equals(Month.AUGUST);
    }

    private boolean isWinter() {
        return LocalDate.now().getMonth().equals(Month.DECEMBER) ||
                LocalDate.now().getMonth().equals(Month.JANUARY) ||
                LocalDate.now().getMonth().equals(Month.FEBRUARY);
    }

    private boolean isSpringOrAutumn() {
        return LocalDate.now().getMonth().equals(Month.MARCH) ||
                LocalDate.now().getMonth().equals(Month.APRIL) ||
                LocalDate.now().getMonth().equals(Month.MAY) ||
                LocalDate.now().getMonth().equals(Month.SEPTEMBER) ||
                LocalDate.now().getMonth().equals(Month.OCTOBER) ||
                LocalDate.now().getMonth().equals(Month.NOVEMBER);
    }
}