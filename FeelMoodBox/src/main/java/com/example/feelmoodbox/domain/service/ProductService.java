package com.example.feelmoodbox.domain.service;

import com.example.feelmoodbox.domain.model.Product;
import com.example.feelmoodbox.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class  ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Iterable<Product> findAllProducts() {
        return productRepository.findAll();
    }
}
