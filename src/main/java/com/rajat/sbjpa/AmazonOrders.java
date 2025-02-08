package com.rajat.sbjpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "amazon_orders")
public class AmazonOrders {

	@Id
	@Column(name = "order_id")
	private int orderId;
	@Column(name = "no_of_items")
	private int noOfItems;
	@Column(name = "amount")
	private double amount;
	@Column(name = "email")
	private String email;
	@Column(name = "pincode")
	private int pincode;
	@Column(name = "city")
	private String city;
	@Column(name = "gender")
	private String gender;
	@Override
	public String toString() {
		return "AmazonOrders [orderId=" + orderId + ", noOfItems=" + noOfItems + ", amount=" + amount + ", email="
				+ email + ", pincode=" + pincode + ", city=" + city + ", gender=" + gender + "]";
	}
	
	
}
