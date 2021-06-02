package com.ecommerce.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "payment")
public class PaymentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int paymentId;
	
	@NotEmpty
	private Date paymenDate;
	
	@NotEmpty
	private Double amount;
	
	@ManyToOne
	@JoinColumn(name = "ordersId")
	private OrdersEntity ordersP;
	
	@ManyToOne
	@JoinColumn(name = "creditCardId")
	private CreditCardEntity creditcard;

	public PaymentEntity() {
		super();
	}

	public PaymentEntity(int paymentId, Date paymenDate, Double amount, OrdersEntity ordersP,
			CreditCardEntity creditcard) {
		super();
		this.paymentId = paymentId;
		this.paymenDate = paymenDate;
		this.amount = amount;
		this.ordersP = ordersP;
		this.creditcard = creditcard;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public Date getPaymenDate() {
		return paymenDate;
	}

	public void setPaymenDate(Date paymenDate) {
		this.paymenDate = paymenDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public OrdersEntity getOrdersP() {
		return ordersP;
	}

	public void setOrdersP(OrdersEntity ordersP) {
		this.ordersP = ordersP;
	}

	public CreditCardEntity getCreditcard() {
		return creditcard;
	}

	public void setCreditcard(CreditCardEntity creditcard) {
		this.creditcard = creditcard;
	}

	@Override
	public String toString() {
		return "PaymentEntity [paymentId=" + paymentId + ", paymenDate=" + paymenDate + ", amount=" + amount
				+ ", ordersP=" + ordersP + ", creditcard=" + creditcard + "]";
	}
	
	
	
}
