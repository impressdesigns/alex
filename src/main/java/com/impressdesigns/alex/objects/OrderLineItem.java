package com.impressdesigns.alex.objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import org.hibernate.annotations.Immutable;

@Getter
@Entity
@Table(name = "LinesOE")
@Immutable
public class OrderLineItem {
    @Id
    @Column(name = "ID_LineOE", nullable = false, unique = true)
    private Integer lines_oe_id;

    @Column(name = "PartNumber")
    private String part_number;

    @Column(name = "PartDescription")
    private String part_description;

    @Column(name = "cn_LineQuantity_Req")
    private Integer quantity_requested;

    @Column(name = "id_LineOE_AssbParent")
    private Integer assembly_parent_line_id;

    @Column(name = "OrderInstructions")
    private String instructions;
}
