package com.app.bankmicroservice.repository;

import com.app.bankmicroservice.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByMobile(long mobileNo);
}
