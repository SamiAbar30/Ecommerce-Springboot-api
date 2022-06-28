package com.SamiEcommerce.Ecommerce.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "addresscustomer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address implements Serializable{
	@Id
    @GeneratedValue
	private Integer id;
	private String street;
	private Integer number;
	private Integer floor;
	private Integer zip;
	private String city;
	private String Contry;


}
