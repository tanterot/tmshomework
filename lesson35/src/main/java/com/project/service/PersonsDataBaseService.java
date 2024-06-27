package com.project.service;

import com.project.domen.PersonEntity;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonsDataBaseService {
    private final SessionFactory sessionFactory;

    public List<PersonEntity> getAllPersons() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<PersonEntity> result = session
                .createQuery("from PersonEntity", PersonEntity.class)
                .list();

        transaction.commit();
        session.close();
        return result;
    }


    public void deletePerson(String name) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            List<PersonEntity> result = session
                    .createQuery("from PersonEntity where username = :name", PersonEntity.class)
                    .setParameter("name", name)
                    .list();

            if (!result.isEmpty()) {
                PersonEntity personEntity = result.get(0);
                session.remove(personEntity);
            }

            transaction.commit();
        }
    }




    public void update(String name) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            List<PersonEntity> result = session
                    .createQuery("from PersonEntity where username = :name", PersonEntity.class)
                    .setParameter("name", name)
                    .list();

            if (!result.isEmpty()) {
                PersonEntity personEntity = result.get(0);
                personEntity.setUsername(name);
                session.update(personEntity);
            }

            transaction.commit();
        }
    }

}
