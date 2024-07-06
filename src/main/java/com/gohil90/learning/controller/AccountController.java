package com.gohil90.learning.controller;

import com.gohil90.learning.AccountRecord;
import com.gohil90.learning.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping
    @ResponseBody
    public List<AccountRecord> getAccounts() {
        return accountService.getAccounts();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public AccountRecord getAccountDetails(@PathVariable("id") String id) {
        return accountService.getAccount(id);
    }
}
