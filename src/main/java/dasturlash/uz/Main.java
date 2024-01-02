package dasturlash.uz;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {
    public static void main(String[] args) {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

        SessionFactory factory = meta.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();

        PersonEntity person = new PersonEntity();
        person.setName("Alish");
        person.setSurname("Aliyev");
        session.save(person);

        CarEntity car1 = new CarEntity();
        car1.setModel("Lacetti");
        car1.setColor("White");
        car1.setPerson(person);
        session.save(car1);

        CarEntity car2 = new CarEntity();
        car2.setModel("Tico");
        car2.setColor("Black");
        car2.setPerson(person);
        session.save(car2);

        CarEntity car3 = new CarEntity();
        car3.setModel("Damas");
        car3.setColor("Red");
        car3.setPerson(person);
        session.save(car3);

        t.commit();

        factory.close();
        session.close();
    }
}