package com.training.application.domain;

import lombok.Data;

@Data
public class Payment {
    int paymentId;
    int userId;
    double amount;
    String email;
}
