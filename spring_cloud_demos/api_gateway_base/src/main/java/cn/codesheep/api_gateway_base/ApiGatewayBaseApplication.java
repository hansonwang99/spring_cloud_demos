package cn.codesheep.api_gateway_base;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
public class ApiGatewayBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayBaseApplication.class, args);
    }
}
