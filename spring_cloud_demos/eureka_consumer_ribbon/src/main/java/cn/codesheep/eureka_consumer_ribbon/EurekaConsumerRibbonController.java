package cn.codesheep.eureka_consumer_ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EurekaConsumerRibbonController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String test() {
        return restTemplate.getForObject("http://eureka-client/test", String.class);
    }
}
