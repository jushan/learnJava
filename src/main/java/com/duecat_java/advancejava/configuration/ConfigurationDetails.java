package com.duecat_java.advancejava.configuration;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.cfg.Environment;
import java.util.Properties;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.MetadataSources;

public class ConfigurationDetails {
    public SessionFactory getSessionFactory() {
        // implement the logic for DB connection and return session factory.
        Properties settings = new Properties();
        settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
        settings.put(Environment.JAKARTA_JDBC_URL, "jdbc:mysql://localhost:3306/employee_db");
        settings.put(Environment.JAKARTA_JDBC_USER, "root");
        settings.put(Environment.JAKARTA_JDBC_PASSWORD, "root");
        settings.put(Environment.SHOW_SQL, "true");
        settings.put(Environment.FORMAT_SQL, "true");

        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(settings).build();
        Metadata metadata = new MetadataSources(registry).addAnnotatedClass(com.duecat_java.advancejava.entity.EmployeeDetails.class).getMetadataBuilder().build();
        // implement the logic for DB connection and return session factory.
       return metadata.buildSessionFactory();
    }

}
