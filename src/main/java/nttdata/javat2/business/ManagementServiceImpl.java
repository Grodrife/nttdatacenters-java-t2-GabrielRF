package nttdata.javat2.business;

import java.util.HashMap;
import java.util.Map;

public class ManagementServiceImpl implements ManagementServiceI {

	private Map<Integer, Employee> employeesMap = new HashMap<Integer, Employee>();

	/**
	 * Método para anyadir nuevos empleados al sistema.
	 */
	@Override
	public void addNewEmployee(String name, Category category) {
		int numEmployees = employeesMap.size();
		if (numEmployees < Employee.getMaxEmployees()) {
			Employee newEmployee = new Employee(numEmployees + 1, name, category, numEmployees);
			this.employeesMap.put(numEmployees + 1, newEmployee);
		} else {
			System.out.println("No se ha podido añadir el empleado por superar el límite");
		}

	}

	/**
	 * Método para mostrar todos los empleados existentes en el sistema.
	 */
	@Override
	public void printAllEmployees() {
		for (Employee e : this.employeesMap.values()) {
			System.out.println(e.toString());
		}

	}

	/**
	 * Método para mostrar el número total de empleados dados de alta en el sistema.
	 */
	@Override
	public void printEmployeesTotalNum() {
		System.out.println("El número total de empleados es: " + this.employeesMap.size());
	}

}
