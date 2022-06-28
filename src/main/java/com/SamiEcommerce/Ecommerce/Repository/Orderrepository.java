package com.SamiEcommerce.Ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SamiEcommerce.Ecommerce.Model.Order;

public interface Orderrepository extends JpaRepository<Order, Integer>{

}
