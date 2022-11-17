package com.github.lucasdevrj.mvc.leitura.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity //diz para o Spring que a classe é uma entidade do banco de dados
@Table(name = "users")
public class User {

	private String username;
	private String password;
	private Boolean enabled;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Boolean getEnabled() {
		return enabled;
	}
	
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
}
