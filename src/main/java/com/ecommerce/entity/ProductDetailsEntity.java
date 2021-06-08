package com.ecommerce.entity;

import java.io.Serializable;
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
@Table(name = "productdetails")
public class ProductDetailsEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productdetailsId;

	@NotEmpty
	private String productDetailsName;

	@NotEmpty
	private double prince;
	
	@NotEmpty
	private String status;
	
	@NotEmpty
	private int numberProduct;
		
	

	@OneToMany(mappedBy = "productDetails")
	private List<ImagesEntity> images;
	
	@OneToMany(mappedBy = "productdetails")
	private List<PromotionEntity> promotion;

	@ManyToOne
	@JoinColumn(name = "productId")
	private ProductEntity product;

	@ManyToOne
	@JoinColumn(name = "ramId")
	private RamEntity ram;

	@ManyToOne
	@JoinColumn(name = "sizeId")
	private SizeEntity size;

	@ManyToOne
	@JoinColumn(name = "colorId")
	private ColorEntity color;

	public ProductDetailsEntity() {
		super();
	}




	public ProductDetailsEntity(int productdetailsId, String productDetailsName, double prince, String status,
			int numberProduct, List<ImagesEntity> images, List<PromotionEntity> promotion, ProductEntity product,
			RamEntity ram, SizeEntity size, ColorEntity color) {
		super();
		this.productdetailsId = productdetailsId;
		this.productDetailsName = productDetailsName;
		this.prince = prince;
		this.status = status;
		this.numberProduct = numberProduct;
		this.images = images;
		this.promotion = promotion;
		this.product = product;
		this.ram = ram;
		this.size = size;
		this.color = color;
	}




	public int getProductdetailsId() {
		return productdetailsId;
	}

	public void setProductdetailsId(int productdetailsId) {
		this.productdetailsId = productdetailsId;
	}

	public String getProductDetailsName() {
		return productDetailsName;
	}

	public void setProductDetailsName(String productDetailsName) {
		this.productDetailsName = productDetailsName;
	}

	public double getPrince() {
		return prince;
	}

	public void setPrince(double prince) {
		this.prince = prince;
	}

	public List<ImagesEntity> getImages() {
		return images;
	}

	public void setImages(List<ImagesEntity> images) {
		this.images = images;
	}

	public ProductEntity getProduct() {
		return product;
	}

	public void setProduct(ProductEntity product) {
		this.product = product;
	}

	public RamEntity getRam() {
		return ram;
	}

	public void setRam(RamEntity ram) {
		this.ram = ram;
	}

	public SizeEntity getSize() {
		return size;
	}

	public void setSize(SizeEntity size) {
		this.size = size;
	}

	public ColorEntity getColor() {
		return color;
	}

	public void setColor(ColorEntity color) {
		this.color = color;
	}
	

	public List<PromotionEntity> getPromotion() {
		return promotion;
	}

	public void setPromotion(List<PromotionEntity> promotion) {
		this.promotion = promotion;
	}
	
	

	public String getStatus() {
		return status;
	}




	public void setStatus(String status) {
		this.status = status;
	}




	public int getNumberProduct() {
		return numberProduct;
	}




	public void setNumberProduct(int numberProduct) {
		this.numberProduct = numberProduct;
	}




	@Override
	public String toString() {
		return "ProductDetailsEntity [productdetailsId=" + productdetailsId + ", productDetailsName="
				+ productDetailsName + ", prince=" + prince + ", status=" + status + ", numberProduct=" + numberProduct
				+ ", images=" + images + ", promotion=" + promotion + ", product=" + product + ", ram=" + ram
				+ ", size=" + size + ", color=" + color + "]";
	}





	

}
