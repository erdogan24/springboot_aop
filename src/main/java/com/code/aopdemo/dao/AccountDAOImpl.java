package com.code.aopdemo.dao;


import com.code.aopdemo.Account;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AccountDAOImpl implements AccountDAO {


    private String name;

    private String serviceCode;

    @Override
    public void addAccount(Account theAccount) {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");

    }

    @Override
    public boolean doWork() {
        System.out.println(getClass() + " : doWork()");

        return false;
    }

    @Override
    public List<Account> findAccounts() {
        List<Account> myAccount = new ArrayList<>();

        // create sample accounts
        Account temp1 = new Account("Erdogan","Junior");
        Account temp2 = new Account("Irem","Senior");


        // add them to our accounts list
        myAccount.add(temp1);
        myAccount.add(temp2);

        return  myAccount;
    }

    public String getName() {
        System.out.println(getClass() + " : in getName()");
        return name;
    }

    public void setName(String name) {
        System.out.println(getClass() + " : in setName()");
        this.name = name;
    }

    public String getServiceCode() {
        System.out.println(getClass() + " : in getServiceCode()");
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        System.out.println(getClass() + " : in setServiceCode()");
        this.serviceCode = serviceCode;
    }
}
