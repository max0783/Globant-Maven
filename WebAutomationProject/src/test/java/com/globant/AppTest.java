package com.globant;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.globant.classes.Bank;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Before
    public void setUp() {
        System.out.println("Setting up test");


    }

    @Test
    public void shouldAnswerWithTrue()
    {

        Bank bank = new Bank();
        bank.addAccount("user1", "pass1");
        bank.getAccount("user1").deposit(100.0);
        assertEquals(100, bank.getAccount("user1").getBalance(),0);
        bank.getAccount("user1").withdraw(50.0);
        assertEquals(50, bank.getAccount("user1").getBalance(),0);
    }
}
