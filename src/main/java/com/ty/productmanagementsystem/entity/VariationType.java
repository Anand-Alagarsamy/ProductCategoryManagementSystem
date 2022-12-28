package com.ty.productmanagementsystem.entity;
import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Component;

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
public class VariationType implements Serializable{
	@Id
//	@Column(name = "Variation_type_id")
//	@NotNull
	@GeneratedValue
	private Integer VariationTypeId;
	@Column(name = "Variation_type_name")
	@Length(max=45)
	private String VariationTypeName;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Categories categories;
	

//	// MAPPING FOR PRODUCT
//	@OneToMany(cascade = CascadeType.ALL,mappedBy = "variationType")
//	//@JoinColumn(name = "VariationTypeId", referencedColumnName = "VariationTypeId")
//	private List<Product> product;

	// MAPPING FOR variation
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "VariationTypeId", referencedColumnName = "VariationTypeId")
	private List<Variation> variation;


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


	public Categories getCategories() {
		return categories;
	}


	public void setCategories(Categories categories) {
		this.categories = categories;
	}


	public List<Variation> getVariation() {
		return variation;
	}


	public void setVariation(List<Variation> variation) {
		this.variation = variation;
	}
	
	
	
	

}
