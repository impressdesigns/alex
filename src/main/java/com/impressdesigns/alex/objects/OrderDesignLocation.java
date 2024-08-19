package com.impressdesigns.alex.objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import org.hibernate.annotations.Immutable;

@Getter
@Entity
@Table(name = "OrdDesLoc")
@Immutable
public class OrderDesignLocation {
    @Id
    @Column(name = "id_OrderDesLoc", nullable = false, unique = true)
    private Integer order_design_location_id;

    @Column(name = "Location")
    private String design_location;
}
