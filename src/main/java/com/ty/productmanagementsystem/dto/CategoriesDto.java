package com.ty.productmanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CategoriesDto {
	
	private Integer categoriesId;
	private String categoriesName;
	private Integer departmentId;
	
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
	
	
	
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public Integer getDepartmentId() {
		// TODO Auto-generated method stub
		return departmentId;
	}
	
//	public String getDepartmentName() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	

	
	
}