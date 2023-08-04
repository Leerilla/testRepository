package com.ohgiraffers.japtest.test01.repo;

import com.ohgiraffers.japtest.test01.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
}
