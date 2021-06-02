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
@Table(name = "userrole")
public class UserRoleEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userRoleId;
	
	@NotEmpty
	private String userRoleName;
	
	@NotEmpty
	private String role;

	@OneToMany(mappedBy = "userRole")
	private List<AccountEntity> account;

	public UserRoleEntity() {
		super();
	}

	public UserRoleEntity(int userRoleId, String userRoleName, String role, List<AccountEntity> account) {
		super();
		this.userRoleId = userRoleId;
		this.userRoleName = userRoleName;
		this.role = role;
		this.account = account;
	}

	public int getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(int userRoleId) {
		this.userRoleId = userRoleId;
	}

	public String getUserRoleName() {
		return userRoleName;
	}

	public void setUserRoleName(String userRoleName) {
		this.userRoleName = userRoleName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<AccountEntity> getAccount() {
		return account;
	}

	public void setAccount(List<AccountEntity> account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "UserRole [userRoleId=" + userRoleId + ", userRoleName=" + userRoleName + ", role=" + role + ", account="
				+ account + "]";
	}
	
	
}
