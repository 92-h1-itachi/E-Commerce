package com.ecommerce.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.entity.ProductEntity;
import com.ecommerce.serviceIF.ProductServiceIF;

@Service
public class ProductService implements ProductServiceIF {

	@Override
	public List<ProductEntity> getProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveProduct(ProductEntity product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProductEntity getProductEntity(int productId) {
		// TODO Auto-generated method stub
		return null;
	}
}
