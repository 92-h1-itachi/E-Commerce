package com.ecommerce.serviceIF;

import java.util.List;

import com.ecommerce.entity.ProductDetailsEntity;

public interface ProductDetailsServiceIF {

//	public List<ProductDetailsEntity> listAll(String keyword);
	public List<ProductDetailsEntity> getProductDetails();
    public void saveProductDetails(ProductDetailsEntity productdetails);
    public void deleteProductDetails(int productdetailsId);
    public ProductDetailsEntity getProductDetails (int productdetailsId);
}
