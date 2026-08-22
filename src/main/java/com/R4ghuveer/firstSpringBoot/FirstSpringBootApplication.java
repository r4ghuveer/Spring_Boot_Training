package com.R4ghuveer.firstSpringBoot;

// creates Application Context, register all beans, starts embedded server and etc
import org.springframework.boot.SpringApplication;

// this package by default enables Auto configuration, Component scanning and additional configuration
import org.springframework.boot.autoconfigure.SpringBootApplication;

//explicitly scanning packages for dependency injection from packages different
//from the one that have spring boot framework main class
@SpringBootApplication
(
    scanBasePackages={"com.R4ghuveer.firstSpringBoot","com.R4ghuveer.thirdPartyPackage"}
    )
public class FirstSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootApplication.class, args);
	}

}
