package com.ecommerce.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.ecommerce.entity.ColorEntity;
import com.ecommerce.entity.ImagesEntity;
import com.ecommerce.entity.OrderDetailsEntity;
import com.ecommerce.entity.OrdersEntity;

import com.ecommerce.entity.ProductEntity;
import com.ecommerce.entity.RamEntity;
import com.ecommerce.entity.SizeEntity;
import com.ecommerce.repository.ColorRepository;
import com.ecommerce.repository.ImagesRepository;
import com.ecommerce.repository.OrderDetailsRepository;

import com.ecommerce.repository.OrdersRepository;

import com.ecommerce.repository.ProductRepository;
import com.ecommerce.repository.RamrRepository;
import com.ecommerce.repository.SizeRepository;

@Controller
@RequestMapping(value = "/")
public class AdminProductController {

	@Autowired
	ProductRepository ProductRepo;

	@Autowired
	RamrRepository RamRepo;

	@Autowired
	ColorRepository ColorRepo;

	@Autowired
	SizeRepository SizeRepo;


	@Autowired
	ImagesRepository imagesRepo;
	
	@Autowired
	OrdersRepository ordersRepo;
	
	@Autowired
	OrderDetailsRepository OrderDetailsRepo;
	
	@GetMapping("/index")
	public ModelAndView showHomeAdmin(Model model) {
		ModelAndView home = new ModelAndView("admin/index");
		return home;
	}
	
	@GetMapping("/orderDetails/{ordersId}")
	public String showOrderDetails(@PathVariable(value = "ordersId") int ordersId ,Model model) {
		List<OrderDetailsEntity> orderDetailsList = (List<OrderDetailsEntity>) OrderDetailsRepo.getOrderDetails(ordersId);
		model.addAttribute("orderDetailsList",orderDetailsList);
		return"admin/show-orderdetail";
	}
	
	@GetMapping("/OrderList")
	public String showOrderList(Model model) {
		List<OrdersEntity> ordersList = (List<OrdersEntity>) ordersRepo.findAll();
		model.addAttribute("ordersList",ordersList);
		return "admin/show-order";
	}

	@GetMapping("/show-productDetails")
	public ModelAndView ShowProduct(Model model) {
		ModelAndView show = new ModelAndView("admin/show-product");
		List<ProductEntity> productDetailsList = (List<ProductEntity>) ProductRepo.findAll();
		model.addAttribute("productDetailsList", productDetailsList);
		return show;
	}

	@RequestMapping(value = "/addProductDetails", method = RequestMethod.GET)
	public String addNewProductDetails(Model model) {
		model.addAttribute("productDetails", new ProductEntity());
		setColorDrop(model);
		setRamDrop(model);
		setSizeDrop(model);
		setProductDrop(model);
		return "admin/addproduct";
	}

	private void setProductDrop(Model model) {
		List<ProductEntity> productList = (List<ProductEntity>) ProductRepo.findAll();
		if (!productList.isEmpty()) {
			Map<Integer, String> productMap = new LinkedHashMap<>();
			for (ProductEntity product : productList) {
				productMap.put(product.getProductId(), product.getProductName());
			}
			model.addAttribute("productList", productMap);
		}
	}

	private void setRamDrop(Model model) {
		List<RamEntity> ramList = (List<RamEntity>) RamRepo.findAll();
		if (!ramList.isEmpty()) {
			Map<Integer, String> ramMap = new LinkedHashMap<>();
			for (RamEntity ram : ramList) {
				ramMap.put(ram.getRamId(), ram.getRam());
			}
			model.addAttribute("ramList", ramMap);
		}
	}

	private void setColorDrop(Model model) {
		List<ColorEntity> colorList = (List<ColorEntity>) ColorRepo.findAll();
		if (!colorList.isEmpty()) {
			Map<Integer, String> colorMap = new LinkedHashMap<>();
			for (ColorEntity color : colorList) {
				colorMap.put(color.getColorId(), color.getColorName());
			}
			model.addAttribute("colorList", colorMap);
		}
	}

	private void setSizeDrop(Model model) {
		List<SizeEntity> sizeList = (List<SizeEntity>) SizeRepo.findAll();
		if (!sizeList.isEmpty()) {
			Map<Integer, String> sizeMap = new LinkedHashMap<>();
			for (SizeEntity size : sizeList) {
				sizeMap.put(size.getSizeId(), size.getSizeName());
			}
			model.addAttribute("sizeList", sizeMap);
		}
	}

	/*@PostMapping("/saveNewProductDetails")
	public String saveNewProductDetails(productEntity productDetails,Model model) {
		model.addAttribute("productDetails", new productEntity());
		productDetailsRepo.save(productDetails);
		List<productEntity> productDetailsList = (List<productEntity>) productDetailsRepo.findAll();
		model.addAttribute("productDetailsList", productDetailsList);
		return "redirect:/show-productDetails";
	}*/
	
	
	@RequestMapping(value = "/saveNewProductDetails", method = RequestMethod.POST)
	public String saveNewProductDetails(@RequestParam("file") MultipartFile file, ProductEntity productDetails, ImagesEntity images, Model model) {
		try {
			byte[] bytes = file.getBytes();
			String pathName1 = "${pageContext.request.contextPath}\\git\\E-Commerce\\src\\main\\webapp\\images";
			File dir1 = new File(pathName1);
			if (!dir1.exists()) {
				dir1.mkdirs();
			}

			String fileSource1 = dir1.getAbsolutePath() + File.separator + file.getOriginalFilename();
			File serverFile1 = new File(fileSource1);
			BufferedOutputStream stream1 = new BufferedOutputStream(new FileOutputStream(serverFile1));
			stream1.write(bytes);
			stream1.close();

			String fileName = file.getOriginalFilename();

			
		

			ImagesEntity newImg = new ImagesEntity();
			newImg.setImagesSmall(fileName);
			imagesRepo.save(newImg);
		
			model.addAttribute("productDetails", new ProductEntity());
			//newImg.setProductDetails(productDetails);
			ProductRepo.save(productDetails);
			

			return "redirect:/show-productDetails";
		} catch (Exception e) {
			System.out.println(e);
			return "redirect:/show-productDetails";
		}
	}

	@GetMapping("/DeleteProductDetails/{productId}")
	public String DeleteProductDetails(@PathVariable(value = "productId") int productId, Model model) {
		ProductRepo.deleteById(productId);
		List<ProductEntity> productDetailsList = (List<ProductEntity>) ProductRepo.findAll();
		model.addAttribute("productDetailsList", productDetailsList);
		return "redirect:/show-productDetails";
	}

	
	@GetMapping(value = "/editProductDetails/{productdetailsId}")
	public String editProductDetails(@PathVariable(value = "productdetailsId") int productdetailsId, Model model) {
		ProductEntity product = ProductRepo.findByProductId(productdetailsId);
		model.addAttribute("productDetais",product);
		setColorDrop(model);
		setRamDrop(model);
		setSizeDrop(model);
		setProductDrop(model);
		
		return "admin/editproduct";
	}
	
	
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String searchProduct(@RequestParam(name = "searchText") String searchText, Model model) {

        String searchText1 = "%" + searchText + "%";
        List<ProductEntity> productDetailsList = 
                ProductRepo.searchProduct(searchText, searchText, searchText);

        model.addAttribute("productDetailsList", productDetailsList);
        model.addAttribute("searchText", searchText);

        return "client/product-search";
    }

}