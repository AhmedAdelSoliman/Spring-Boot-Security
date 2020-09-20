package com.ahmed.adel.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class AuthenticationRequest implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	
	@Column
    private String userName;
	
	@Column
    private String password;

	
	
	
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

    public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //need default constructor for JSON Parsing
    public AuthenticationRequest()
    {

    }

    public AuthenticationRequest(String username, String password) {
        this.setUserName(username);
        this.setPassword(password);
    }
}