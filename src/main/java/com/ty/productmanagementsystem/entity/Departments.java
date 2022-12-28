package com.ty.productmanagementsystem.entity;
import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Component
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Departments implements Serializable{
	
	@Id
	private Integer departmentId ;
	
	@Column(name = "department_name")
	@Length(max=45)
	private String departmentName;
	

	//MAPPING FOR PRODUCT
	//@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "departments")
//	@JoinColumn(name="departmentId",referencedColumnName = "departmentId")
	private List<Product> product;
	
	
    // MAPPING FOR CATEGORES
	//@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "departments")
//	@JoinColumn(name="departmentId",referencedColumnName = "departmentId")
	private List<Categories>categories;
	
	
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
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	public List<Categories> getCategories() {
		return categories;
	}
	public void setCategories(List<Categories> categories) {
		this.categories = categories;
	}
	
}
