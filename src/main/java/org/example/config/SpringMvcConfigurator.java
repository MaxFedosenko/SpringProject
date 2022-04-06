package org.example.config;

import org.example.entities.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import static org.example.config.HibernateConfiguration.*;

public class SpringMvcConfigurator implements WebApplicationInitializer {
    
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.scan("org.example.config");
        ServletRegistration.Dynamic dispatcher =
                servletContext.addServlet("dispatcher", new DispatcherServlet(context));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
        
        prepareHibernate();
    
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
    
        Book book1 = new Book("Stalker1", "Levitskiy");
        Book book2 = new Book("Stalker2", "Zhakov");
        Book book3 = new Book("HarryPotter1", "Rowling");
        Book book4 = new Book("DeadSouls", "Gogol");
        Book book5 = new Book("FightClub", "Palanik");
        Book book6 = new Book("GenerationP", "Pelevin");
        Book book7 = new Book("HarryPotter2", "Rowling");
        Book book8 = new Book("Stalker3", "Boble");
        Book book9 = new Book("HarryPotter4", "Rowling");
        Book book10 = new Book("HarryPotter5", "Rowling");
        session.save(book1);
        session.save(book2);
        session.save(book3);
        session.save(book4);
        session.save(book5);
        session.save(book6);
        session.save(book7);
        session.save(book8);
        session.save(book9);
        session.save(book10);
    
        transaction.commit();
        session.close();
    }
}
