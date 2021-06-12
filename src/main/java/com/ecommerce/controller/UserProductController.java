//package com.ecommerce.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.ecommerce.entity.ProductDetailsEntity;
//import com.ecommerce.repository.ProductDetailsRepository;
//import com.ecommerce.serviceIF.CategoryServiceIF;
//
//@Controller
//public class UserProductController {
//
//	@Autowired
//	ProductDetailsRepository productDetailsRepo;
//	
//	@Autowired
//	CategoryServiceIF cateSe;
//
//	@GetMapping(value = "/search")
//	public String searchProduct(@RequestParam(name = "keyword") String keyword, Model model) {
//		
//		List<ProductDetailsEntity> productDetailsList = productDetailsRepo.searchProduct(keyword, keyword,keyword);
//
//		model.addAttribute("productDetailsList", productDetailsList);
//		
//		model.addAttribute("keyword", keyword);
//
//		return "client/product-search";
//	}
//
//	@GetMapping(value = "/details/{productDetailsId}")
//	public String showProductDetails(@PathVariable(value = "productDetailsId") int productDetailsId, Model model) {
//		
//		ProductDetailsEntity productDetails = (ProductDetailsEntity) productDetailsRepo.findByproductdetailsId(productDetailsId);
//		
//		List<ProductDetailsEntity> productDetailsList = (List<ProductDetailsEntity>) productDetailsRepo.getShowHomeProduct();
//		
//		model.addAttribute("productDetailsList", productDetailsList);
//		
//		model.addAttribute("productDetails", productDetails);
//		
//		return "client/product-detail";
//	}
//}
