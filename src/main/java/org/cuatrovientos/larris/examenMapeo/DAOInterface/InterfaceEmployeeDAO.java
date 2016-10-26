package org.cuatrovientos.larris.examenMapeo.DAOInterface;

import java.util.List;

import org.cuatrovientos.larris.examenMapeo.models.Employee;


public interface InterfaceEmployeeDAO {
	
	public List<Employee> selectAll ();
	public void insert (Employee employee);
}
