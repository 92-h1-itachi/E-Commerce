package com.ecommerce.entity;



import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "person")
public class PersonEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	
	@NotEmpty
	private String customerName;
	
	@NotEmpty
	private String customerAdress;
	
	@NotEmpty
	private String customerPhone;
	
	@Email(message = "Please enter correct email")
	private String customerEmail;
	
	@NotEmpty
	private Date customerBirthdate;
	
	@OneToMany(mappedBy = "customer")
	private List<AccountEntity> account;

	public PersonEntity() {
		super();
	}

	public PersonEntity(int customerId, String customerName, String customerAdress, String customerPhone,
			String customerEmail, Date customerBirthdate, List<AccountEntity> account) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAdress = customerAdress;
		this.customerPhone = customerPhone;
		this.customerEmail = customerEmail;
		this.customerBirthdate = customerBirthdate;
		this.account = account;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAdress() {
		return customerAdress;
	}

	public void setCustomerAdress(String customerAdress) {
		this.customerAdress = customerAdress;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public Date getCustomerBirthdate() {
		return customerBirthdate;
	}

	public void setCustomerBirthdate(Date customerBirthdate) {
		this.customerBirthdate = customerBirthdate;
	}

	public List<AccountEntity> getAccount() {
		return account;
	}

	public void setAccount(List<AccountEntity> account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAdress="
				+ customerAdress + ", customerPhone=" + customerPhone + ", customerEmail=" + customerEmail
				+ ", customerBirthdate=" + customerBirthdate + ", account=" + account + "]";
	};

	
	
	
	
}
