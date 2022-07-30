package com.greenhigh.easymemory.adapter.out.persistence;

import com.greenhigh.easymemory.application.port.out.InsertTestPort;
import com.greenhigh.easymemory.domain.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@Component
@Slf4j
public class InsertTestPersistenceAdapter implements InsertTestPort {

    @Autowired
    public InsertTestPersistenceAdapter() {
    }

    public String insertTest() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpatest");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            logic(em);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
            return "Fail";
        } finally {
            em.close();
        }
        return "Success";
    }

    private void logic(EntityManager em) {
        String id = "id1";
        Member member = new Member();
        member.setId(id);
        member.setAge(2);
        member.setUsername("지구");

        em.persist(member);
        member.setAge(20);
        Member findMember = em.find(Member.class, id);
        log.info("findMember=" + findMember.getUsername() + ", age=" + findMember.getAge());
    }
}
