package com.ty.productmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ty.productmanagementsystem.entity.Categories;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories, Integer> {

}
