package cn.codesheep.config_client_consumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${info.profile}")
    private String hello;

    @RequestMapping("/consumer")
    public String from() {
        return this.hello;
    }
}
