package com.example.feelmoodbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.feelmoodbox.domain.model.Product;
import com.example.feelmoodbox.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    @Autowired
    private ProductService service;


    @GetMapping("/")
    public String home (Model model) {
        return "index";
    }


    @RequestMapping("/products")
    public List<Product> getAllProducts() {
        return (List<Product>) service.findAllProducts();
    }
}