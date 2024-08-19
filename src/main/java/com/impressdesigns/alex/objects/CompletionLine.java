package com.impressdesigns.alex.objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import org.hibernate.annotations.Immutable;

@Getter
@Entity
@Table(name = "LinesCompletion")
@Immutable
public class CompletionLine {
    @Id
    @Column(name = "ID_LineComp", nullable = false, unique = true)
    private Integer lines_completion_id;

    @Column(name = "id_LineOE")
    private String lines_oe_id;

    @Column(name = "sts_ApplyLocation")
    private String apply_location;

    @Column(name = "cn_Size01_ToProduce")
    private Integer quantity_to_produce;

    @Column(name = "id_Order")
    private Integer order_id;
}
