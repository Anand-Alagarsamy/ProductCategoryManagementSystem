package com.ty.productmanagementsystem.controller;

import java.util.List;

import org.hibernate.annotations.OnDelete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ty.productmanagementsystem.dto.CategoriesDto;
import com.ty.productmanagementsystem.dto.CategoriesResponse;
import com.ty.productmanagementsystem.dto.DepartmentDto;
import com.ty.productmanagementsystem.dto.Departmentshow;
import com.ty.productmanagementsystem.dto.FindByIdResponse;
import com.ty.productmanagementsystem.dto.FindByProductId;
import com.ty.productmanagementsystem.dto.OptionTypeDto;
import com.ty.productmanagementsystem.dto.ProductDto;
import com.ty.productmanagementsystem.dto.ShowAll;
import com.ty.productmanagementsystem.dto.VariationTypeDto;
import com.ty.productmanagementsystem.entity.Categories;
import com.ty.productmanagementsystem.entity.Departments;
import com.ty.productmanagementsystem.entity.OptionTypes;
import com.ty.productmanagementsystem.entity.Product;
import com.ty.productmanagementsystem.entity.VariationType;
import com.ty.productmanagementsystem.response.Response;
import com.ty.productmanagementsystem.service.CrudService;

@RequestMapping(path = "/API/CRUD")
@RestController
public class ControllerCrud {
	
	//private static final String VariationType = null;
	@Autowired
	private Response response;
	@Autowired
	private CrudService crudService;
	

	// ************************update***************************
	
	@PutMapping("/UPDATEDEPARTMENT")
	public ResponseEntity<Response> updateDeparment(@RequestBody DepartmentDto departmentDto) {
		Departments departments = crudService.updateDeparment(departmentDto);
		if (departments != null) {
			response.setMessage(" sucessful");
			response.setStatus(200);
			return new ResponseEntity<Response>(response, HttpStatus.OK);
		}
		return null;

	}

	@PutMapping("/UPDATE/CATEGORIES")
	public ResponseEntity<Response> updateCategories(@RequestBody CategoriesDto categoriesDto) {
		Categories categories = crudService.updateCategories(categoriesDto);
		if (categories != null) {
			response.setMessage(" sucessful");
			response.setStatus(200);
			return new ResponseEntity<Response>(response, HttpStatus.ACCEPTED);
		}
		return null;
	}

	@PutMapping("/UPDATE/VARIATIONTYPE")
	public ResponseEntity<Response> updateVariationType(@RequestBody VariationTypeDto variationTypeDto) {
		VariationType variationType = crudService.updateVariationType(variationTypeDto);
		if (variationType != null) {
			response.setMessage(" sucessful");
			response.setStatus(200);
			return new ResponseEntity<Response>(response, HttpStatus.ACCEPTED);
		}
		return null;
	}

	@PutMapping("/UPDATE/OPTIONTYPE")
	public ResponseEntity<Response> updateoptionType(@RequestBody OptionTypeDto optionTypeDto) {
		OptionTypes optionTypes = crudService.registoroptionType(optionTypeDto);

		if (optionTypes != null) {
			response.setMessage(" sucessful");
			response.setStatus(200);
			return new ResponseEntity<Response>(response, HttpStatus.ACCEPTED);
		}
		return null;
	}

	@PutMapping("/UPDATE/PRODUCT")
	public ResponseEntity<Response> updateProduct(@RequestBody ProductDto productDto) {
		Product product = crudService.updateProduct(productDto);
		if (product != null) {
			response.setMessage("sucessful");
			response.setStatus(200);
			return new ResponseEntity<Response>(response, HttpStatus.ACCEPTED);
		}
		return null;

	}

	// **************************** delete ******************************************
	
	//@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/DELETE/DEPARTMENT")
	private ResponseEntity<Response> deletedepartment(@RequestBody DepartmentDto departmentDto) {
		if (crudService.deletedepartment(departmentDto)) {
			response.setMessage(" sucessful");
			response.setStatus(200);
			return new ResponseEntity<Response>(response, HttpStatus.ACCEPTED);
		}
		return null;

	}
	
	//@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/DELETE/CATEGORIES")
	private ResponseEntity<Response> deleteCategories(@RequestBody CategoriesDto categoriesDto) {
		if (crudService.deleteCategories(categoriesDto)) {
			response.setMessage(" sucessful");
			response.setStatus(200);
			return new ResponseEntity<Response>(response, HttpStatus.ACCEPTED);
		}
		return null;
	}
	
