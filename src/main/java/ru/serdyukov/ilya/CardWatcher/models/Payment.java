package ru.serdyukov.ilya.CardWatcher.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "creditcardpayments")
public class Payment {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "credit_card_id")
    private int creditCardId;

    @Column(name = "dt_first_payment")
    private LocalDate dtFirstPayment;

    @Column(name = "bank_dt_payment")
    private LocalDate bankDtPayment;

    @Column(name = "recommend_payment_dt")
    private LocalDate recommendPaymentDt;

    @Column(name = "calc_dt_full_repayment")
    private LocalDate calcDtFullRepayment;

    @Column(name = "amount")
    private double amount;

    @Column(name = "payment_dt")
    private LocalDate paymentDt;

    @Column(name = "payment_status_id")
    private int paymentStatusId;

    @Column(name = "description")
    private String description;

    public Payment() {
    }
}
