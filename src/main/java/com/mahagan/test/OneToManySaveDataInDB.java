package com.mahagan.test;

import com.mahagan.domain.Answers;
import com.mahagan.domain.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.ArrayList;
import java.util.List;

public class OneToManySaveDataInDB {
    public static void main(String[] args) {
        StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();
        Transaction trns = session.beginTransaction();


        Answers answers = new Answers();
        answers.setAnsName("We are learning Hibernate with JPA");
        answers.setCreatedBy("Mahagan");
        answers.setPostedBy("Mahagan-Soft");

        Answers answers2 = new Answers();
        answers2.setAnsName("We are learning Spring-Boot");
        answers2.setCreatedBy("Mahagan");
        answers2.setPostedBy("Baliram Bhande");

        Answers answers3 = new Answers();
        answers3.setAnsName("We are learning REST API");
        answers3.setCreatedBy("Mahagan");
        answers3.setPostedBy("Krishna Shinde");


        List<Answers> list1 = new ArrayList<Answers>();
        list1.add(answers);
        list1.add(answers2);
        list1.add(answers3);

        List<Answers> list2 = new ArrayList<Answers>();
        list2.add(answers);
        list2.add(answers2);
        list2.add(answers3);


        Question question1 = new Question();
        question1.setQuestionName("What is java???????");
        question1.setAnswers(list2);

        Question question2 = new Question();
        question2.setQuestionName("What is java???????");
        question2.setAnswers(list2);

        session.persist(question1);
        session.persist(question2);

        trns.commit();
        session.close();

        System.out.println("********Data Has been successfully Inserted in DB *************");
    }
}