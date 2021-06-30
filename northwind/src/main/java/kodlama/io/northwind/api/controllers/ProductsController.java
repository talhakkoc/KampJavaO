package kodlama.io.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.northwind.business.abstracts.ProductService;
import kodlama.io.northwind.entities.concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
	
	@Autowired
	private ProductService productService;
	
	public ProductsController(ProductService productService) {
		super();
		this.productService=productService;
	}
	
	@GetMapping("/getall")
	public List<Product> getAll(){
		return this.productService.getAll();
	}
}
