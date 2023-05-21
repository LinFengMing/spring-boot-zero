package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RestController
public class DemoController {

    private Random random = new Random(new Date().getTime());

    /*
    回傳兩個值
    行數介於 0~9
    列數介於 0~9
     */
    @GetMapping("/random")
    ResponseEntity<Map> random() {
        var map = new HashMap<>();
        map.put("column", random.nextInt(10));
        map.put("row", random.nextInt(20));
        return ResponseEntity.ok(map);
    }

}
