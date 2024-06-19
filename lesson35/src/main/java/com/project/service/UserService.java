package com.project.service;

import com.project.domen.Role;
import com.project.domen.UserEntity;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService implements InitializingBean {

    public final SessionFactory sessionFactory;

    @Override
    public void afterPropertiesSet() throws Exception {
        UserEntity user = new UserEntity();
        user.setId(UUID.randomUUID());
        user.setUsername("test1");
        user.setSalary(3000);
        user.setRole(Role.USER);

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
    }
}




