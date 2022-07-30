package com.greenhigh.easymemory.application;

import com.greenhigh.easymemory.application.port.out.InsertTestPort;
import com.greenhigh.easymemory.application.port.in.InsertTestUseCase;
import com.greenhigh.easymemory.adapter.out.persistence.InsertTestPersistenceAdapter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class InsertTestService implements InsertTestUseCase {
    private final InsertTestPort insertTestPort;

    public InsertTestService() {
       insertTestPort = new InsertTestPersistenceAdapter();
    }

    @Override
    public String insertTest() {
        return insertTestPort.insertTest();
    }
}
