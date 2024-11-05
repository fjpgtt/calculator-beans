package com.mx.iwaconsolti.calculator.Config;

import com.mx.iwaconsolti.calculator.Services.DividedService;
import com.mx.iwaconsolti.calculator.Services.SumService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean("sum")
    public SumService sumService() {
        return new SumService();
    }

    @Bean("div")
    public DividedService dividedService() {
        return new DividedService();
    }
}
