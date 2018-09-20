package cn.codesheep.eureka_client_for_gateway_base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientForGatewayBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientForGatewayBaseApplication.class, args);
    }
}
