package com.ty.productmanagementsystem.service;

import com.ty.productmanagementsystem.dto.CategoriesDto;
import com.ty.productmanagementsystem.dto.DepartmentDto;
import com.ty.productmanagementsystem.dto.OptionTypeDto;
import com.ty.productmanagementsystem.dto.ProductDto;
import com.ty.productmanagementsystem.dto.ProductVariationDto;
import com.ty.productmanagementsystem.dto.VariationTypeDto;

public interface ServicePcm {


	boolean registerDepartment(DepartmentDto departmentDto);

	boolean registerCategories(CategoriesDto categoriesDto);
	
	boolean registerVariationType(VariationTypeDto variationTypeDto);

	boolean registerOptionType(OptionTypeDto optionTypeDto);

	boolean registerProduct(ProductDto productDto);
	
	boolean registerProductVariation(ProductVariationDto productVariationDto);

	





	

}
