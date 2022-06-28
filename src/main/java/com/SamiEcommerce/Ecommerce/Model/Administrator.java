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
@Table(name = "administrator")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Administrator implements Serializable{
	@Id
    @GeneratedValue
private Integer administarto_id;
private String administarto_login;
private String administarto_password;

}
