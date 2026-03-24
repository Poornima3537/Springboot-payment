package com.codespace.payment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service("upipayment")
public class UPI implements PaymentService {
    @Value("${payment.amount}")
    public int amount;

    @Override
    public void makePayment(){
        System.out.println("payment amount : "+amount);
        System.out.println("Payment through UPI");
    }
}
