package com.codespace.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Qualifier("netbanking")
@Service("netbanking")
public class NetBanking implements PaymentService{
    @Override
    public void makePayment(){
        System.out.println("Payment through netbanking");
    }
}
