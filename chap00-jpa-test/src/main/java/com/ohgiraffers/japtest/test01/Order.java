package com.ohgiraffers.japtest.test01;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tbl_order")
public class Order {

    @Id
    @Column(name = "order_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderCode;

    @Column(name ="member_code")
    private int memberCode;

    @OneToMany
    private List<OrderMapping> orderMapping;


    public Order() {
    }

    public Order(int orderCode, int memberCode, List<OrderMapping> orderMapping) {
        this.orderCode = orderCode;
        this.memberCode = memberCode;
        this.orderMapping = orderMapping;
    }


    public int getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(int orderCode) {
        this.orderCode = orderCode;
    }

    public int getMembercode() {
        return memberCode;
    }

    public void setMembercode(int membercode) {
        this.memberCode = membercode;
    }


    public int getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(int memberCode) {
        this.memberCode = memberCode;
    }

    public List<OrderMapping> getOrderMapping() {
        return orderMapping;
    }

    public void setOrderMapping(List<OrderMapping> orderMapping) {
        this.orderMapping = orderMapping;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderCode=" + orderCode +
                '}';
    }
}
