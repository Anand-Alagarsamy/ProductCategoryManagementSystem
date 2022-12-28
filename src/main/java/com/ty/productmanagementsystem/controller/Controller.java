package com.ty.productmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ty.productmanagementsystem.dto.CategoriesDto;
import com.ty.productmanagementsystem.dto.DepartmentDto;
import com.ty.productmanagementsystem.dto.OptionTypeDto;
import com.ty.productmanagementsystem.dto.ProductDto;
import com.ty.productmanagementsystem.dto.ProductVariationDto;
import com.ty.productmanagementsystem.dto.VariationTypeDto;
import com.ty.productmanagementsystem.entity.Departments;
import com.ty.productmanagementsystem.entity.Product;
import com.ty.productmanagementsystem.response.Response;
import com.ty.productmanagementsystem.service.ServicePcm;

@RestController
public class Controller {
	
	@Autowired
     private Response response;
	@Autowired
	private ServicePcm servicePcm;

	
	
	//@PreAuthorize("hasRole('Admin')")
	@PostMapping("/API/REGISTER/DEPARTMENT")
	public ResponseEntity<Response> registerDepartment(@RequestBody DepartmentDto departmentDto){
		if(servicePcm.registerDepartment(departmentDto)){
			response.setMessage("Sucessfully Register your Department");
			response.setStatus(200);
			return new ResponseEntity<Response>(response,HttpStatus.ACCEPTED);
		}
		return null;
		
	}
	
	//@PreAuthorize("hasRole('Employee')")
	@PostMapping("/API/REGISTER/CATEGORIES")
	public ResponseEntity<Response> registerCategories(@RequestBody CategoriesDto categoriesDto ){
		if(servicePcm.registerCategories(categoriesDto)){
			response.setMessage("Sucessfully Register your Categories");
			response.setStatus(200);
			return new ResponseEntity<Response>(response,HttpStatus.ACCEPTED);
		}
		return null;
		
	}
	//@PreAuthorize("hasAnyRole('Admin','Employee')")
	@PostMapping("/API/REGISTER/VARIATIONTYPE")
	public ResponseEntity<Response> registerVariationType(@RequestBody VariationTypeDto variationTypeDto ){
		if(servicePcm.registerVariationType(variationTypeDto)){
			response.setMessage("Sucessfully Register your Variation Type");
			response.setStatus(200);
			return new ResponseEntity<Response>(response,HttpStatus.ACCEPTED);
		}
		return null;
	}
	
	//@PreAuthorize("hasAnyRole('Admin','User')")
	@PostMapping("/API/REGISTER/OPTIONTYPE")
	public ResponseEntity<Response> registerOptionType(@RequestBody OptionTypeDto optionTypeDto ){
		if(servicePcm.registerOptionType(optionTypeDto)){
			response.setMessage("Sucessfully Register your Variation Option Type");
			response.setStatus(200);
			return new ResponseEntity<Response>(response,HttpStatus.ACCEPTED);
		}
		return null;
	}

		//ss@PreAuthorize("hasRole('ADMIN')")
		@PostMapping("/API/REGISTER/PRODUCT")
		public ResponseEntity<Response> registerProduct(@RequestBody ProductDto productDto ){
			if(servicePcm.registerProduct(productDto)){
				response.setMessage("Sucessfully Register your Product");
				response.setStatus(200);
				return new ResponseEntity<Response>(response,HttpStatus.ACCEPTED);
			}
			return null;
		}
	
		@PostMapping("/API/REGISTER/PRODUCTVARIATION")
		public ResponseEntity<Response> registerProductVariation(@RequestBody ProductVariationDto productVariationDto ){
			if(servicePcm.registerProductVariation(productVariationDto)){
				response.setMessage("Sucessfully Register your Product Variation");
				response.setStatus(200);
				return new ResponseEntity<Response>(response,HttpStatus.ACCEPTED);
			}
			return null;
		
	}
		
	

}
