package com.codespace.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class PaymentManager {
    private PaymentService ps;

    @Autowired
    public PaymentManager(@Qualifier("card") PaymentService ps){
        this.ps=ps;
    }
    public PaymentManager(PaymentService ps, int amount){

    }
    public void work(){
        ps.makePayment();
    }
}
