package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Sporty_Shoes {

public Sporty_Shoes() {
			}
@Id	
	private int Shoe_Id;
	private String Shoe_Brand;
	private String Shoe_Price;

}