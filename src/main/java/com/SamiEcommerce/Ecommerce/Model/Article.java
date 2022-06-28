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
@Table(name = "article")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article implements Serializable{
	@Id
    @GeneratedValue
	private Integer article_id;
	private String article_description;
	private double article_price_per_unit_ht;
	private Integer article_actif;
	private Integer article_stock;
	private Integer category_id;




}
