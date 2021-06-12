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
@Table(name = "images")
public class ImagesEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int imagesId;

	@NotEmpty
	private String imagesSmall;

	@NotEmpty
	private String imagesBig;

	@ManyToOne
	@JoinColumn(name = "productId")
	private ProductEntity product;

	public ImagesEntity() {
		super();
	}

	public ImagesEntity(int imagesId, String imagesSmall, String imagesBig, ProductEntity productDetails) {
		super();
		this.imagesId = imagesId;
		this.imagesSmall = imagesSmall;
		this.imagesBig = imagesBig;
		this.product = product;
	}

	public int getImagesId() {
		return imagesId;
	}

	public void setImagesId(int imagesId) {
		this.imagesId = imagesId;
	}

	public String getImagesSmall() {
		return imagesSmall;
	}

	public void setImagesSmall(String imagesSmall) {
		this.imagesSmall = imagesSmall;
	}

	public String getImagesBig() {
		return imagesBig;
	}

	public void setImagesBig(String imagesBig) {
		this.imagesBig = imagesBig;
	}

	public ProductEntity getProduct() {
		return product;
	}

	public void setProduct(ProductEntity product) {
		this.product = product;
	}

	
	

}
