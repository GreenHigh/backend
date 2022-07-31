package com.greenhigh.easymemory.adapter.in.web;

import com.greenhigh.easymemory.application.port.in.InsertTestUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private final InsertTestUseCase insertTestUseCase;

    @Autowired
    public HomeController(InsertTestUseCase insertTestUseCase) {
        this.insertTestUseCase = insertTestUseCase;
    }

    @GetMapping("/")
    public String home() {
        return "Hello, GreenHigh!";
    }

    @GetMapping("/insert-test")
    public String insertTest() {
        return insertTestUseCase.insertTest();
    }
}
