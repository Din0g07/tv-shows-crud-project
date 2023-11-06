package org.example.service;

import org.example.config.SessionConfig;
import org.example.model.ShowCharacter;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;
import java.util.UUID;

public class CharacterService {
    public String getSeriesByCharacterName(String name) {
        try(Session session = SessionConfig.sessionFactory.openSession()) {
            String hql = "select s.name from Series s join ShowCharacter ch on ch.seriesId = s.id " +
                    "where ch.name = :name";
            Query<String> query = session.createQuery(hql, String.class);
            query.setParameter("name", name);
            return query.uniqueResult();

        }
    }
    public ShowCharacter getCharacterByName(String name) {
        try(Session session = SessionConfig.sessionFactory.openSession()) {
            String hql = "from ShowCharacter character where character.name = :name";
            Query<ShowCharacter> query = session.createQuery(hql,ShowCharacter.class);
            query.setParameter("name", "Fry");
            return query.uniqueResult();
        }
    }
    public List<String> getAllShowCharacters() {
        try(Session session = SessionConfig.sessionFactory.openSession()) {
            String hql = "select distinct character.name from ShowCharacter character where character.age > 100";
            Query<String> query = session.createQuery(hql, String.class);
            return query.list();
        }
    }
    public ShowCharacter getCharacterById(UUID id) {
        try(Session session = SessionConfig.sessionFactory.openSession()) {
            return session.get(ShowCharacter.class, id);
        }
    }

    public void createCharacter() {
        try(Session session = SessionConfig.sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            ShowCharacter showCharacter = ShowCharacter.builder()
                    .id(UUID.randomUUID())
                    .name("Fry")
                    .age(1025)
                    .gender("male")
                    .race("human")
                    .info("Главный герой сериала \"Футурама\". " +
                            "Тупой. Любит Лилу. Лучший друг - Бендер.")
                    .seriesId(UUID.randomUUID())
                    .build();
            session.persist(showCharacter);
            transaction.commit();
        }
    }
}
