package com.mx.iwaconsolti.calculator02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public AdditionService additionService() {
        return new AdditionService();
    }

    @Bean
    public SubtractionService subtractionService() {
        return new SubtractionService();
    }
}
