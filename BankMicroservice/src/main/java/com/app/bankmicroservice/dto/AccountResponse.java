package com.app.bankmicroservice.dto;

import com.app.bankmicroservice.util.Status;
import org.springframework.stereotype.Component;

@Component
public class AccountResponse {

    private Object response;
    private Status status;

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AccountResponse{" +
                "response=" + response +
                ", status=" + status +
                '}';
    }
}
