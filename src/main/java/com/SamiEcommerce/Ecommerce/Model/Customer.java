package com.SamiEcommerce.Ecommerce.Model;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Entity
@Table(name = "customer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer implements Serializable{
	@Id
    @GeneratedValue
	private Integer customer_id;
	private String customer_mail;
	private String customer_lastname;
	private String customer_firstname;
	private LocalDate customer_birthdate;
	private String customer_password;
	private Integer address_customeraddress_id;
}
