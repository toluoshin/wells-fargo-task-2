package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Secur {

    @Id
    @GeneratedValue()
    private long securId;

    @Column(nullable = false)
    private String symbol;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private double total;

    @Column(nullable = false)
    private int purchaseDate;

    @Relationship(nullable = false)
    private long portfolioId;

    protected Secur() {

    }

    public Secur(String symbol, String type, int quantity, double price, double total,
                 int purchaseDate, long portfolioId) {
        this.symbol = symbol;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
        this.purchaseDate = purchaseDate;
        this.portfolioId = portfolioId;
    }

    public Long getSecurId() {
        return securId;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(int purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public long getPortfolioId() {
        return portfolioId;
    }
}
