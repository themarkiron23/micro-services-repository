package br.com.loja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(value = {"br.com.loja.controller",
        "br.com.loja.service"})
@EnableEurekaClient
@EnableFeignClients
@EnableCircuitBreaker
public class LojaApplication {



    public static void main(String[] args) {
        SpringApplication.run(LojaApplication.class, args);
    }



}
