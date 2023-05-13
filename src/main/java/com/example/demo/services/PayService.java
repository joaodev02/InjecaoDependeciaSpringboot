package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class PayService {
    // Podemos utilizar o @Autowired
    private TaxService taxService;
    // Podemos utilizar o @Autowired
    private DeliverService deliverService;

    // Se fosse utilizado o @Autowired esse construtor poderia ser inutilizado.
    public PayService(TaxService taxService, DeliverService deliverService) {
        this.taxService = taxService;
        this.deliverService = deliverService;
    }

    public double finalPrice(double cost, String state) {
        return cost + deliverService.fee(state) + taxService.tax(cost);
    }
}
