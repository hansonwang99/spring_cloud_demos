package cn.codesheep.eureke_client_for_gateway_routecfg_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekeClientForGatewayRoutecfg1Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekeClientForGatewayRoutecfg1Application.class, args);
    }
}
