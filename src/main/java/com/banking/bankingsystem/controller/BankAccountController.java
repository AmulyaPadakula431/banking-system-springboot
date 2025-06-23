package com.banking.bankingsystem.controller;

import com.banking.bankingsystem.model.BankAccount;
import com.banking.bankingsystem.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
@CrossOrigin("*")
public class BankAccountController {

    @Autowired
    private BankAccountService bankAccountService;

    @GetMapping
    public List<BankAccount> getAllAccounts() {
        return bankAccountService.getAllAccounts();
    }

    @GetMapping("/{id}")
    public BankAccount getAccountById(@PathVariable Long id) {
        return bankAccountService.getAccountById(id);
    }

    @PostMapping
    public BankAccount saveAccount(@RequestBody BankAccount account) {
        return bankAccountService.saveAccount(account);
    }

    @DeleteMapping("/{id}")
    public void deleteAccount(@PathVariable Long id) {
        bankAccountService.deleteAccount(id);
    }

    @PutMapping("/{id}")
    public BankAccount updateBankAccount(@PathVariable Long id, @RequestBody BankAccount updatedAccount) {
        BankAccount existingAccount = bankAccountService.getAccountById(id);
        if (existingAccount != null) {
            existingAccount.setAccountNumber(updatedAccount.getAccountNumber());
            existingAccount.setBalance(updatedAccount.getBalance());
            existingAccount.setCustomer(updatedAccount.getCustomer());
            return bankAccountService.saveAccount(existingAccount);
        } else {
            throw new RuntimeException("Bank account not found with id: " + id);
        }
    }
}
