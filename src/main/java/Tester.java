
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Tester {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        System.out.println("1");
        SessionFactory sessionFactory = Configuration.buildSessionFactory();
        Session session = SessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Employee employee = new Employee();
        employee.setId(10);
        employee.setName("Hibernate");
        session.save(employee);
        transaction.commit();
        session.close();
        System.out.println("2");
        
        
    }
}
