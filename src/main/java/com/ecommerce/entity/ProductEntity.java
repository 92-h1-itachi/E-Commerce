package com.ecommerce.entity;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "product")
public class ProductEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;

	@NotEmpty
	private String productName;

	@NotNull
	private double prince;

	@NotNull
	private int numberProduct;

	@OneToOne
	@JoinColumn(name = "orderDetailsId")
	private OrderDetailsEntity orderdetails;

	@OneToMany(mappedBy = "product")
	private List<ImagesEntity> images;

	@OneToMany(mappedBy = "product")
	private List<PromotionEntity> promotion;

	@ManyToOne
	@JoinColumn(name = "categoryId")
	private CategoryEntity category;

	@ManyToOne
	@JoinColumn(name = "ramId")
	private RamEntity ram;

	@ManyToOne
	@JoinColumn(name = "sizeId")
	private SizeEntity size;

	@ManyToOne
	@JoinColumn(name = "colorId")
	private ColorEntity color;

	public ProductEntity() {
		super();
	}

	public ProductEntity(int productId, String productName, double prince, int numberProduct,
			OrderDetailsEntity orderdetails, List<ImagesEntity> images, List<PromotionEntity> promotion,
			CategoryEntity category, RamEntity ram, SizeEntity size, ColorEntity color) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.prince = prince;
		this.numberProduct = numberProduct;
		this.orderdetails = orderdetails;
		this.images = images;
		this.promotion = promotion;
		this.category = category;
		this.ram = ram;
		this.size = size;
		this.color = color;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrince() {
		return prince;
	}

	public void setPrince(double prince) {
		this.prince = prince;
	}

	public int getNumberProduct() {
		return numberProduct;
	}

	public void setNumberProduct(int numberProduct) {
		this.numberProduct = numberProduct;
	}

	public OrderDetailsEntity getOrderdetails() {
		return orderdetails;
	}

	public void setOrderdetails(OrderDetailsEntity orderdetails) {
		this.orderdetails = orderdetails;
	}

	public CategoryEntity getCategory() {
		return category;
	}

	public void setCategory(CategoryEntity category) {
		this.category = category;
	}

	public List<ImagesEntity> getImages() {
		return images;
	}

	public void setImages(List<ImagesEntity> images) {
		this.images = images;
	}

	public List<PromotionEntity> getPromotion() {
		return promotion;
	}

	public void setPromotion(List<PromotionEntity> promotion) {
		this.promotion = promotion;
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

	public String getPriceFormatted() {
		NumberFormat numberFormat = NumberFormat.getNumberInstance();
		return numberFormat.format(prince);
	}

}
