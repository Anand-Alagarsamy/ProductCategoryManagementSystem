package com.ty.productmanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoriesResponse {
	private Integer categoriesId;
	private String categoriesName;
	private Integer departmentId;
	private String departmentName;
	private String productName;
	private Integer productId;
	public Integer getCategoriesId() {
		return categoriesId;
	}
	

	/*
	 * public void setCategoriesId(Integer categoriesId) { this.categoriesId =
	 * categoriesId; }
	 */
	
	public String getCategoriesName() {
		return categoriesName;
	}
	public void setCategoriesName(String categoriesName) {
		this.categoriesName = categoriesName;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public void setCategoriesId(Integer categoriesId2) {
		this.categoriesId = categoriesId2;
		
	}
	
	
	


}
