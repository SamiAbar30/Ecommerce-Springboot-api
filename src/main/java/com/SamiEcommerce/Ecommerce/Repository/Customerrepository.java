package com.SamiEcommerce.Ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SamiEcommerce.Ecommerce.Model.Customer;

public interface Customerrepository extends JpaRepository<Customer, Integer> {

}
