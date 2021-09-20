package com.bridgelabz.employee.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO 
{
	
	public String employeeName;
	public String employeeGender;
	public String employeeDepartment;
	public double employeeSalary;
	public LocalDate employeeStartDate;
	public String employeeNotes;
	public String profilePic;

	
}
