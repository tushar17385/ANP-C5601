/* Q1: What is SessionFactory in Hibernate? Explain with an example.

**SessionFactory** in Hibernate is a factory class that creates and manages Hibernate **Session** objects. It's a heavyweight object and should be created only once during application startup. The SessionFactory is responsible for initializing Hibernate settings, mapping files, and caching the data you want to fetch from the database. It's a thread-safe and immutable class.

Here's an example of how to configure and use a SessionFactory in Hibernate:
*/
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionFactory;

    static {
        try {
            // Create a Configuration object and configure it
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");

            // Build a SessionFactory using the Configuration
            sessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        // Close caches and connection pools
        getSessionFactory().close();
    }
}

// Usage of SessionFactory in your application
public class MyApp {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        
        // Perform database operations using the session
        
        session.close();
        HibernateUtil.shutdown();
    }
}

/*  
In this example:
- We create a `SessionFactory` using a configuration file (hibernate.cfg.xml), which contains database connection details and Hibernate settings.
- The `getSessionFactory()` method provides access to the `SessionFactory` instance.
- We open and close a `Session` to perform database operations.

Q2: Give a comparison of the following methods in Hibernate:

a) `save()` vs `persist()` vs `saveOrUpdate()`:
   - `save()`: It is used to persist an entity and returns the generated identifier immediately. If an identifier exists, it throws an exception.
   - `persist()`: It is used to persist an entity and does not guarantee an immediate return of the identifier. It may not throw an exception if the identifier exists.
   - `saveOrUpdate()`: It is used to save or update an entity. If the entity has no identifier or if it's detached, it will be saved; otherwise, it will be updated.

b) `update()` vs `merge()`:
   - `update()`: It is used to update a detached object. If the object doesn't exist, it throws an exception.
   - `merge()`: It is used to merge the state of a detached object into the current session. It doesn't throw an exception if the object doesn't exist.

c) `load()` vs `get()`:
   - `load()`: It loads an entity lazily (only when needed) and returns a proxy. If the entity doesn't exist, it throws an exception.
   - `get()`: It loads an entity immediately and returns the actual entity object. If the entity doesn't exist, it returns null.

Q3: What is HQL? Show a CRUD operation using HQL.

**HQL** (Hibernate Query Language) is an object-oriented query language used to query data from a database using Hibernate. It's similar to SQL but operates on Java objects and their properties. Here's an example of CRUD operations using HQL:
*/

// Insert operation using HQL
String hqlInsert = "INSERT INTO Employee (firstName, lastName, salary) " +
                   "SELECT firstName, lastName, salary FROM BackupEmployee";
Query queryInsert = session.createQuery(hqlInsert);
int rowsInserted = queryInsert.executeUpdate();

// Update operation using HQL
String hqlUpdate = "UPDATE Employee SET salary = :newSalary WHERE id = :employeeId";
Query queryUpdate = session.createQuery(hqlUpdate);
queryUpdate.setParameter("newSalary", 50000.0);
queryUpdate.setParameter("employeeId", 1);
int rowsUpdated = queryUpdate.executeUpdate();

// Delete operation using HQL
String hqlDelete = "DELETE FROM Employee WHERE id = :employeeId";
Query queryDelete = session.createQuery(hqlDelete);
queryDelete.setParameter("employeeId", 2);
int rowsDeleted = queryDelete.executeUpdate();

// Select operation using HQL
String hqlSelect = "FROM Employee WHERE department = :department";
Query querySelect = session.createQuery(hqlSelect);
querySelect.setParameter("department", "IT");
List<Employee> employees = querySelect.list();

/*  
In this example:
- We use HQL to perform CRUD operations on the "Employee" entity.
- The `createQuery()` method is used to create a query object, and `setParameter()` is used to set parameters.
- `executeUpdate()` is used for insert, update, and delete operations, while `list()` is used for select operations.

Q4: What is Criteria, Projection, Restriction in Hibernate? Explain with an example.

**Criteria** in Hibernate is an object-oriented alternative to HQL for querying the database. It allows you to create and execute queries using Java code, making it more flexible and type-safe. **Projection** and **Restriction** are key components of Criteria.

- **Projection**: Projections in Hibernate allow you to specify what data you want to retrieve from the database. For example, you can project specific columns of a table or apply
*/
Criteria criteria = session.createCriteria(Employee.class)
    .setProjection(Projections.property("firstName"))
    .add(Restrictions.gt("salary", 50000.0));
List<String> employeeNames = criteria.list();

/*In this example, we project the "firstName" column and apply a salary condition.

Restriction: Restrictions are used to specify conditions in a Criteria query. You can create conditions like equals, greater than, less than, etc.
*/
Criteria criteria = session.createCriteria(Employee.class)
    .add(Restrictions.eq("department", "IT"))
    .add(Restrictions.gt("salary", 50000.0));
List<Employee> employees = criteria.list();


/*Here, we add restrictions to filter employees in the IT department with a salary greater than 50,000.

Criteria, Projection, and Restrictions provide a flexible way to query data from the database in Hibernate.*/