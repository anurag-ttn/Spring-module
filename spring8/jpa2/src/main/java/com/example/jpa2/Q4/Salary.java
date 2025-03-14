package com.example.jpa2.Q4;


import jakarta.persistence.Embeddable;

//id, firstName, lastName, age, basicSalary, bonusSalary, taxAmount, specialAllowanceSalary.

@Embeddable
public class Salary {

    private long basicSalary;
    private long bonusSalary;
    private long taxAmount;
    private long specialAllowanceSalary;

    public long getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(long basicSalary) {
        this.basicSalary = basicSalary;
    }

    public long getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(long bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public long getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(long taxAmount) {
        this.taxAmount = taxAmount;
    }

    public long getSpecialAllowanceSalary() {
        return specialAllowanceSalary;
    }

    public void setSpecialAllowanceSalary(long specialAllowanceSalary) {
        this.specialAllowanceSalary = specialAllowanceSalary;
    }
}
