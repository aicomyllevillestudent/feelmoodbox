package com.example.feelmoodbox;

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
        return Arrays.asList(
                new Product(
                        "1",
                        "macbook Retina 13.3' ME662 (2013)",
                        "3.0GHz Dual-core Haswell Intel Core i5 Turbo Boost up to 3.2 GHz, 3MB L3 cache 8GB (two 4GB SO-DIMMs) of 1600MHz DDR3 SDRAM",
                        "https://macbookpics.s3.eu-de.cloud-object-storage.appdomain.cloud/img1.jpeg",
                        10,
                        2399
                ),
                new Product(
                        "2",
                        "Macbook Pro 13.3' Retina MF841LL/A",
                        "Macbook Pro 13.3' Retina MF841LL/A Model 2015 Option Ram Care 12/2016",
                        "https://macbookpics.s3.eu-de.cloud-object-storage.appdomain.cloud/img2.jpeg",
                        15,
                        1199
                ),
                new Product(
                        "3",
                        "Macbook Pro 15.4' Retina MC975LL/A Model 2012",
                        "3.0GHz Dual-core Haswell Intel Core i5 Turbo Boost up to 3.2 GHz, 3MB L3 cache 8GB (two 4GB SO-DIMMs) of 1600MHz DDR3 SDRAM",
                        "https://macbookpics.s3.eu-de.cloud-object-storage.appdomain.cloud/img3.jpeg",
                        1,
                        1800
                )
        );
    }
}