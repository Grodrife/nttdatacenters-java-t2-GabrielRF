package nttdata.javat2;

import nttdata.javat2.business.Category;
import nttdata.javat2.business.ManagementServiceI;
import nttdata.javat2.business.ManagementServiceImpl;

/**
 * Taller práctico 2 Java
 *
 */
public class T2MainGabrielRF {
	public static void main(String[] args) {
		
		final ManagementServiceI register = new ManagementServiceImpl();
		
		register.addNewEmployee("Paco", Category.ANL_SENIOR);
		register.addNewEmployee("Pepe", Category.DEV_SENIOR);
		register.printAllEmployees();
		register.printEmployeesTotalNum();
		register.addNewEmployee("Luis", Category.ANL_JUNIOR);
		register.printAllEmployees();
		register.printEmployeesTotalNum();
		register.addNewEmployee("Julio", Category.DEV_SENIOR);
		register.printAllEmployees();
		register.printEmployeesTotalNum();
		register.addNewEmployee("Javier", Category.DEV_SENIOR);
		register.printAllEmployees();
		register.printEmployeesTotalNum();
	}
}
