package com.greenhigh.easymemory.application;

import com.greenhigh.easymemory.adapter.out.persistence.InsertTestRepository;
import com.greenhigh.easymemory.application.port.in.InsertTestUseCase;
import com.greenhigh.easymemory.application.port.out.InsertTestPort;
import com.greenhigh.easymemory.domain.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@Slf4j
@Service
public class InsertTestService implements InsertTestUseCase {
    private final InsertTestRepository insertTestRepository;

    public InsertTestService() {
       insertTestRepository = new InsertTestPort();
    }

    @Override
    public String insertTest() {
        return insertTestRepository.insertTest();
    }
}
