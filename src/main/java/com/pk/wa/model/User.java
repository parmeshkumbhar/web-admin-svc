package com.pk.wa.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_details")
public class User {
	@Id
	private int id;
	@NotNull(message = "userName cannot be null")
	private String userName;
	private String password;
	private String role;
}