	//@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/DELETE/VARIATIONTYPE")
	public ResponseEntity<Response> deleteVariationType(@RequestBody VariationTypeDto variationTypeDto) {
		if (crudService.deleteVariationType(variationTypeDto)) {
			response.setMessage(" sucessful");
			response.setStatus(200);
			return new ResponseEntity<Response>(response, HttpStatus.ACCEPTED);
		}
		return null;
	}
	
	//@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/DELETE/OPTIONTYPE")
	public ResponseEntity<Response> deleteoptionType(@RequestBody OptionTypeDto optionTypeDto) {
		if (crudService.deleteoptionType(optionTypeDto)) {
			response.setMessage("sucessful");
			response.setStatus(200);
			return new ResponseEntity<Response>(response, HttpStatus.ACCEPTED);
		}
		return null;
	}
	
	//@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/DELETE/PRODUCT")
	public ResponseEntity<Response> deleteProduct(@RequestBody ProductDto productDto) {
		if (crudService.deleteProduct(productDto)) {
			response.setMessage(" sucessful");
			response.setStatus(200);
			return new ResponseEntity<Response>(response, HttpStatus.ACCEPTED);
		}
		return null;

	}
// ********************* fetch all ************************************
	
	//@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/SHOWALL")
	public ResponseEntity<Response> showAll(){
		List<Departments> product = crudService.showAll();
		if(product!=null){
			response.setMessage(" sucessful");
			response.setStatus(200);
			response.setData(product);
			return new ResponseEntity<Response>(response,HttpStatus.ACCEPTED);
		}
		return null;
	
}  
//	@PostMapping("/searchDepartment")
//	public ResponseEntity<Response> searchDepartment(@RequestBody DepartmentDto departmentDto){
//		 Departmentshow  departmentsshow = crudService.searchDepartment(departmentDto);
//		if(departmentsshow!=null){
//			response.setMessage(" sucessful");
//			response.setStatus(200);
//			response.setData(departmentsshow);
//			return new ResponseEntity<Response>(response,HttpStatus.ACCEPTED);
//		}
//		return null;
//		
//	}
	
	@GetMapping("/SEARCH/PRODUCT")
	public ResponseEntity<Response> searchProduct(@RequestBody FindByProductId byProductId){
		FindByIdResponse byIdResponse  = crudService.searchProduct(byProductId);
		if(byIdResponse!=null){
			response.setMessage(" sucessful");
			response.setStatus(200);
			response.setData(byIdResponse);
			return new ResponseEntity<Response>(response,HttpStatus.ACCEPTED);
		}
		return null;
		
	}
	
//	@PostMapping("/searchCaegories")
//	private ResponseEntity<Response> searchCaegories(@RequestBody CategoriesDto categoriesDto) {
//		CategoriesResponse categoriesResponse= crudService.searchCaegories(categoriesDto);
//		if (categoriesResponse!=null) {
//			response.setMessage("sucessful");
//			response.setStatus(200);
//			response.setData(categoriesResponse);
//			return new ResponseEntity<Response>(response, HttpStatus.ACCEPTED);
//		}
//		return null;
//
//	}
	
	
	@GetMapping("/SORTBY/VARIATIONTYPE")
	public ResponseEntity<Response> sortByVariation() {
		List<VariationType> sortByVariation = crudService.sortByVariation();
		if (sortByVariation!=null) {
			response.setMessage(" sucessful");
			response.setStatus(200);
			response.setData(sortByVariation);
			return new ResponseEntity<Response>(response, HttpStatus.ACCEPTED);
		}
		return null;

	}
	@GetMapping("/SORTBY/DEPARTMENT")
	public ResponseEntity<Response> sortByDepartment(){
		List<Departments> departmentssort = crudService.sortByDepartment();
		if(departmentssort!=null){
			response.setMessage(" sucessful");
			response.setStatus(200);
			response.setData(departmentssort);
			return new ResponseEntity<Response>(response,HttpStatus.ACCEPTED);
		}
		return null;
	}
	@GetMapping("/SORTBY/PRODUCT")
	public ResponseEntity<Response> sortByProduct(){
		List<Product> products = crudService.sortByProduct();
		if(products!=null){
			response.setMessage(" sucessful");
			response.setStatus(200);
			response.setData(products);
			return new ResponseEntity<Response>(response,HttpStatus.ACCEPTED);
		}
		return null;
	}
	@GetMapping("/SORTBY/PRODUCT/CATEGORIES")
	public ResponseEntity<Response> sortProductcategories(){
		List<Product> products = crudService.sortProductCategories();
		if(products!=null){
			response.setMessage(" sucessful");
			response.setStatus(200);
			response.setData(products);
			return new ResponseEntity<Response>(response,HttpStatus.ACCEPTED);
		}
		return null;
	}
	
}
