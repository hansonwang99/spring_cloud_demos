package cn.codesheep.eureka_client_delay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClientController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/test")
    public String test() throws InterruptedException {
        Thread.sleep( 5000L );
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
}
