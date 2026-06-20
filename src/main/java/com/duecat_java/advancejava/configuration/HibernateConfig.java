// package com.duecat_java.advancejava.configuration;
// import org.hibernate.SessionFactory;
// import org.hibernate.boot.Metadata;
// import org.hibernate.boot.registry.StandardServiceRegistry;
// import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
// import org.hibernate.boot.MetadataSources;
// import org.hibernate.cfg.Environment;
// import java.util.Properties;

// public class HibernateConfig {
//     public static SessionFactory getSessionFactory() {


//             Properties settings = new Properties();
//             settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
//             settings.put(Environment.JAKARTA_JDBC_URL, "jdbc:mysql://localhost:3306/employee_db");
//             settings.put(Environment.JAKARTA_JDBC_USER, "root");
//             settings.put(Environment.JAKARTA_JDBC_PASSWORD, "root");
//             settings.put(Environment.SHOW_SQL, "true");
//             settings.put(Environment.FORMAT_SQL, "true");


//         // Implement logic to create and return a SessionFactory
//         // This typically involves reading the hibernate.cfg.xml configuration file
//         // and building the SessionFactory using the Configuration class.

//         // StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//         // Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
        
//         StandardServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(settings).build();
//         // Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
//         Metadata metadata = new MetadataSources(registry    ).addAnnotatedClass(com.duecat_java.advancejava.entity.Employee.class).getMetadataBuilder().build();

//         return metadata.buildSessionFactory();
//     }

// }
