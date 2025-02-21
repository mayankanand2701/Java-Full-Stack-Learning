package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main
{
    public static void main(String[] args)
    {
        // Student s1=new Student();
        // s1.setsName("Ragbhav");
        // s1.setsAge(24);
        // s1.setRollNo(3);

        // Create
        // We are trying to do it using XML , we can also do this using annotations
        // Step 1 : Create a xml file under resources and put the xml configuration there manually
        // Configuration cfg=new Configuration();
        // cfg.addAnnotatedClass(org.example.Student.class);
        // cfg.configure();

        // We need the configuration so we are writing the above three lines so we can optimize that in 1 line
        // SessionFactory sf= cfg.buildSessionFactory();
        // SessionFactory sf=new Configuration().addAnnotatedClass(org.example.Student.class).configure().buildSessionFactory();
        // Session session=sf.openSession();

        // Not needed for fetching the data from database only needed while inserting the data
        // Transaction transaction=session.beginTransaction();

        // save is deprecated after version 6 of hibernate , now the keyword persist is used
        // session.save(s1);
        // session.persist(s1);

        // Not needed for inserting the data
        // transaction.commit();

        // Code to fetch the data form database (Read)
        // Since we are fetching the data we do not need transaction code
        // Student s2=session.get(Student.class,2);
        // System.out.println(s2);

        // Code to update the data in the database (Update)
        // Step 1 : Create the object which you want to update
        // Transaction is needed here as we are making the changes
        // Student s3=new Student();
        // s3.setsName("Kajal");
        // s3.setRollNo(2);
        // s3.setsAge(23);  // Updating the age of the person that is already existing in the database
        // Transaction transaction=session.beginTransaction();
        // if the data exist it will update it else will create the new data
        // session.merge(s3);
        // transaction.commit();


        // Delete
        // Student s4=session.get(Student.class,3);
        // Transaction transaction=session.beginTransaction();
        // session.remove(s4);
        // transaction.commit();


        // To store data of new class and which consist of another class Laptop
        //SessionFactory sf=new Configuration().addAnnotatedClass(org.example.Alien.class).configure().buildSessionFactory();
        //Session session=sf.openSession();

        //Laptop l1=new Laptop();
        //l1.setBrand("Hp");
        //l1.setModel("New");
        //l1.setRam(8);

        //Alien a1=new Alien();
        //a1.setAid(1);
        //a1.setAname("Rakes");
        //a1.setTech("Robotics");
        //a1.setLaptop(l1);

        //Transaction transaction=session.beginTransaction();
        //session.persist(a1);
        //transaction.commit();

        //Alien a2=session.get(Alien.class,1);
        //System.out.println(a2);

        // Code to implement ont to one mapping
        SessionFactory sf=new Configuration()
                .addAnnotatedClass(org.example.Alien.class)
                .addAnnotatedClass(org.example.Laptop.class)
                .configure().buildSessionFactory();
        Session session=sf.openSession();

        Laptop l1=new Laptop();
        l1.setId(101);
        l1.setBrand("Hp");
        l1.setModel("New");
        l1.setRam(8);

        Alien a1=new Alien();
        a1.setAid(1);
        a1.setAname("Rakesh");
        a1.setTech("Robotics");
        a1.setLaptop(l1);

        Transaction transaction=session.beginTransaction();
        session.persist(l1);
        session.persist(a1);
        transaction.commit();

        Alien a2=session.get(Alien.class,1);
        System.out.println(a2);

        session.close();
        sf.close();

        // System.out.println(s1);
    }
}