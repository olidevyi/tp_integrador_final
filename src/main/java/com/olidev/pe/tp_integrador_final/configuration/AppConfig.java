package com.olidev.pe.tp_integrador_final.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
