package com.ohgiraffers.japtest.test01;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_product")
public class Product {

    @Id
    @Column(name = "product_code")
    private int productCode;

    @Column(name = "product_name")
    private String productName;


    public Product() {
    }

    public Product(int productCode, String productName) {
        this.productCode = productCode;
        this.productName = productName;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productCode=" + productCode +
                ", productName=" + productName +
                '}';
    }
}
