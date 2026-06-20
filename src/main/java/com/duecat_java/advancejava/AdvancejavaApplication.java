package com.duecat_java.advancejava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.duecat_java.advancejava.entity.Employee;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.query.Query;
import com.duecat_java.advancejava.entity.Emp_address;

@SpringBootApplication
public class AdvancejavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdvancejavaApplication.class, args);
		Emp_address address = new Emp_address(0, "123 Main St", "Cityville", "State", "12345", "Country");
		Employee employee = new Employee("John Smith", 40, "Male", "IT", 500.0, address);
		System.out.println("Employee Details:");
		System.out.println("ID: " + employee.getId());
		System.out.println("Name: " + employee.getName());
		System.out.println("Age: " + employee.getAge());
		System.out.println("Gender: " + employee.getGender());
		System.out.println("Department: " + employee.getDepartment());
		System.out.println("Salary: " + employee.getSalary());
		System.out.println("Address: " + employee.getAddress());

		// generate configration for connection with database
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.persist(employee);
		session.getTransaction().commit();

		Query<Employee> namedQuery = session.createNamedQuery("Employee.byName", Employee.class);
		namedQuery.setParameter("name", "John Smith");
		Employee foundEmployee = namedQuery.uniqueResult();
		System.out.println("Found by named query: " + foundEmployee);

		session.close();
	}


}
