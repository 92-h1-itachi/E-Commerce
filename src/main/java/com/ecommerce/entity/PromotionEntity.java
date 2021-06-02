package com.ecommerce.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "promotion")
public class PromotionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int promotionId;
	
	@NotEmpty
	private String promotionName;
	
	@ManyToOne
	@JoinColumn(name = "productId")
	private ProductEntity product;

	public PromotionEntity() {
		super();
	}

	public PromotionEntity(int promotionId, String promotionName, ProductEntity product) {
		super();
		this.promotionId = promotionId;
		this.promotionName = promotionName;
		this.product = product;
	}

	public int getPromotionId() {
		return promotionId;
	}

	public void setPromotionId(int promotionId) {
		this.promotionId = promotionId;
	}

	public String getPromotionName() {
		return promotionName;
	}

	public void setPromotionName(String promotionName) {
		this.promotionName = promotionName;
	}

	public ProductEntity getProduct() {
		return product;
	}

	public void setProduct(ProductEntity product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "PromotionEntity [promotionId=" + promotionId + ", promotionName=" + promotionName + ", product="
				+ product + "]";
	}
	
	
}
