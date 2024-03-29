//package com.ty.productmanagementsystem.entity;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//
//import org.springframework.format.annotation.NumberFormat;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//public class EmployeeEntity {
//	@Id
//	private int empId;
//	@Column(length = 45)
//	private String empName;
//	@Column(length = 45)
//	private String empEmail;
//	@Column(length = 10)
//	@NumberFormat
//	private long empPhone;
//	@Column(length = 15)
//	private String empPassword;
//	@Column(length = 12)
//	private String empRoles;
//	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "departmentId")
//	private Departments departmentsEntity;
//}