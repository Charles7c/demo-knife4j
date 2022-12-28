package com.example.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试 API
 *
 * @author Charles7c
 * @since 2022/12/28 9:21
 */
@Tag(name = "测试 API")
@RestController
public class TestController {

    @Operation(summary = "打招呼")
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }

}
