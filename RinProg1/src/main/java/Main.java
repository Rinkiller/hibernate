import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {
    public static void main(String[] args) {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        SessionFactory sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Person pers = new Person("Rin", 40);
        Person pers1 = new Person("Rin1", 41);
        Person pers2 = new Person("Rin2", 354);
        Person pers3 = new Person("Rin3", 345);
        Person pers4 = new Person("Rin4", 45);
        Person pers5 = new Person("Rin5", 34);
        session.beginTransaction();
        session.save(pers);
        session.save(pers2);
        session.save(pers1);
        session.save(pers3);
        session.save(pers4);
        session.save(pers5);
        session.getTransaction().commit();
        session.close();

    }
}
