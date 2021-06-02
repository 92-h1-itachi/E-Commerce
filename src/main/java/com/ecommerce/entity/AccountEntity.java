package com.ecommerce.entity;

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
@Table(name = "account")
public class AccountEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int accountId;
	
	@NotEmpty
	private String accountName;
	
	@NotEmpty
	private String password;

	@OneToMany(mappedBy = "account")
	private List<OrdersEntity> orders;
	
	@ManyToOne
	@JoinColumn(name = "userRoleId")
	private UserRoleEntity userRole;
	
	@ManyToOne
	@JoinColumn(name = "customerId")
	private CustomerEntity customer;

	public AccountEntity() {
		super();
	}

	public AccountEntity(int accountId, String accountName, String password, List<OrdersEntity> orders,
			UserRoleEntity userRole, CustomerEntity customer) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.password = password;
		this.orders = orders;
		this.userRole = userRole;
		this.customer = customer;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<OrdersEntity> getOrders() {
		return orders;
	}

	public void setOrders(List<OrdersEntity> orders) {
		this.orders = orders;
	}

	public UserRoleEntity getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRoleEntity userRole) {
		this.userRole = userRole;
	}

	public CustomerEntity getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "AccountEntity [accountId=" + accountId + ", accountName=" + accountName + ", password=" + password
				+ ", orders=" + orders + ", userRole=" + userRole + ", customer=" + customer + "]";
	}
	
	
}
