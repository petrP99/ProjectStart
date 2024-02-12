package com.pers.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Card {

    @Id
    @Column(name = "client_id")
    private Long clientId;

    @Column(name = "card_no")
    private Long cardNo;

    private BigDecimal cardBalance;

    @Column(name = "created_date")
    private LocalDate createdDate;

    @Column(name = "expire_date")
    private LocalDate expireDate;

    @Enumerated(EnumType.STRING)
    private Status status;

}
