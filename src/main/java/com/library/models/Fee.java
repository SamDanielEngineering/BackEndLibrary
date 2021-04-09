package com.library.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Fee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Timestamp assessed;
    private Timestamp resolved;
    private double amount;
    private enums.FeeStatus feeStatus;
    private enums.FeeType feeType;

    @ManyToOne
    @JoinColumn(name = "payment_id", nullable = false)
    private Payment payment;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Fee() {}

    public Fee(int id, Timestamp assessed, Timestamp resolved, double amount, enums.FeeStatus feeStatus,
               enums.FeeType feeType) {
        this.id = id;
        this.assessed = assessed;
        this.resolved = resolved;
        this.amount = amount;
        this.feeStatus = feeStatus;
        this.feeType = feeType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getAssessed() {
        return assessed;
    }

    public void setAssessed(Timestamp assessed) {
        this.assessed = assessed;
    }

    public Timestamp getResolved() {
        return resolved;
    }

    public void setResolved(Timestamp resolved) {
        this.resolved = resolved;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public enums.FeeStatus getFeeStatus() {
        return feeStatus;
    }

    public void setFeeStatus(enums.FeeStatus feeStatus) {
        this.feeStatus = feeStatus;
    }

    public enums.FeeType getFeeType() {
        return feeType;
    }

    public void setFeeType(enums.FeeType feeType) {
        this.feeType = feeType;
    }

    @Override
    public String toString() {
        return "Fee{" +
                "id=" + id +
                ", assessed=" + assessed +
                ", resolved=" + resolved +
                ", amount=" + amount +
                ", feeStatus=" + feeStatus +
                ", feeType=" + feeType +
                '}';
    }
}

