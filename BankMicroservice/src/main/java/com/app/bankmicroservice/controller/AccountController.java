package com.app.bankmicroservice.controller;

import com.app.bankmicroservice.dto.AccountRequest;
import com.app.bankmicroservice.dto.AccountResponse;
import com.app.bankmicroservice.model.Account;
import com.app.bankmicroservice.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }


    @RequestMapping(value = "/add",method = RequestMethod.POST, produces = "application/json" , consumes = "application/json")
    public ResponseEntity<AccountResponse> addAccount(@RequestBody AccountRequest request) {
        AccountResponse accountResponse = accountService.addAccount(request);
        return new ResponseEntity<AccountResponse>(accountResponse, HttpStatus.CREATED);
    }


    @RequestMapping(value = "/deposit",method = RequestMethod.POST, produces = "application/json" , consumes = "application/json")
    public ResponseEntity<AccountResponse> Deposit(@RequestBody AccountRequest request) {
        AccountResponse accountResponse = accountService.deposit(request);
        return new ResponseEntity<AccountResponse>(accountResponse, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/getAccDetails/{mobileno}",method = RequestMethod.GET, produces = "application/json" , consumes = "application/json")
    public ResponseEntity<AccountResponse> GetAccountDetails(@PathVariable long mobileno) {
        AccountResponse accountResponse = accountService.GetAccountDetails(mobileno);
        return new ResponseEntity<AccountResponse>(accountResponse, HttpStatus.CREATED);
    }


}
