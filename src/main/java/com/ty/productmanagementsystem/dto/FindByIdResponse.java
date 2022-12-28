package com.ty.productmanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FindByIdResponse {
	private Integer productId;
	private String productTitel;
	private Integer categoriesId;
	private String categoriesName;
	private Integer departmentId;
	private String departmentName;
	private Integer optionTypesId;
	private String optionTypename;
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
	public Integer getOptionTypesId() {
		return optionTypesId;
	}
	public void setOptionTypesId(Integer optionTypesId) {
		this.optionTypesId = optionTypesId;
	}
	public String getOptionTypename() {
		return optionTypename;
	}
	public void setOptionTypename(String optionTypename) {
		this.optionTypename = optionTypename;
	}
	
	
	

}
