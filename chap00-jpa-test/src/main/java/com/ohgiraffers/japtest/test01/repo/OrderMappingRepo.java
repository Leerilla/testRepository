package com.ohgiraffers.japtest.test01.repo;

import com.ohgiraffers.japtest.test01.OrderMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMappingRepo extends JpaRepository<OrderMapping, Integer> {
}
