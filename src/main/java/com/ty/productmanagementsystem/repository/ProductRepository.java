package com.ty.productmanagementsystem.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ty.productmanagementsystem.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
