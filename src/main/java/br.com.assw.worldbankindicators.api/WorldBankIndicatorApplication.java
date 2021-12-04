package br.com.assw.worldbankindicators.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"br.com.assw.worldbankindicators.api"})
@EnableFeignClients
public class WorldBankIndicatorApplication {
    public static void main(String[] args) {
        SpringApplication.run(WorldBankIndicatorApplication.class, args);
    }
}
