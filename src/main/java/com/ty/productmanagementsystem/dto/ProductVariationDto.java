package com.ty.productmanagementsystem.dto;


import com.ty.productmanagementsystem.entity.Product;
import com.ty.productmanagementsystem.entity.Variation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ProductVariationDto {
	
	 private Integer productvariationId;
	 private Integer productId;
	 private Integer variationId;
	 
	public Integer getProductvariationId() {
		return productvariationId;
	}
	public void setProductvariationId(Integer productvariationId) {
		this.productvariationId = productvariationId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getVariationId() {
		return variationId;
	}
	public void setVariationId(Integer variationId) {
		this.variationId = variationId;
	}
	 
	 
	 

}
