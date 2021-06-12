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
	private List<ProductEntity> product;

	public RamEntity() {
		super();
	}

	public RamEntity(int ramId, String ram, List<ProductEntity> product) {
		super();
		this.ramId = ramId;
		this.ram = ram;
		this.product = product;
	}

	public List<ProductEntity> getProduct() {
		return product;
	}

	public void setProduct(List<ProductEntity> product) {
		this.product = product;
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

}
