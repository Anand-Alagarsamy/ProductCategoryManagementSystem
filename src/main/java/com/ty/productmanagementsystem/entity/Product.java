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

import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Component
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable {
	@Id
//	@Column(name = "product_id")
//	@NotNull
	private Integer productId;
	//@Column(name="product_titel")
	@Length(max=45)
	private String productTitel;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	private Departments departments;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	private Categories categories;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	private VariationType variationType;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	private OptionTypes optionTypes;

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

	public Departments getDepartments() {
		return departments;
	}

	public void setDepartments(Departments departments) {
		this.departments = departments;
	}

	public Categories getCategories() {
		return categories;
	}

	/*
	 * public void setCategories(Categories categories) { this.categories =
	 * categories; }
	 */

	public VariationType getVariationType() {
		return variationType;
	}

	public void setVariationType(VariationType variationType) {
		this.variationType = variationType;
	}

	public OptionTypes getOptionTypes() {
		return optionTypes;
	}

	public void setOptionTypes(OptionTypes optionTypes) {
		this.optionTypes = optionTypes;
	}

	public void setCategories(Categories categories2) {
		this.categories = categories2;
		
	}

	
	
//	@OneToMany(cascade = CascadeType.ALL,mappedBy = "product")
////	@JoinColumn(name="productId",referencedColumnName = "productId")
//	private  List<ProductVariation> productVariation;
	
	
	
}
