/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountmanagement;

/**
 *
 * @author zerof
 */
public  class Account {

    private int id;
    private String holderName;
    private String accountType;
    private Long balance;

    public Account(int id, String holderName, String accountType, Long balance) {
        this.id = id;
        this.holderName = holderName;
        this.accountType = accountType;
        this.balance = balance;
    }

    public Account() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

}