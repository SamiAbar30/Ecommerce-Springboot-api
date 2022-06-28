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
@Table(name = "order")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order implements Serializable {
	@Id
    @GeneratedValue
	private Integer order_number;
	private LocalDate order_date;
	private Integer qunantity_article;
	private double order_price_ht;
	private float tva;
	private double order_price_ttc;
	private String order_statut;
	private boolean order_closed;
	private boolean order_canceled;
	private Integer customer_id;
	private Integer payment_id;
	private Integer status_id;
}
