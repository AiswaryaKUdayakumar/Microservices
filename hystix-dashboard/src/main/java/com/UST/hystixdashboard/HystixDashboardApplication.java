package com.UST.hystixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableHystrixDashboard
@EnableEurekaClient

public class HystixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystixDashboardApplication.class, args);
	}

}
