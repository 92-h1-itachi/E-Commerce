package com.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.ProductEntity;

@Repository
public interface ProductRepository extends CrudRepository<ProductEntity, Integer>{
	
	@Query("select p from ProductEntity p "
            + "where(p.productName Like %?1%) "
            + "or(p.size.sizeName = ?2) "
            + "or(p.color.colorName = ?3)")
    List<ProductEntity> searchProduct(String product, String size, String color);
	
	ProductEntity findByProductId(int productdetailsId);
	
    List<ProductEntity> getShowHomeProduct();
}
