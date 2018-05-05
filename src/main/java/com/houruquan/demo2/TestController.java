package com.houruquan.demo2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/")
    public ResponseEntity<String> home()
    {
        return ResponseEntity.ok("hello this is a test web about springboot");
    }
}
