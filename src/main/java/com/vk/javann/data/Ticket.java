package com.vk.javann.data;

import com.sun.xml.txw2.annotation.XmlElement;

/**
 * Specific payment to employee
 */
@XmlElement
public class Ticket {
    private Integer amount;
    private String expenseItem;
    private String accountNumber;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getExpenseItem() {
        return expenseItem;
    }

    public void setExpenseItem(String expenseItem) {
        this.expenseItem = expenseItem;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "amount=" + amount +
                ", expenseItem='" + expenseItem + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}
