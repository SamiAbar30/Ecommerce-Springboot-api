package com.SamiEcommerce.Ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SamiEcommerce.Ecommerce.Model.Status;

public interface Statusrepository  extends JpaRepository<Status, Integer>  {

}
