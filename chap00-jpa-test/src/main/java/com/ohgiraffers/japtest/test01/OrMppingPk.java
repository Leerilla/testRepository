package com.ohgiraffers.japtest.test01;


import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class OrMppingPk implements Serializable {


    @Column(name ="order_cdoe")
    private int orderCode;

    @Column(name = "product_code")
    private int productCode;

    public OrMppingPk() {
    }

    public OrMppingPk(int orderCode, int productCode) {
        this.orderCode = orderCode;
        this.productCode = productCode;
    }

    public int getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(int orderCode) {
        this.orderCode = orderCode;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    @Override
    public String toString() {
        return "OrMppingPk{" +
                "orderCode=" + orderCode +
                ", productCode=" + productCode +
                '}';
    }
}
