package com.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.entity.CategoryEntity;
import com.ecommerce.repository.CategoryRepository;
import com.ecommerce.serviceIF.CategoryServiceIF;

@Service
public class CategoryService implements CategoryServiceIF{

	
	@Autowired
	CategoryRepository CateRepo;
	
	@Override
	public List<CategoryEntity> getCategory() {
		
		return (List<CategoryEntity>) CateRepo.findAll();
	}

}
