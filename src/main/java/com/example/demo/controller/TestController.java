package com.example.demo.controller;

import com.example.demo.entity.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "/api/test")
    public ResponseEntity<Test> getTest() {
        Test test = new Test("test1", 20);
        return ResponseEntity.ok(test);
    }

}
