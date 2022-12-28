package com.ty.productmanagementsystem.dto;
import java.util.List;

import com.ty.productmanagementsystem.entity.ProductVariation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
	private Integer productId;
	private String productTitel;
	private Integer categoriesId;
	private Integer departmentId;
	private Integer VariationTypeId;
	private Integer optionTypesId;
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductTitel() {
		return productTitel;
	}
	public void setProductTitel(String productTitel) {
		this.productTitel = productTitel;
	}
	public Integer getCategoriesId() {
		return categoriesId;
	}
	public void setCategoriesId(Integer categoriesId) {
		this.categoriesId = categoriesId;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public Integer getVariationTypeId() {
		return VariationTypeId;
	}
	public void setVariationTypeId(Integer variationTypeId) {
		VariationTypeId = variationTypeId;
	}
	public Integer getOptionTypesId() {
		return optionTypesId;
	}
	public void setOptionTypesId(Integer optionTypesId) {
		this.optionTypesId = optionTypesId;
	}
	
//	private  List<ProductVariation> productVariation;
	
	
	

}
