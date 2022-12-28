package com.ty.productmanagementsystem.entity;
import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

import com.ty.productmanagementsystem.dto.CategoriesDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Categories implements Serializable {
	
	@Id
	private Integer categoriesId;
	@Column(name="categories_name", length = 45)
//	@NotNull
	private String categoriesName;

	
//MAPPING FOR DEPARTMENT - UNIDIRECTIONAL	
	@ManyToOne(cascade = CascadeType.ALL)
	private Departments departments;
	
	
// MAPPING FOR PRODUCT - BIDIRECTIONAL
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "categories")
	//@JoinColumn(name="categoriesId",referencedColumnName = "categoriesId")
	private List<Product> product;
	
// MAPPING FOR VARIATION TYPE - BIDIRECTIONAL
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "categories"  )
//	@JoinColumn(name="categoriesId",referencedColumnName = "categoriesId")
	private List<VariationType> variationTypes;

	
//MAPPING FOR OPTION TYPE - BIDIRECTIONAL	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "categories")
	//@JoinColumn(name="categoriesId",referencedColumnName = "categoriesId")
	private List<OptionTypes>optionTypes;

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

	public void setDepartments(Departments departments2) {
		this.departments = departments2;
		
	}

	public CategoriesDto getDepartments() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Variation> getProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

	
	
	
}
