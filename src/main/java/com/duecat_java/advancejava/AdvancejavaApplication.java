package com.duecat_java.advancejava;

import org.hibernate.Session;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.duecat_java.advancejava.configuration.ConfigurationDetails;
import com.duecat_java.advancejava.entity.EmployeeDetails;
import org.hibernate.Transaction;

// import com.duecat_java.advancejava.configuration.HibernateConfig;
// import com.duecat_java.advancejava.entity.Employee;

// import org.hibernate.Session;
// import org.hibernate.Transaction;
// import org.hibernate.query.MutationQuery;

@SpringBootApplication
public class AdvancejavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdvancejavaApplication.class, args);
		// Employee employee = new Employee("smith", 34, "Male", "Technology", 500000.0);
		// System.out.println("Employee Details:");
		// System.out.println("ID: " + employee.getId());
		// System.out.println("Name: " + employee.getName());
		// System.out.println("Age: " + employee.getAge());
		// System.out.println("Gender: " + employee.getGender());
		// System.out.println("Department: " + employee.getDepartment());
		// System.out.println("Salary: " + employee.getSalary());	


		// generate configration for connection with database
		// Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		// SessionFactory sessionFactory = cfg.buildSessionFactory();
		// Session session = sessionFactory.openSession();
		// session.beginTransaction();
		// session.persist(employee);
		// session.getTransaction().commit();
		// session.close();

		// Session session = HibernateConfig.getSessionFactory().openSession();
		// Transaction tx = session.beginTransaction();
		// get single rolw data to load
		// session.load(Employee.class, 1);

		// session.persist(employee);
		// tx.commit();
		// session.close();

		//org.hibernate.query.Query<Employee> query = session.createQuery("from Employee", Employee.class);
	
	// get the list of data from database
		//List<Employee> employees = query.list();
		// need to use for loop to print the data
		// for(Employee employee1 : employees){
		// 	System.out.println(employee1);
		// }
	
		// query.setFetchSize(3);
		// query.setMaxResults(6);
		// query.getResultList().forEach(System.out::println);


		// update records
		// MutationQuery query = session.createMutationQuery(" update Employee set name = :name where id = :id");
		// query.setParameter("name", "Jushan Ali");
		// query.setParameter("id", 4);
		// // query.setParameter("id", Integer.parseInt(args[1]));
		// int result = query.executeUpdate();
		// System.out.println("Number of rows updated: " + result);

		// MutationQuery query = session.createMutationQuery("delete from Employee where id = :id");
		// query.setParameter("id", 4);
		// int result = query.executeUpdate();
		// System.out.println("Number of rows deleted: " + result);

		// tx.commit();
		// session.close();


		EmployeeDetails employeeDetails = new EmployeeDetails("Smith", "smith@example.com", "Male", 30, "Single", "123 Main St", "555-1234");

		Session session = new ConfigurationDetails().getSessionFactory().openSession();
		session.beginTransaction();
		session.persist(employeeDetails);
		Transaction transaction = session.getTransaction();
		transaction.commit();
		session.close();
	}


}
