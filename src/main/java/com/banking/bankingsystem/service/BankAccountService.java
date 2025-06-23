package com.banking.bankingsystem.service;

import com.banking.bankingsystem.model.BankAccount;
import java.util.List;

public interface BankAccountService {
    List<BankAccount> getAllAccounts();
    BankAccount getAccountById(Long id);
    BankAccount saveAccount(BankAccount account);
    void deleteAccount(Long id);
    BankAccount updateAccount(Long id, BankAccount updatedAccount);
    
}

