package cn.codesheep.eureka_consumer_feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignConsumerController {
    @Autowired
    FeignClientInterface feignClientInterface;

    @GetMapping("/consumer")
    public String test() {
        return feignClientInterface.consumer();
    }
}
