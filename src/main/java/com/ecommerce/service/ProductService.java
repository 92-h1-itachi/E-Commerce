//package com.ecommerce.service;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.Set;
//
//import javax.validation.ConstraintViolation;
//import javax.validation.Validation;
//import javax.validation.ValidatorFactory;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.ecommerce.entity.ProductEntity;
//import com.ecommerce.repository.ProductDetailsRepository;
//import com.ecommerce.serviceIF.ProductServiceIF;
//
//@Service
//public class ProductService implements ProductServiceIF{
//
//	
//	@Autowired
//	ProductDetailsRepository proRepo;
//	
//
//	@Override
//	public void saveProduct(ProductEntity product) {
//		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
//        Set<ConstraintViolation<ProductEntity>> violations = factory.getValidator().validate(product);
//        if(violations.isEmpty()){
//        	proRepo.save(product);
//        }else {
//            System.out.println("do not execute database script");
//        }
//		
//	}
//
//	@Override
//	public void deleteProduct(int productId) {
//		proRepo.deleteById(productId);
//	}
//
//	@Override
//	public ProductEntity getProductEntity(int productId) {
//		 Optional<ProductEntity> product = proRepo.findById(productId);
//	        return product.isPresent() ? product.get() : null;
//	}
//	
//	
//
//}
