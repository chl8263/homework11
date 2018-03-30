package controller;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.ProductService;

import java.util.List;

@Controller
public class ProductController { //controller -> service -> dao

    @Autowired
    private ProductService productService;

    @RequestMapping("/products")
    public String getProducts(Model model){
        List<Product> products = productService.getProducts();
        model.addAttribute("products",products);
        return "products";
    }
}
