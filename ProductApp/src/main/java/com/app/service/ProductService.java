package com.app.service;

import com.app.model.Product;
import com.app.repository.ProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {


    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public Product addProduct(Product request) {
        return repo.save(request);
    }


    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public String removeProduct(int id) {
        Product product = repo.findById(id).get();
        String status ="";
        if(product != null){
            repo.delete(product);
            status = "success delete";
        }
        else{
            status = "fail delete";
        }
        return status;
    }
}
