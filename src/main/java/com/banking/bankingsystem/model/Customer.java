package com.banking.bankingsystem.model;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.List;
@Entity
public class Customer {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name;
	    private String email;

	    // One-to-Many relationship with BankAccount
	    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	    @JsonManagedReference
	    private List<BankAccount> accounts;

	    // Getters and Setters
	    public Long getId() { return id; }
	    public void setId(Long id) { this.id = id; }

	    public String getName() { return name; }
	    public void setName(String name) { this.name = name; }

	    public String getEmail() { return email; }
	    public void setEmail(String email) { this.email = email; }

	    public List<BankAccount> getAccounts() { return accounts; }
	    public void setAccounts(List<BankAccount> accounts) { this.accounts = accounts; }
	}


