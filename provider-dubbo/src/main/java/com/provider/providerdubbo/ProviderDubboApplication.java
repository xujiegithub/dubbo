package com.provider.providerdubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class ProviderDubboApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderDubboApplication.class, args);
	}

}
