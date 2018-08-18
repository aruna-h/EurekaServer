package com.bridgelabz.discoveryServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * @author bridgelabz
 * @since 7/8/2018 <br>
 *        <p>
 *        a entity providing DiscoveryServerApplication related information
 *        </p>
 */
@SpringBootApplication
@EnableEurekaClient
@EnableEurekaServer
public class DiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServerApplication.class, args);
	}
}
