package com.example.MyProject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MyProject.Model.customer;
import com.example.MyProject.Repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productrepo;

    @Override
    public customer saveProduct(customer product) {
       return productrepo.save(product);
    }

    @Override
    public List<customer> getAllProduct() {
        return productrepo.findAll();
    }

    @Override
    public customer getProductById(Integer id) {
        return productrepo.findById(id).get();
    }

    @Override
    public String deleteProduct(Integer id) {
        customer product = productrepo.findById(id).get();
        if(product!=null){
            productrepo.delete(product);
            return "Product Delete Sucessfully";
        }
        return "Something erong on server";
        
    }

    @Override
    public customer editProduct(customer product, Integer id) {
        customer oldProduct= productrepo.findById(id).get();

        oldProduct.setName(product.getName());
        oldProduct.setPlace(product.getPlace());
        oldProduct.setEmail(product.getEmail());
        oldProduct.setNumber(product.getNumber());
        return productrepo.save(oldProduct);

       
    }
    
    
}
