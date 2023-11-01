package com.oficinaircoelho.inventory.control.and.sales.system.config;

import com.oficinaircoelho.inventory.control.and.sales.system.repositories.ProductRepository;
import com.oficinaircoelho.inventory.control.and.sales.system.sales.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;


    @Override
    public void run(String... args) throws Exception {
        Product p1 =new Product(null, "Caixa de direcao", "Melhora o consumo do caminhao", 2000.00, 5);
        Product p2 = new Product(null, "Unidade", "Melhora o consumo do caminhao", 2000.00, 5);
        Product p3 =new Product(null, "Motor", "Melhora o consumo do caminhao", 10000.00, 2);
        productRepository.saveAll(Arrays.asList(p1,p2,p3));
    }
}
