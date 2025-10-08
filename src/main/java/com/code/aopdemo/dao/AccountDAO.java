package com.code.aopdemo.dao;

import com.code.aopdemo.Account;

import java.util.List;

public interface AccountDAO {

    void addAccount(Account theAccount);

    boolean doWork();

    // add a new method: findAccounts()
    List<Account> findAccounts();

    public String getName();

    public void setName(String name);

    public String getServiceCode();

    public void setServiceCode(String serviceCode);


}
