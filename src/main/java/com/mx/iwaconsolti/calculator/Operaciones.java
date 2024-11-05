package com.mx.iwaconsolti.calculator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Operaciones implements Operadores {

    /*  @Override
    @Bean
    public Suma Suma() {
       return new Suma();
    }*/

  /*  @Override
    @Bean
    public Resta Resta() {
       return new Resta();
    }*/

    @Override
    @Bean
    public Multiplicacion Multiplicacion() {
        return new Multiplicacion();
    }

    @Override
    @Bean
    public Division Division() {
        return new Division();
    }
}
