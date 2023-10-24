package com.training.application.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
@NoArgsConstructor
public class Payment {
    int id;
    String cardType;
    String cardHolderName;
    long cardNumber;
    int cvcNumber;
    String expireDate;
    String name;
    int amount;
}