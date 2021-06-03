package com.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@GetMapping("/")
	public ModelAndView Home() {
		ModelAndView index = new ModelAndView("client/index");
		return index;
	}
	
	@GetMapping("/introduce")
	public ModelAndView Introduce() {
		ModelAndView introduce = new ModelAndView("client/introduce");
		return introduce;
	}
	@GetMapping("/product")
	public ModelAndView Product() {
		ModelAndView product = new ModelAndView("client/product");
		return product;
	}
	@GetMapping("/news-list")
	public ModelAndView Newslist() {
		ModelAndView newslist = new ModelAndView("client/news-list");
		return newslist;
	}
	@GetMapping("/security")
	public ModelAndView Security() {
		ModelAndView security = new ModelAndView("client/security");
		return security;
	}
	@GetMapping("/contact")
	public ModelAndView Contact() {
		ModelAndView contact = new ModelAndView("client/contact");
		return contact;
	}
	@GetMapping("/product-search")
	public ModelAndView Productsearch() {
		ModelAndView productsearch = new ModelAndView("client/product-search");
		return productsearch;
	}
}
