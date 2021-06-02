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
@Table(name = "ram")
public class RamEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ramId;
	
	@NotEmpty
	private String ram;
	
	@OneToMany(mappedBy = "ram")
	private List<ProductDetailsEntity> productDetails;

	public RamEntity() {
		super();
	}


	public RamEntity(int ramId, String ram, List<ProductDetailsEntity> productDetails) {
		super();
		this.ramId = ramId;
		this.ram = ram;
		this.productDetails = productDetails;
	}



	public int getRamId() {
		return ramId;
	}

	public void setRamId(int ramId) {
		this.ramId = ramId;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	

	public List<ProductDetailsEntity> getProductDetails() {
		return productDetails;
	}


	public void setProductDetails(List<ProductDetailsEntity> productDetails) {
		this.productDetails = productDetails;
	}


	@Override
	public String toString() {
		return "RamEntity [ramId=" + ramId + ", ram=" + ram + ", productDetails=" + productDetails + "]";
	}


	
	
	
}
