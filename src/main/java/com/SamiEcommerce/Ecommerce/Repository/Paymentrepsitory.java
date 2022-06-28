package com.SamiEcommerce.Ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SamiEcommerce.Ecommerce.Model.Payment;

public interface Paymentrepsitory  extends JpaRepository<Payment, Integer>{

}
