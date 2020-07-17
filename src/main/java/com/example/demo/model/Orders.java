package com.example.demo.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Orders")
public class Orders implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long orderId;
	@Column(nullable = false, name = "cust_name")
	private String customerName;
	@Column(nullable = false, name = "order_date")
	private Date orderDate;
	@Column(nullable = false, name = "shipping_address")
	private String shippingAddress;
	@Column
	private String total;
	@OneToMany(mappedBy = "orders")
	private Set<OrderItem> orderItems;

	public void addOrderitem(OrderItem tempOrderItem) {
		if (orderItems == null) {
			orderItems = new HashSet<>();
		}
		orderItems.add(tempOrderItem);
	}
	// standard constructor, getters and setters
}
