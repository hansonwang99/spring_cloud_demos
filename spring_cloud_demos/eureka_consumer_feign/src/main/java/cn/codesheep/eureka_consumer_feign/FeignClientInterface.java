package cn.codesheep.eureka_consumer_feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client")
public interface FeignClientInterface {

    @GetMapping("/test")
    String consumer();
}
