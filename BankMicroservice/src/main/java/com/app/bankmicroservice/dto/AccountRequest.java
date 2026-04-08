package com.app.bankmicroservice.dto;


import org.springframework.stereotype.Component;

@Component
public class AccountRequest {
    private String accountHolderName;

    private long mobileNo;

    private String address;
    private double balance;

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "AccountRequest{" +
                "accountHolderName='" + accountHolderName + '\'' +
                ", mobileNo=" + mobileNo +
                ", address='" + address + '\'' +
                ", balance=" + balance +
                '}';
    }
}
