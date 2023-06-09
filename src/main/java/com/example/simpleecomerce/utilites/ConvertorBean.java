package com.example.simpleecomerce.utilites;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConvertorBean {

    @Bean
    @Scope("singleton")
    public DozerBeanMapper getMapper(){
        return new DozerBeanMapper();
    }
}
