package com.oficinaircoelho.inventory.control.and.sales.system.resources;

import com.oficinaircoelho.inventory.control.and.sales.system.sales.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    @GetMapping
    public ResponseEntity<Product> findAll(){
        Product p = new Product(1L,"Motor","Motor de caminhão",2000.00,3);
        return ResponseEntity.ok().body(p);
    }
}
