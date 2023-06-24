package com.example.OneToOneMappingExample;


import com.example.OneToOneMappingExample.model.Student;
import com.example.OneToOneMappingExample.model.University;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class OneToOneMappingExampleApplication {

	public static void main(String[] args) {

		StandardServiceRegistry ssrrr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata metadata=new MetadataSources(ssrrr).getMetadataBuilder().build();

		SessionFactory factory = metadata.getSessionFactoryBuilder().build();
		Session session=factory.openSession();

		Transaction txs = session.beginTransaction();

		University university=new University();


		university.setName("AJAY");
		university.setCountry("INDIA");
		university.setState("MAHARASHTRA");
		university.setCity("XYZ");

		Student student = new Student();
		student.setName("AJAY");
		student.setCollageName("PGMCEO");
		student.setPrnNo("23435");

		university.setStudent(student);
		student.setUniversity(university);

		session.persist(university);
		txs.commit();

		session.close();
		System.out.println("All ok!! Successfully Done");


	}
}
