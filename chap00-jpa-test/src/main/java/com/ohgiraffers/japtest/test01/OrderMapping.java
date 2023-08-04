package com.ohgiraffers.japtest.test01;

import org.hibernate.annotations.CollectionId;

import javax.persistence.*;

@Entity
@Table(name = "tbl_order_mapping")
public class OrderMapping {


    @EmbeddedId
    public OrMppingPk order;

    public OrderMapping(OrMppingPk order) {
        this.order = order;
    }

    public OrderMapping() {

    }
}
