package com.code.aopdemo.dao;

import com.code.aopdemo.Account;

public interface AccountDAO {

    void addAccount(Account theAccount);

    boolean doWork();

    public String getName();

    public void setName(String name);

    public String getServiceCode();

    public void setServiceCode(String serviceCode);


}
