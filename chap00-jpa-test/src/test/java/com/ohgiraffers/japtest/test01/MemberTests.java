package com.ohgiraffers.japtest.test01;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MemberTests {

    private static EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    @BeforeAll
    static void initFactory(){
        entityManagerFactory = Persistence.createEntityManagerFactory("jpatest");
    }

    @BeforeEach
    void initManager(){
        entityManager = entityManagerFactory.createEntityManager();
    }

    @Test
    void test(){
        Member member = new Member();
        member.setMemberName("이상우");
        member.setMemberAge(20);
        member.setZipCode(1234);
        member.setGemetaAdderss("일반주소");
        member.setDetailedAddress("1층");


        EntityTransaction entityTransaction = entityManager.getTransaction();

        try {
            entityManager.persist(member);
            entityTransaction.commit();
        }catch (Exception e){
            entityTransaction.rollback();
            e.printStackTrace();
        }
    }


}
