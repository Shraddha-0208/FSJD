package com.simplilearn.demo.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int SeatNo;
	private String UserName;
	private String payment;
	private String dob;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSeatNo() {
		return SeatNo;
	}
	public void setSeatNo(int seatNo) {
		SeatNo = seatNo;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Booking [id=" + id + ", SeatNo=" + SeatNo + ", UserName=" + UserName + ", payment=" + payment + ", dob="
				+ dob + "]";
	}

}
