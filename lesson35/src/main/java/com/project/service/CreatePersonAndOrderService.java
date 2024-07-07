package com.project.service;

import com.project.domen.OrderEntity;
import com.project.domen.Role;
import com.project.domen.PersonEntity;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreatePersonAndOrderService implements InitializingBean {

    public final SessionFactory sessionFactory;

    @Override
    public void afterPropertiesSet() throws Exception {
        PersonEntity person1 = new PersonEntity();
        person1.setUsername("test1");
        person1.setSalary(2300);
        person1.setRole(Role.USER);
        person1.setAge(10);

        PersonEntity person2 = new PersonEntity();
        person2.setUsername("test2");
        person2.setSalary(2500);
        person2.setRole(Role.USER);
        person2.setAge(20);

        PersonEntity person3 = new PersonEntity();
        person3.setUsername("test3");
        person3.setSalary(2100);
        person3.setRole(Role.ADMIN);
        person3.setAge(30);

        PersonEntity person4 = new PersonEntity();
        person4.setUsername("test4");
        person4.setSalary(5000);
        person4.setRole(Role.ADMIN);
        person4.setAge(40);

        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setPerson(person1);

        OrderEntity orderEntity1 = new OrderEntity();
        orderEntity1.setPerson(person2);
        orderEntity1.setPerson(person4);

        OrderEntity orderEntity2 = new OrderEntity();
        orderEntity2.setPerson(person3);

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(person1);
        session.save(person2);
        session.save(person3);
        session.save(person4);
        session.save(orderEntity);
        session.save(orderEntity1);
        session.save(orderEntity2);


        session.getTransaction().commit();
        session.close();
    }
}




