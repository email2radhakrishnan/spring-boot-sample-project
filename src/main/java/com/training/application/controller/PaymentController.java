package com.training.application.controller;

import com.training.application.entity.Payment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PaymentController {
    @RequestMapping(value = "/payment-service/make-payment", method = RequestMethod.POST)
    public ResponseEntity makePayment(@RequestBody Payment payment) {
        System.out.println("am in make payment method:" + payment);
        return null;

    }


}