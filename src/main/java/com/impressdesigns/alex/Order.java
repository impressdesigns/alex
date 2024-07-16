package com.impressdesigns.alex;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Orders")
public class Order {

    @Id
    @Column(name = "ID_Order", nullable = false, unique = true, length = 6)
    private int order_id;

    public Integer getId() {
        return order_id;
    }
}
