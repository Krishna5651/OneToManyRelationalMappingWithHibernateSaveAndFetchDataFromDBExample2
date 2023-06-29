/**
 * Created By Krishna Shinde
 * Date : 28-06-2023
 * Time : 17:24
 * Project: OneToManyHibernateSaveAndFetchData
 **/

package com.mahagan.test;

import com.mahagan.domain.Answers;
import com.mahagan.domain.Question;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.Iterator;
import java.util.List;

public class OneToManySaveDataInDBFetchDataFromDB {
    public static void main(String[] args) {


        StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();
        Transaction trns = session.beginTransaction();

        TypedQuery query = session.createQuery("from Question question");
        List<Question> list = query.getResultList();
        Iterator<Question> itr = list.listIterator();


        while (itr.hasNext()) {
            Question question = itr.next();

            System.out.println(" Name of the Questions will be ---->>>>>>>" + question.getQuestionName());

            // for printing the answers here

            List<Answers> list1 = question.getAnswers();
            Iterator<Answers> iteratorNew = list1.iterator();
            while (iteratorNew.hasNext()) {

                Answers answers = iteratorNew.next();

                System.out.println(answers.getAnsName() + "" + answers.getPostedBy() + "" + answers.getCreatedBy());

            }
        }
        session.close();
        System.out.println("********Data Has been successfully fetched from DB *************");
    }
}
