package com.ecommerce.serviceIF;

import java.util.List;

import com.ecommerce.entity.ProductEntity;

public interface ProductServiceIF {
    public List<ProductEntity> getProduct();
	public void  saveProduct(ProductEntity product);
	public void deleteProduct(int productId);
	public ProductEntity getProductEntity(int productId);
}
