package com.project.api.config;

import org.springframework.context.annotation.Configuration;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

@Configuration
public class StudentConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
