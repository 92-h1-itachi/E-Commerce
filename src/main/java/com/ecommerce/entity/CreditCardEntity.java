package com.ecommerce.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "creditcard")
public class CreditCardEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int creditCardId;
	
	@NotEmpty
	private String creditCardName;
	
	@NotEmpty
	private String creditCardNumber;
	
	@OneToMany(mappedBy = "creditcard")
	private List<PaymentEntity> payment;

	public CreditCardEntity() {
		super();
	}

	public CreditCardEntity(int creditCardId, String creditCardName, String creditCardNumber,
			List<PaymentEntity> payment) {
		super();
		this.creditCardId = creditCardId;
		this.creditCardName = creditCardName;
		this.creditCardNumber = creditCardNumber;
		this.payment = payment;
	}

	public int getCreditCardId() {
		return creditCardId;
	}

	public void setCreditCardId(int creditCardId) {
		this.creditCardId = creditCardId;
	}

	public String getCreditCardName() {
		return creditCardName;
	}

	public void setCreditCardName(String creditCardName) {
		this.creditCardName = creditCardName;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public List<PaymentEntity> getPayment() {
		return payment;
	}

	public void setPayment(List<PaymentEntity> payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "CreditCardEntity [creditCardId=" + creditCardId + ", creditCardName=" + creditCardName
				+ ", creditCardNumber=" + creditCardNumber + ", payment=" + payment + "]";
	}
	
	
}
