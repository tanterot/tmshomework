package com.project.service;

import com.project.domen.OrderEntity;
import com.project.domen.PersonEntity;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class DataBaseService {
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

    public List<OrderEntity> getAllOrders() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<OrderEntity> result = session
                .createQuery("from OrderEntity ", OrderEntity.class)
                .list();

        transaction.commit();
        session.close();
        return result;
    }


    public void deletePerson(UUID id) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            List<PersonEntity> result = session
                    .createQuery("from PersonEntity where id = :id", PersonEntity.class)
                    .setParameter("id", id)
                    .list();
            if (!result.isEmpty()) {
                PersonEntity personEntity = result.get(0);
                session.remove(personEntity);
            }
            transaction.commit();
        }
    }


    public void deleteOrder(UUID id) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();


            List<OrderEntity> result = session
                    .createQuery("from OrderEntity where id = :id", OrderEntity.class)
                    .setParameter("id", id)
                    .list();
            if (!result.isEmpty()) {
                var orderEntity = result.get(0);
                session.remove(orderEntity);
            }
            transaction.commit();
        }

    }

    public void savePerson(PersonEntity person) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(person);
            transaction.commit();
        }
    }

    public void saveOrder(OrderEntity order) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(order);
            transaction.commit();

        }
    }

    public PersonEntity getPerson(UUID id) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            PersonEntity personEntity = session.get(PersonEntity.class, id);
            transaction.commit();
            return personEntity;
        }
    }

    public OrderEntity getOrder(UUID id) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            OrderEntity orderEntity = session.get(OrderEntity.class, id);
            transaction.commit();
            return orderEntity;
        }
    }

    public UUID getIdByUsername(String username) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            PersonEntity personEntity = session.get(PersonEntity.class, username);
            transaction.commit();
            return personEntity.getId();
        }
    }

    public UUID getIdByDescription(String description) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            OrderEntity orderEntity = session.get(OrderEntity.class, description);
            transaction.commit();
            return orderEntity.getId();
        }
    }
}