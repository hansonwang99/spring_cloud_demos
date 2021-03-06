package cn.codesheep.eureka_client_delay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientDelayApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientDelayApplication.class, args);
    }
}
