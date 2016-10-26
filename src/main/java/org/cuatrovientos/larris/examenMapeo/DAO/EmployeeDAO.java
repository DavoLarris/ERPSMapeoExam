package org.cuatrovientos.larris.examenMapeo.DAO;

import java.util.List;

import org.cuatrovientos.larris.examenMapeo.HibernateSession;
import org.cuatrovientos.larris.examenMapeo.DAOInterface.InterfaceEmployeeDAO;
import org.cuatrovientos.larris.examenMapeo.models.Employee;
import org.hibernate.*;

public class EmployeeDAO implements InterfaceEmployeeDAO{

	public List<Employee> selectAll() {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		List<Employee> employees = session.createCriteria(Employee.class).list();
		
		session.close();
		return employees;
	}

	public void insert(Employee employee) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	
	    session.persist(employee);
	         
	    session.getTransaction().commit();
	    session.close();
	}

}
