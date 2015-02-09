package com.trader.application.config;

import javax.annotation.Resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(value="com.trader.application.controllers")
@EnableWebMvc
public class DispatcherConfig {
	
	
	
}
