package com.ty.productmanagementsystem.dto;

import java.util.List;

import com.ty.productmanagementsystem.entity.Options;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OptionTypeDto {
	private Integer optionTypesId;
	private String optionTypesName;
	private Integer categoriesId;
	private List<Options> option;
	
	public Integer getOptionTypesId() {
		return optionTypesId;
	}
	public void setOptionTypesId(Integer optionTypesId) {
		this.optionTypesId = optionTypesId;
	}
	public String getOptionTypesName() {
		return optionTypesName;
	}
	public void setOptionTypesName(String optionTypesName) {
		this.optionTypesName = optionTypesName;
	}
	public Integer getCategoriesId() {
		return categoriesId;
	}
	public void setCategoriesId(Integer categoriesId) {
		this.categoriesId = categoriesId;
	}
	public List<Options> getOption() {
		return option;
	}
	public void setOption(List<Options> option) {
		this.option = option;
	}
	
	

}