package com.ty.productmanagementsystem.dto;
import java.util.List;

import com.ty.productmanagementsystem.entity.Variation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VariationTypeDto {
	private Integer VariationTypeId;
	private String VariationTypeName;
	private  Integer categoriesId;
	private List<Variation> list;
	
	public Integer getVariationTypeId() {
		return VariationTypeId;
	}
	public void setVariationTypeId(Integer variationTypeId) {
		VariationTypeId = variationTypeId;
	}
	public String getVariationTypeName() {
		return VariationTypeName;
	}
	public void setVariationTypeName(String variationTypeName) {
		VariationTypeName = variationTypeName;
	}
	public Integer getCategoriesId() {
		return categoriesId;
	}
	public void setCategoriesId(Integer categoriesId) {
		this.categoriesId = categoriesId;
	}
	public List<Variation> getList() {
		return list;
	}
	public void setList(List<Variation> list) {
		this.list = list;
	}
	
	

}
