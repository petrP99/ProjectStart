package com.pers.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Replenishment {

    @Id
    @Column(name = "replenishment_id")
    private Long replenishmentId;

    @Column(name = "client_to")
    private Long clientTo;

    @Column(name = "replenishment_amount")
    private BigDecimal replenishmentAmount;

    @Column(name = "date_and_time")
    private Timestamp dateAndTime;

    @Enumerated(EnumType.STRING)
    private Status status;


}
