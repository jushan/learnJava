package com.duecat_java.advancejava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.duecat_java.advancejava.entity.Employee;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;

@SpringBootApplication
public class AdvancejavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdvancejavaApplication.class, args);
		Employee employee = new Employee("John Doe", 30, "Male", "IT", 50000.0);
		System.out.println("Employee Details:");
		System.out.println("ID: " + employee.getId());
		System.out.println("Name: " + employee.getName());
		System.out.println("Age: " + employee.getAge());
		System.out.println("Gender: " + employee.getGender());
		System.out.println("Department: " + employee.getDepartment());
		System.out.println("Salary: " + employee.getSalary());	


		// generate configration for connection with database
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.persist(employee);
		session.getTransaction().commit();
		session.close();
	}


}
