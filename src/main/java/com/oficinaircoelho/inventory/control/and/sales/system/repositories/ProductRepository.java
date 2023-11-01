package com.oficinaircoelho.inventory.control.and.sales.system.repositories;

import com.oficinaircoelho.inventory.control.and.sales.system.sales.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
