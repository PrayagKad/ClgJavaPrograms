package com.app.bankmicroservice.service;

import com.app.bankmicroservice.dto.AccountRequest;
import com.app.bankmicroservice.dto.AccountResponse;
import com.app.bankmicroservice.model.Account;
import com.app.bankmicroservice.repository.AccountRepository;
import com.app.bankmicroservice.util.Status;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    private final AccountResponse accountResponse;

    public AccountService(AccountRepository accountRepository, AccountResponse accountResponse) {
        this.accountRepository = accountRepository;
        this.accountResponse = accountResponse;
    }


    public AccountResponse addAccount(AccountRequest request) {

        Account account = new Account();
        account.setAccountHolderName(request.getAccountHolderName());
        account.setAddress(request.getAddress());
        account.setMobileNo(request.getMobileNo());
        account.setBalance(request.getBalance());

        Account response = accountRepository.save(account);

        if(response!=null){
            accountResponse.setResponse(response);
            accountResponse.setStatus(Status.SUCCESS);
        }
        else {
            accountResponse.setResponse(response);
            accountResponse.setStatus(Status.FAILURE);
        }

        return accountResponse;
    }


    ///  add / deposit a amount inside the account
    public AccountResponse deposit(AccountRequest request) {
        Account account = accountRepository.findByMobileNo(request.getMobileNo());
        if(account!=null){
            double balance = account.getBalance();
            account.setBalance(balance+request.getBalance());
            Account ac = accountRepository.save(account);

            accountResponse.setResponse(ac);
            accountResponse.setStatus(Status.SUCCESS);
        }
        else
        {
            accountResponse.setResponse(null);
            accountResponse.setStatus(Status.FAILURE);
        }
        return accountResponse;
    }


    /// get account details using a mobile number
    public AccountResponse GetAccountDetails(long mobileNo) {
        Account account = accountRepository.findByMobileNo(mobileNo);
        if(account!=null){


            accountResponse.setResponse(account);
            accountResponse.setStatus(Status.SUCCESS);
        }
        else
        {
            accountResponse.setResponse("Account not found check mobile number");
            accountResponse.setStatus(Status.NOT_PRESENT);
        }
        return accountResponse;

    }
}

