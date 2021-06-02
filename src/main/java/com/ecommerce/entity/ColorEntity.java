package com.ecommerce.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "color")
public class ColorEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int colorId;
	
	@NotEmpty
	private String colorName;
	
	@OneToMany(mappedBy = "color")
	private List<ProductDetailsEntity> productDetails;

	public ColorEntity() {
		super();
	}

	



	
}
