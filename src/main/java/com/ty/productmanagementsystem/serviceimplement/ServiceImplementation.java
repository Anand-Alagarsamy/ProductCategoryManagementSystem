package com.ty.productmanagementsystem.serviceimplement;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.productmanagementsystem.dto.CategoriesDto;
import com.ty.productmanagementsystem.dto.DepartmentDto;
import com.ty.productmanagementsystem.dto.OptionTypeDto;
import com.ty.productmanagementsystem.dto.ProductDto;
import com.ty.productmanagementsystem.dto.ProductVariationDto;
import com.ty.productmanagementsystem.dto.VariationTypeDto;
import com.ty.productmanagementsystem.entity.Categories;
import com.ty.productmanagementsystem.entity.Departments;
import com.ty.productmanagementsystem.entity.OptionTypes;
import com.ty.productmanagementsystem.entity.Product;
import com.ty.productmanagementsystem.entity.ProductVariation;
import com.ty.productmanagementsystem.entity.Variation;
import com.ty.productmanagementsystem.entity.VariationType;
import com.ty.productmanagementsystem.exception.InvalidId;
import com.ty.productmanagementsystem.repository.CategoriesRepository;
import com.ty.productmanagementsystem.repository.DepartmentRepository;
import com.ty.productmanagementsystem.repository.OptionTypesRepository;
import com.ty.productmanagementsystem.repository.ProductRepository;
import com.ty.productmanagementsystem.repository.ProductVariationRepository;
import com.ty.productmanagementsystem.repository.VariationRepository;
import com.ty.productmanagementsystem.repository.VariationTypeRepository;
import com.ty.productmanagementsystem.service.ServicePcm;

@Service
public class ServiceImplementation implements ServicePcm {
	
	// Repository
	@Autowired
	private DepartmentRepository departmentRepository;
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private CategoriesRepository categoriesRepository;
	@Autowired
	private VariationRepository variationRepository;
	@Autowired
	private VariationTypeRepository variationTypeRepository;
	@Autowired
	private OptionTypesRepository optionTypesRepository;
	@Autowired
	private ProductVariationRepository productVariationRepository;

	// Entity
	@Autowired
	private Departments departments;
	@Autowired
	private Categories categories;
	@Autowired
	private Variation variation;
	@Autowired
	private VariationType variationType;
	@Autowired
	private OptionTypes optionTypes;
	@Autowired
	private Product product;
	@Autowired
	ProductVariation productVariation;

	@Override
	public boolean registerDepartment(DepartmentDto departmentDto) {
		BeanUtils.copyProperties(departmentDto, departments);
		departmentRepository.save(departments);
		return true;
	}
	
	
	@Override
	public boolean registerCategories(CategoriesDto categoriesDto) {
		
		departments = departmentRepository.findById(categoriesDto.getDepartmentId()).orElse(null);
		if (departments != null) {
			categories.setDepartments(departments);
			BeanUtils.copyProperties(categoriesDto, categories);
			categoriesRepository.save(categories);
			return true;
		}
		throw new InvalidId("please enter the valid id");
	}
	
	
	@Override
	public boolean registerVariationType(VariationTypeDto variationTypeDto) {
		categories = categoriesRepository.findById(variationTypeDto.getCategoriesId()).orElse(null);
		variationType.setCategories(categories);
		if (categories != null) {
			BeanUtils.copyProperties(variationTypeDto, variationType);
			List<Variation> variations = variationTypeDto.getList();

			BeanUtils.copyProperties(variations, variation);
			variationType.setVariation(variations);
			variationRepository.save(variation);
			variationTypeRepository.save(variationType);
			return true;
		}
		throw new InvalidId("please enter the valid id");
	}
	
	
	
	
	@Override
	public boolean registerOptionType(OptionTypeDto optionTypeDto) {
		categories = categoriesRepository.findById(optionTypeDto.getCategoriesId()).orElse(null);
		optionTypes.setCategories(categories);
		if (categories != null) {
			BeanUtils.copyProperties(optionTypeDto, optionTypes);
			optionTypesRepository.save(optionTypes);
			return true;
		}
		throw new InvalidId("please enter the valid id");
	}
	
	
	@Override
	public boolean registerProduct(ProductDto productDto) {
categories = categoriesRepository.findById(productDto.getCategoriesId()).orElse(null);
		
		if (categories !=null) {
			product.setCategories(categories);
			departments = departmentRepository.findById(productDto.getDepartmentId()).orElse(null);
			product.setDepartments(departments);
			variationType = variationTypeRepository.findById(productDto.getVariationTypeId()).orElse(null);
			product.setDepartments(departments);
			optionTypes = optionTypesRepository.findById(productDto.getOptionTypesId()).orElse(null);
			product.setOptionTypes(optionTypes);
			BeanUtils.copyProperties(productDto, product);
			productRepository.save(product);
			return true;
			
		}
		throw new InvalidId("please enter the valid id");
	}
	
	
	
	
	@Override
	public boolean registerProductVariation(ProductVariationDto productVariationDto) {
		product = productRepository.findById(productVariationDto.getProductId()).orElse(null);
		if (product!=null) {
			productVariation.setProduct(product);
			variation = variationRepository.findById(productVariationDto.getVariationId()).orElse(null);
			productVariation.setVariation(variation);
			BeanUtils.copyProperties(productVariationDto, productVariation);
			productVariationRepository.save(productVariation);
			return false;
		}
		throw new InvalidId("please enter the valid id");
	}
	
}