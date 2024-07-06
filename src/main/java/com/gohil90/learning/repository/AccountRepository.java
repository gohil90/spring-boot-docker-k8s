package com.gohil90.learning.repository;

import com.gohil90.learning.AccountRecord;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public class AccountRepository {
    private final static List<AccountRecord> ACCOUNT_RESPONSE_LIST = List.of(
            new AccountRecord("1", "Saving", new BigDecimal("82374.234")),
            new AccountRecord("2", "Saving", new BigDecimal("5615.651")),
            new AccountRecord("3", "Current", new BigDecimal("6515.0651"))
    );

    public Optional<AccountRecord> getAccount(String id) {
        return ACCOUNT_RESPONSE_LIST.stream()
                .filter(a -> a.id().equals(id))
                .findAny();
    }

    public List<AccountRecord> getAccounts() {
        return ACCOUNT_RESPONSE_LIST;
    }
}
