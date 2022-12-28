package com.example;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ServerProperties;

import java.net.InetAddress;

@Slf4j
@SpringBootApplication
@RequiredArgsConstructor
public class DemoKnife4jApplication implements ApplicationRunner {

    private final ServerProperties serverProperties;

    @SneakyThrows
    public static void main(String[] args) {
        SpringApplication.run(DemoKnife4jApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        String hostAddress = InetAddress.getLocalHost().getHostAddress();
        log.info("------------------------------------------------------");
        log.info("后端 API 文档：http://{}:{}/doc.html", hostAddress, serverProperties.getPort());
        log.info("------------------------------------------------------");
    }
}
