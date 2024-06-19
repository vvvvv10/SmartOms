package com.smart.crm.domain.customer.gateway;

import com.smart.crm.domain.customer.Credit;

//Assume that the credit info is in another distributed Service
public interface CreditGateway {
    Credit getCredit(String customerId);
}
