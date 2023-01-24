package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        System.out.println("start project.................................");

        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory= cfg.buildSessionFactory();
        Person ps=new Person();
        ps.setId(12);
        ps.setAge(24);
        ps.setName("Tom");
        ps.setCity("Noida");
        System.out.println(ps);
        Session session=factory.openSession();
        Transaction tx= session.beginTransaction();
        session.save(ps);
        tx.commit();
        session.close();


    }
}