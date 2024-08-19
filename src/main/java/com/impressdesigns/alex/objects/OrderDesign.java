package com.impressdesigns.alex.objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import org.hibernate.annotations.Immutable;

@Getter
@Entity
@Table(name = "OrderDes")
@Immutable
public class OrderDesign {
    @Id
    @Column(name = "id_OrderDesign", nullable = false, unique = true)
    private Integer order_design_id;

    @Column(name = "id_Design")
    private Double design_id;
}
