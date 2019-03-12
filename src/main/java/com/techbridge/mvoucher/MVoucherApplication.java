package com.techbridge.mvoucher;

import org.hibernate.cfg.DefaultNamingStrategy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class MVoucherApplication {

	public static void main(String[] args) {

		SpringApplication.run(MVoucherApplication.class, args);
	}

}
