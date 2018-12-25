package com.blog.dusk.domain;

public class AmountDto {

    private String month;

    private String amount;

    public void setMonth(String month) {
        this.month = month;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getMonth() {
        return month;
    }

    public String getAmount() {
        return amount;
    }

    public AmountDto(String month, String amount) {
        this.month = month;
        this.amount = amount;
    }

    public AmountDto() {
    }
}
