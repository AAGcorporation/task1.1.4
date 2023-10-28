package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public final class Util {
    //Create Connetion to database
    private static SessionFactory sessionFactory;

    public Util() {
    }
    public static SessionFactory getConnection() {
         SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(User.class)
                .buildSessionFactory();
        return sessionFactory;

    }
}
