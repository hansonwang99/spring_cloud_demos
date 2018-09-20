package cn.codesheep.config_client_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClientConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientConsumerApplication.class, args);
    }
}
