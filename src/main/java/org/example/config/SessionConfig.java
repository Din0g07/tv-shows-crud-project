package org.example.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionConfig {
    public final static SessionFactory sessionFactory = new Configuration()
            .addAnnotatedClass(org.example.model.ShowCharacter.class)
            .addAnnotatedClass(org.example.model.Series.class)
            .buildSessionFactory();
}
