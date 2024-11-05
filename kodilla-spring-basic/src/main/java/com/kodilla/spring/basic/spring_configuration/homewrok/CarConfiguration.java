package com.kodilla.spring.basic.spring_configuration.homewrok;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class CarConfiguration {

    @Bean
    public Car car() {
        Month currentMonth = LocalDate.now().getMonth();

        if (currentMonth == Month.JUNE || currentMonth == Month.JULY || currentMonth == Month.AUGUST) {
            return new Cabrio();
        } else if (currentMonth == Month.DECEMBER || currentMonth == Month.JANUARY || currentMonth == Month.FEBRUARY) {
            return new SUV();
        } else {
            return new Sedan();
        }
    }
}