package com.codespace.payment;

import org.springframework.stereotype.Service;


@Service("card")
public class Cards implements PaymentService{
    @Override
    public void makePayment(){
        System.out.println("Payment through card..");
    }
}
