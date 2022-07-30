package com.greenhigh.easymemory.adapter.in.web;

import com.greenhigh.easymemory.application.InsertTestService;
import com.greenhigh.easymemory.application.port.in.InsertTestUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Hello, GreenHigh!";
    }

    @GetMapping("/insert-test")
    public String insertTest() {
        InsertTestUseCase testUseCase = new InsertTestService();
        return testUseCase.insertTest();
    }
}
