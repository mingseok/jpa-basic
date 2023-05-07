package org.example.hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction(); // 트랜잭션 생성
        tx.begin(); // 트랜잭션 시작

        /**
         * 만드는 로직
         */
        Member member = new Member();
        member.setId(1L);
        member.setName("HelloA");

        /**
         * JPA 저장
         * persist -> 저장 명령어
         */
        em.persist(member);

        /**
         * 커밋
         */
        tx.commit();

        em.close();
        emf.close();
    }
}
