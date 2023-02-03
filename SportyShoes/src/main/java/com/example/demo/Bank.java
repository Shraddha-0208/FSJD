package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Bank {

public Bank() {
}
@Id	
	private int Bank_Id;
	private String Bank_Name;
	private float Bank_Balance;

}