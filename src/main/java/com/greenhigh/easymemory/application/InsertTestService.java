package com.greenhigh.easymemory.application;

import com.greenhigh.easymemory.application.port.in.InsertTestUseCase;
import com.greenhigh.easymemory.application.port.out.InsertTestPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class InsertTestService implements InsertTestUseCase {
    private final InsertTestPort insertTestPort;

    @Autowired
    public InsertTestService(InsertTestPort insertTestPort) {
       this.insertTestPort = insertTestPort;
    }

    @Override
    public String insertTest() {
        return insertTestPort.insertTest();
    }
}
