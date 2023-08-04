package com.ohgiraffers.japtest.test01.repo;

import com.ohgiraffers.japtest.test01.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
    Order findById(int code);

}

