package com.globant.classes;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private final Map<String, Account> accounts;

    public Bank() {
        accounts = new HashMap<>();
        // Initialize admin account
        accounts.put("admin", new Account("admin", "admin"));
    }

    public boolean addAccount(String username, String password) {
        if(!accounts.containsKey(username)) {
            accounts.put(username, new Account(username, password));
            return true;
        }
        return false;
    }

    public Account getAccount(String username) {
        return accounts.get(username);
    }
}
