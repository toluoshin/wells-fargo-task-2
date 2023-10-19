package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private double riskFactor;

    @Column(nullable = false)
    private double total;

    @Column(nullable = false)
    private long clientId;

    protected Portfolio() {

    }

    public Portfolio(String firstName, String lastName, double riskFactor, double total, long clientId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.riskFactor = riskFactor;
        this.total = total;
        this.clientId = clientId;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getRiskFactor() {
        return riskFactor;
    }

    public void setRiskFactor(String riskFactor) {
        this.riskFactor = riskFactor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getClientId() {
        return clientId;
    }
