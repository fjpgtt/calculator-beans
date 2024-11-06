package com.mx.iwaconsolti.calculator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LaAppConfig {

    @Bean
    public Resta resta(){ return new Resta();}

    @Bean
    public Divicion divicion(){ return new Divicion();}


}
