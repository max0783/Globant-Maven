package com.globant;

import com.globant.classes.Bank;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Bank bank = new Bank();
        bank.addAccount("user1", "pass1");
        System.out.println(bank.getAccount("user1").getBalance());
        bank.getAccount("user1").deposit(100.0);
        System.out.println(bank.getAccount("user1").getBalance());
        bank.getAccount("user1").withdraw(50.0);
        System.out.println(bank.getAccount("user1").getBalance());
    }
}
