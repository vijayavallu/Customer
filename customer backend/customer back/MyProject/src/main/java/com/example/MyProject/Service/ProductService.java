package com.example.MyProject.Service;



import java.util.List;

import com.example.MyProject.Model.customer;

public interface ProductService {
    public customer saveProduct(customer product);
    public List<customer> getAllProduct();
    public customer getProductById(Integer id);
    public String deleteProduct(Integer id);
    public customer editProduct(customer product,Integer id);


    

    
}
