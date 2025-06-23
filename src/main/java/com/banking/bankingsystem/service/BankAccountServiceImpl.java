package com.banking.bankingsystem.service;

import com.banking.bankingsystem.model.BankAccount;
import com.banking.bankingsystem.repository.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankAccountServiceImpl implements BankAccountService {

    @Autowired
    private BankAccountRepository accountRepository;

    @Override
    public List<BankAccount> getAllAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public BankAccount getAccountById(Long id) {
        return accountRepository.findById(id).orElse(null);
    }

    @Override
    public BankAccount saveAccount(BankAccount account) {
        return accountRepository.save(account);
    }

    @Override
    public void deleteAccount(Long id) {
        accountRepository.deleteById(id);
    }

    @Override
    public BankAccount updateAccount(Long id, BankAccount updatedAccount) {
        BankAccount existingAccount = accountRepository.findById(id).orElse(null);
        if (existingAccount != null) {
            existingAccount.setAccountNumber(updatedAccount.getAccountNumber());
            existingAccount.setBalance(updatedAccount.getBalance());
            existingAccount.setCustomer(updatedAccount.getCustomer());
            return accountRepository.save(existingAccount);
        } else {
            throw new RuntimeException("Bank account not found with id: " + id);
        }
    }
}

