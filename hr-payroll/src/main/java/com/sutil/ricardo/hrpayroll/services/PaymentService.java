package com.sutil.ricardo.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.sutil.ricardo.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(long workerId, int days) {
		return new Payment("Ricardo", 200.0, days);
	}
}
