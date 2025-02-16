package com.example.demo.controller;

import com.example.demo.entity.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "/api/test")
    public ResponseEntity<Test> getTest() {
        Test test = new Test("I'm studying Jira-git-new", 20);
        return ResponseEntity.ok(test);
    }

    @GetMapping(value = "/api/test2")
    public ResponseEntity<Test> getTest2() {
        Test test = new Test("test2", 30);
        return ResponseEntity.ok(test);
    }

    @GetMapping(value = "/api/test4")
    public ResponseEntity<Test> getTest4() {
        Test test = new Test("test4", 40);
        return ResponseEntity.ok(test);
    }

}
