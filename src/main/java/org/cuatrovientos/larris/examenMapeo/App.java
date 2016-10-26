package org.cuatrovientos.larris.examenMapeo;

import java.util.List;

import org.cuatrovientos.larris.examenMapeo.DAO.EmployeeDAO;
import org.cuatrovientos.larris.examenMapeo.DAOInterface.InterfaceEmployeeDAO;
import org.cuatrovientos.larris.examenMapeo.models.Employee;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Employee employee1 = new Employee("Pepe", "mail1", 1000f);
    	Employee employee2 = new Employee("Manu", "mail2", 2000f);
    	
    	
    	InterfaceEmployeeDAO employeeDAO = new EmployeeDAO();
    	
    	employeeDAO.insert(employee1);
    	employeeDAO.insert(employee2);
    	
    	List<Employee> employees = employeeDAO.selectAll();
		System.out.println("--- Employees ----- table contents	-----------");
		for (Employee employee : employees) {
			System.out.println(employee.toString() + "/n");
			
		}
		
		System.out.println("Total aircrafts: " + employees.size());
    }
}
