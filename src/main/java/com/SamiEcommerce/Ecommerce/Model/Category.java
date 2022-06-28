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
@Table(name = "category")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category implements Serializable{
	@Id
    @GeneratedValue
	private Integer category_id;
	private String category_name;
	private String category_description;
	
	
}
