package com.impressdesigns.alex.objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import org.hibernate.annotations.Immutable;

@Getter
@Entity
@Table(name = "Event")
@Immutable
public class Event {
    @Id
    @Column(name = "ID_Event", nullable = false, unique = true)
    private float event_id;

    @Column(name = "id_Order")
    private Integer order_id;

    @Column(name = "id_ProductionEvent")
    private Integer event_type_id;

    @Column(name = "id_Machine")
    private Integer machine_id;

    @Column(name = "date_Scheduled")
    private Integer date_scheduled;
}
