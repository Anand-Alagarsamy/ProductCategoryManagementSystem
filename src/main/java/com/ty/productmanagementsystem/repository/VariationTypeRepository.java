package com.ty.productmanagementsystem.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ty.productmanagementsystem.entity.VariationType;

@Repository
public interface VariationTypeRepository extends JpaRepository<VariationType, Integer> {

}
