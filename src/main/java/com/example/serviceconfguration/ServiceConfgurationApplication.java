package com.example.serviceconfguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableConfigServer
public class ServiceConfgurationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceConfgurationApplication.class, args);
    }
  /*  @Value("${nom.password}")
    private String Password;
    @GetMapping("/test")
    public String  Encrypt()
    {
        return Password;
    }*/
}
