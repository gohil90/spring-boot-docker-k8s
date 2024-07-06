package com.gohil90.learning.service;

import com.gohil90.learning.AccountRecord;
import com.gohil90.learning.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public AccountRecord getAccount(String id) {
        Optional<AccountRecord> account = this.accountRepository.getAccount(id);
        return account.orElse(new AccountRecord("DUMMY", "NONE", BigDecimal.ZERO));
    }

    public List<AccountRecord> getAccounts() {
        return this.accountRepository.getAccounts();
    }

    ;
}
