package cn.codesheep.api_gateway_route;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@EnableZuulProxy
@SpringCloudApplication
public class ApiGatewayRouteApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayRouteApplication.class, args);
    }
}
