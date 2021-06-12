package com.ecommerce.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "orderdetails")
public class OrderDetailsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderDetailsId;

	@NotEmpty
	private int quantity;

	@NotEmpty
	private double uniPrice;

	@ManyToOne
	@JoinColumn(name = "ordersId")
	private OrdersEntity orders;

	@OneToOne(mappedBy = "orderdetails")
	private ProductEntity product;

	public OrderDetailsEntity() {
		super();
	}

	public OrderDetailsEntity(int orderDetailsId, int quantity, double uniPrice, OrdersEntity orders,
			ProductEntity product) {
		super();
		this.orderDetailsId = orderDetailsId;
		this.quantity = quantity;
		this.uniPrice = uniPrice;
		this.orders = orders;
		this.product = product;
	}

	public int getOrderDetailsId() {
		return orderDetailsId;
	}

	public void setOrderDetailsId(int orderDetailsId) {
		this.orderDetailsId = orderDetailsId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getUniPrice() {
		return uniPrice;
	}

	public void setUniPrice(double uniPrice) {
		this.uniPrice = uniPrice;
	}

	public OrdersEntity getOrders() {
		return orders;
	}

	public void setOrders(OrdersEntity orders) {
		this.orders = orders;
	}

	public ProductEntity getProduct() {
		return product;
	}

	public void setProduct(ProductEntity product) {
		this.product = product;
	}

	public double getTotal() {
		double total = quantity * uniPrice;
		return total;
	}

}
