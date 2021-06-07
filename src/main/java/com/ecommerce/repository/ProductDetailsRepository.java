package com.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.ProductDetailsEntity;

@Repository
public interface ProductDetailsRepository extends CrudRepository<ProductDetailsEntity, Integer>{

//	@Query("SELECT p FROM ProductDetailsEntity p WHERE CONCAT( p.productDetailsName ,' ', p.prince ,' ', p.colorId.colorName ,' ', p.ramId.ram ,' ', p.sizeId.sizeName ) LIKE %?1%")  //thêm các thành phần tìm kiếm vào concat
//	public List<ProductDetailsEntity> searchByName(String keyword) ; //search(String productName);
	
	@Query("select p from ProductDetailsEntity p "
            + "where(p.productDetailsName Like %?1%) "
            + "or(p.size.sizeName = ?2) "
            + "or(p.color.colorName = ?3)")
    List<ProductDetailsEntity> searchProduct(String productDetails, String size, String color);
}
