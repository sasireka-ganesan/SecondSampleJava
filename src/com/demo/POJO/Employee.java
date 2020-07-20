package com.demo.POJO;

public class Employee {
private int employeeId;
private String employeeName;
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + employeeId;
	result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (employeeId != other.employeeId)
		return false;
	if (employeeName == null) {
		if (other.employeeName != null)
			return false;
	} else if (!employeeName.equals(other.employeeName))
		return false;
	return true;
}

}
