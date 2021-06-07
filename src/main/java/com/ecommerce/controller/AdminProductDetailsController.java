package com.ecommerce.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.ecommerce.entity.ProductDetailsEntity;
import com.ecommerce.serviceIF.ProductDetailsServiceIF;

@Controller
//@RequestMapping("productDetails")
public class AdminProductDetailsController {

	@Autowired
	private ProductDetailsServiceIF prodetailsservice;
	
	@GetMapping("/list")
    public String ListProductDetails(Model theModel){
        List<ProductDetailsEntity> prodetails = prodetailsservice.getProductDetails();
        theModel.addAttribute("list",prodetails);
        return "admin/show-product";
    }
	
	@GetMapping("/show")
	public String ShowProductDetails(Model theModel){
		ProductDetailsEntity prodetails = new ProductDetailsEntity();
        theModel.addAttribute("list",prodetails);
        return "admin/addproduct";
	}
//	public ModelAndView ShowProduct() {
//		ModelAndView show = new ModelAndView("admin/show-product");
//		return show;
//	}
	
	@PostMapping("/add")
    public String AddProductDetails(@Valid ProductDetailsEntity prodetails, BindingResult result, Model theModel){
        if (result.hasErrors()) {
            theModel.addAttribute("list", prodetails);
            return "admin/show-product";
        }
        prodetailsservice.saveProductDetails(prodetails);
        return"redirect:/productDetails/list";
    }
//	public ModelAndView AddProduct() {
//		ModelAndView add = new ModelAndView("admin/addproduct");
//		return add;
//	}
	
	 @GetMapping("/Update")
	    public String UpdateProductDetails(@RequestParam("ProductDetailsId") int productdetailsId, Model theModel){
		 ProductDetailsEntity prodetails = prodetailsservice.getProductDetails(productdetailsId);
	        theModel.addAttribute("list",prodetails);
	        return "admin/show-product";
	    }

	    @GetMapping("/Delete")
	    public String DeleteProductDetails(@RequestParam("ProductDetailsId") int productdetailsId){
	    	prodetailsservice.deleteProductDetails(productdetailsId);
	        
	        return "redirect:/productDetails/list";
	    }
//	    
//	    @GetMapping("/search")
//	    public String SearchName(Model model, @Param("keyword") String keyword) {
//	    	List<ProductDetailsEntity> listProDe = prodetailsservice.listAll(keyword);
//	    	model.addAttribute("listProDe", listProDe);
//	    	model.addAttribute("keyword", keyword);
//			return "client/product-search";
//			
//		}
}
