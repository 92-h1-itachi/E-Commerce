package com.ecommerce.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.entity.ProductDetailsEntity;
import com.ecommerce.repository.ProductDetailsRepository;
import com.ecommerce.serviceIF.ProductDetailsServiceIF;

@Service
public class ProductDetailsService implements ProductDetailsServiceIF{

	@Autowired
	ProductDetailsRepository ProRepo;
//	
//	@Override
//	public List<ProductDetailsEntity> listAll(String keyword) {
//		if (keyword != null) {
//            return ProRepo.searchByName(keyword);
//        }
//        return (List<ProductDetailsEntity>) ProRepo.findAll();
//    }

	@Override
	public List<ProductDetailsEntity> getProductDetails() {
		
		return (List<ProductDetailsEntity>) ProRepo.findAll();
	}

	@Override
	public void saveProductDetails(ProductDetailsEntity productdetails) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Set<ConstraintViolation<ProductDetailsEntity>> violations = factory.getValidator().validate(productdetails);
        if(violations.isEmpty()){
        	ProRepo.save(productdetails);
        }else {
            System.out.println("do not execute database script");
        }
		
	}

	@Override
	public void deleteProductDetails(int productdetailsId) {
		ProRepo.deleteById(productdetailsId);		
	}

	@Override
	public ProductDetailsEntity getProductDetails(int productdetailsId) {
		Optional<ProductDetailsEntity> productdetails = ProRepo.findById(productdetailsId);
        return productdetails.isPresent() ? productdetails.get() : null;
	}
}
