package com.example.booksotre.model.Payment;

public class PayCard extends Payment{
    private String bank;
    private String cardNumber;

    public PayCard(String bank, String cardNumber) {
        this.bank = bank;
        this.cardNumber = cardNumber;
    }

    public PayCard(String id, String type, String status, String bank, String cardNumber) {
        super(id, type, status);
        this.bank = bank;
        this.cardNumber = cardNumber;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
