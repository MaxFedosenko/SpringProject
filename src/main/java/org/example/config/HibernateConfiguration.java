package org.example.config;

import org.example.entities.Book;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfiguration {

    public static SessionFactory sessionFactory;
    private HibernateConfiguration(){

    }
    
    public static void prepareHibernate() {
        Configuration configuration = new Configuration();
        configuration.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
        configuration.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/postgres");
        configuration.setProperty("hibernate.connection.username", "postgres");
        configuration.setProperty("hibernate.connection.password", "1840625");
        configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQL95Dialect");

        configuration.setProperty("hibernate.show_sql", "true");
        configuration.setProperty("hibernate.hbm2ddl.auto", "create");
        configuration.setProperty("hibernate.format_sql", "true");
        configuration.addAnnotatedClass(Book.class);

        sessionFactory = configuration.buildSessionFactory();
    }
}