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
@Table(name = "size")
public class SizeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sizeId;
	
	@NotEmpty
	private String sizeName;
	
	@OneToMany(mappedBy = "size")
	private List<ProductDetailsEntity> productDetails;

	public SizeEntity() {
		super();
	}


	public SizeEntity(int sizeId, String sizeName, List<ProductDetailsEntity> productDetails) {
		super();
		this.sizeId = sizeId;
		this.sizeName = sizeName;
		this.productDetails = productDetails;
	}



	public int getSizeId() {
		return sizeId;
	}

	public void setSizeId(int sizeId) {
		this.sizeId = sizeId;
	}

	public String getSizeName() {
		return sizeName;
	}

	public void setSizeName(String sizeName) {
		this.sizeName = sizeName;
	}

	

	public List<ProductDetailsEntity> getProductDetails() {
		return productDetails;
	}


	public void setProductDetails(List<ProductDetailsEntity> productDetails) {
		this.productDetails = productDetails;
	}


	@Override
	public String toString() {
		return "SizeEntity [sizeId=" + sizeId + ", sizeName=" + sizeName + ", productDetails=" + productDetails + "]";
	}


	
	
	
}
