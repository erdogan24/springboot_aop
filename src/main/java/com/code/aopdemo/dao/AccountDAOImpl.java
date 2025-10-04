package com.code.aopdemo.dao;


import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO{


    @Override
    public void addAccount() {
        System.out.println(getClass() +": DOİNG MY DB WORK: ADDİNG AN ACCOUNT");

    }
}
