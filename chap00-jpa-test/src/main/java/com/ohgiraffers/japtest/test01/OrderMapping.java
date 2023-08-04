package com.ohgiraffers.japtest.test01;

import org.hibernate.annotations.CollectionId;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tbl_order_mapping")
public class OrderMapping {
    @EmbeddedId
    public OrMppingPk orderMapping;
    @MapsId("productCode")
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_code")
    public Product product;
    @MapsId("orderCode")
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_code")
    public Order order;

    public OrderMapping() {
    }

    public OrderMapping(OrMppingPk orderMapping, Order order) {
        this.orderMapping = orderMapping;
        this.order = order;
    }

    public OrMppingPk getOrderMapping() {
        return orderMapping;
    }

    public void setOrderMapping(OrMppingPk orderMapping) {
        this.orderMapping = orderMapping;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "OrderMapping{" +
                "orderMapping=" + orderMapping +
                ", order=" + order +
                '}';
    }
}
