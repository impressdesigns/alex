package com.impressdesigns.alex.designs;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.Immutable;

@Entity
@Table(name = "Des")
@Immutable
public class Design {

    @Id
    @Column(name = "ID_Design", nullable = false, unique = true)
    private float id;

    @Column(name = "DesignName")
    private String title;

    public float getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
