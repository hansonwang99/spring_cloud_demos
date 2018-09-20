package cn.codesheep.eureke_client_for_gateway_routecfg_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClientController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/test")
    public String test() {
        String services = "Services: " + discoveryClient.getServices() + "-2";
        System.out.println(services + "-2");
        return services;
    }
}
