package com.impressdesigns.alex;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.Immutable;

@Entity
@Table(name = "Orders")
@Immutable
public class Order {

    @Id
    @Column(name = "ID_Order", nullable = false, unique = true)
    private int order_id;

    @Column(name = "CustomerPurchaseOrder")
    private String customer_purchase_order;

    public Integer getId() {
        return order_id;
    }

    public String get_customer_purchase_order() {
        return customer_purchase_order;
    }
}
