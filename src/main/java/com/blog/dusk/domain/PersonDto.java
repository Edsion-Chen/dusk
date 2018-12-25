package com.blog.dusk.domain;

public class PersonDto {
    private String persion;

    private String amount;

    private String personid;

    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid;
    }

    public String getPersion() {
        return persion;
    }

    public String getAmount() {
        return amount;
    }

    public void setPersion(String persion) {
        this.persion = persion;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public PersonDto() {
    }
}
