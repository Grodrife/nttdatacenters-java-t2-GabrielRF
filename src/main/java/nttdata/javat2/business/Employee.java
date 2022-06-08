package nttdata.javat2.business;

import java.util.Objects;

public class Employee {

	private int idEmployee;
	private String name;
	private Category category;
	private static final String COMPANY_NAME = "NTT Data";
	private static final int MAX_EMPLOYEES = 3;

	public Employee(int idEmployee, String name, Category category, int num_employees) {

		this.setIdEmployee(num_employees + 1);
		this.setName(name);
		this.setCategory(category);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public int getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}

	public static int getMaxEmployees() {
		return MAX_EMPLOYEES;
	}

	public static String getCompanyName() {
		return COMPANY_NAME;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idEmployee);
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
		return idEmployee == other.idEmployee;
	}

	@Override
	public String toString() {
		return "Employee [id_employee=" + idEmployee + ", name=" + name + ", category=" + category + "]";
	}

}
