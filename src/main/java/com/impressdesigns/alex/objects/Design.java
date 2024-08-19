package com.impressdesigns.alex.objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import org.hibernate.annotations.Immutable;

@Getter
@Entity
@Table(name = "Des")
@Immutable
public class Design {
    @Id
    @Column(name = "ID_Design", nullable = false, unique = true)
    private float id;

    @Column(name = "DesignName")
    private String title;
}
