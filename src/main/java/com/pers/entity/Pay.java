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
public class Pay {

    @Id
    @Column(name = "pay_id")
    private Long payId;

    private BigDecimal amount;

    @Column(name = "pay_by_client")
    private Long payByClient;

    @Column(name = "date_and_time")
    private Timestamp dateAndTime;

    @Enumerated(EnumType.STRING)
    private Status status;

}
