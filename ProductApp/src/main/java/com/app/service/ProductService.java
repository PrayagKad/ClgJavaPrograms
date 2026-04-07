package com.app.service;

import com.app.model.Product;
import com.app.repository.ProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Product updateProduct(int id, Product product) {
        Product pResponse  =repo.findById(id).get();

        if(pResponse != null && !product.getName().isEmpty() && !product.getName().isBlank()){
            pResponse.setName(product.getName());
        } else if (pResponse!= null&& product.getPrice()!=0) {

            pResponse.setPrice(product.getPrice());

        }

        return repo.save(pResponse);

    }
}
