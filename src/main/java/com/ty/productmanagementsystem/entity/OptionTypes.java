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
public class OptionTypes implements Serializable {
	@Id
	//@Column(name = "option_types_id")
//	@NotNull
	private Integer optionTypesId;
//	@Column(name = "option_types_name")
	@Length(max=45)
	private String optionTypesName;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Categories categories;
	
//	// MAPPING FOR PRODUCT
//		@OneToMany(cascade = CascadeType.ALL,mappedBy = "optionTypes")
//	//	@JoinColumn(name = "optionTypesId", referencedColumnName = "optionTypesId")
//		private List<Product> product;
		
		// MAPPING FOR optiontype
		@OneToMany(cascade = CascadeType.ALL)
	//	@JoinColumn(name = "optionTypesId", referencedColumnName = "optionTypesId")
		private List<Options> option;
private Categories categories2;

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

		public Categories getCategories() {
			return categories;
		}

		/*
		 * public void setCategories(Categories categories) { this.categories =
		 * categories; }
		 */

		public List<Options> getOption() {
			return option;
		}

		public void setOption(List<Options> option) {
			this.option = option;
		}

		public void setCategories(Categories categories2) {
			this.categories2=categories2;
			
		}
	
	

}
