package com.bridgelabz.employee.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import com.bridgelabz.employee.dto.EmployeeDTO;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity
@Table(name = "employee_tbl")
public class EmployeeEntity 
{
	@Id
	@GeneratedValue()
	private int id;
	@Pattern(regexp = "^[A-Z]{1}[a-z]{2,}$",message = "Employee name is not valid:")
	private String employeeName;
	@Pattern(regexp = "^[A-Z]{1}[a-z]{3,5}$",message = "Employee gender is not valid:")
	private String employeeGender;
	@Pattern(regexp = "^[A-Za-z]{1,}$",message = "Employee Department is not valid:")
	private String employeeDepartment;
	@Min(value = 10000,message = "Employee Salary should be more than 10000")
	private double employeeSalary;
//	JsonFormat(pattern = "dd-mm-yyyy")
	private LocalDate employeeStartDate;
	private String employeeNotes;
	private String profilePic;

	public EmployeeEntity(EmployeeDTO dto) {
		super();
		this.employeeName = dto.getEmployeeName();
		this.employeeGender = dto.getEmployeeGender();
		this.employeeDepartment = dto.getEmployeeDepartment();
		this.employeeSalary = dto.getEmployeeSalary();
		this.employeeStartDate = dto.getEmployeeStartDate();
		this.employeeNotes = dto.getEmployeeNotes();
		this.profilePic = dto.getProfilePic();
	}	
		
}
