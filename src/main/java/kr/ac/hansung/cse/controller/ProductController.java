package kr.ac.hansung.cse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.cse.model.Product;
import kr.ac.hansung.cse.service.ProductService;

@Controller // 이 클래스의 Bean을 자동으로 컨트롤에서 관리
public class ProductController { // controller -> service -> dao 순 호출

	@Autowired
	private ProductService productService;

	@RequestMapping("/products")
	public String getProducts(Model model) {

		List<Product> products = productService.getProducts();
		model.addAttribute("products", products);

		return "products"; // view`s logical name

	}

	@RequestMapping("/viewProduct/{productId}")
	public String viewProduct(@PathVariable int productId, Model model) {

		Product product = productService.getProductById(productId);

		model.addAttribute("product", product);		
		
		return "viewProduct";
	}

}

