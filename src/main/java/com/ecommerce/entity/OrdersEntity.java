package com.ecommerce.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "orders")
public class OrdersEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ordersId;
	
	@NotEmpty
	private Date orderDate;
	
	@NotEmpty
	private String shippingAddress;
	
	@NotEmpty
	private String orderStatus;
	
	@ManyToOne
	@JoinColumn(name = "accountId")
	private AccountEntity account;
	
	@OneToMany(mappedBy = "orders")
	private List<OrderDetailsEntity> orderDetails;
	
	@OneToMany(mappedBy = "ordersP")
	private List<PaymentEntity> payment;

	public OrdersEntity() {
		super();
	}

	public OrdersEntity(int ordersId, Date orderDate, String shippingAddress, AccountEntity account,
			List<OrderDetailsEntity> orderDetails, List<PaymentEntity> payment) {
		super();
		this.ordersId = ordersId;
		this.orderDate = orderDate;
		this.shippingAddress = shippingAddress;
		this.account = account;
		this.orderDetails = orderDetails;
		this.payment = payment;
	}

	public int getOrdersId() {
		return ordersId;
	}

	public void setOrdersId(int ordersId) {
		this.ordersId = ordersId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public AccountEntity getAccount() {
		return account;
	}

	public void setAccount(AccountEntity account) {
		this.account = account;
	}

	public List<OrderDetailsEntity> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetailsEntity> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public List<PaymentEntity> getPayment() {
		return payment;
	}

	public void setPayment(List<PaymentEntity> payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "OrdersEntity [ordersId=" + ordersId + ", orderDate=" + orderDate + ", shippingAddress="
				+ shippingAddress + ", account=" + account + ", orderDetails=" + orderDetails + ", payment=" + payment
				+ "]";
	}
	
	
	
}
