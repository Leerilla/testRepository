package com.ohgiraffers.japtest.test01.repo;

import com.ohgiraffers.japtest.test01.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {

    Member findById(int code);

}
