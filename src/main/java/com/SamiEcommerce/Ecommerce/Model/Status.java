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
@Table(name = "status")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Status implements Serializable{

	
	@Id
    @GeneratedValue
	private Integer status_id;
	private String status_name;
}
