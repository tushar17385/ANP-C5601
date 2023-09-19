In Hibernate, inheritance mapping is used to represent the relationships
between classes in an object-oriented hierarchy and their corresponding tables in a relational database. 
Hibernate provides several strategies to implement inheritance mapping. 
Let's explore each of them along with examples using both annotation-based and XML-based mapping.

1. **Table Per Hierarchy:**
   This strategy involves mapping all subclasses to a single table. A discriminator column is used to differentiate between different subclass entities. It's the simplest strategy but can lead to performance issues when the hierarchy grows.

   **Annotation-based:**
   
   ```java
   @Entity
   @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
   @DiscriminatorColumn(name = "vehicle_type", discriminatorType = DiscriminatorType.STRING)
   public class Vehicle {
       // common attributes and methods
   }
   
   @Entity
   @DiscriminatorValue("car")
   public class Car extends Vehicle {
       // car-specific attributes and methods
   }
   
   @Entity
   @DiscriminatorValue("bike")
   public class Bike extends Vehicle {
       // bike-specific attributes and methods
   }
   ```
   
   **XML-based:**
   
   ```xml
   <!-- Vehicle class -->
   <class name="Vehicle" table="vehicles">
       <discriminator column="vehicle_type" type="string"/>
       <!-- common properties -->
   </class>
   
   <!-- Car subclass -->
   <subclass name="Car" discriminator-value="car">
       <!-- car-specific properties -->
   </subclass>
   
   <!-- Bike subclass -->
   <subclass name="Bike" discriminator-value="bike">
       <!-- bike-specific properties -->
   </subclass>
   ```

2. **Table Per Concrete class:**
   In this strategy, each concrete class in the hierarchy is mapped to its own table. No inheritance-related columns are used. It can improve performance but leads to redundant columns in the database.

   **Annotation-based:**
   
   ```java
   @Entity
   @Table(name = "vehicles")
   public class Vehicle {
       // common attributes and methods
   }
   
   @Entity
   @Table(name = "cars")
   public class Car extends Vehicle {
       // car-specific attributes and methods
   }
   
   @Entity
   @Table(name = "bikes")
   public class Bike extends Vehicle {
       // bike-specific attributes and methods
   }
   ```
   
   **XML-based:**
   
   ```xml
   <!-- Vehicle class -->
   <class name="Vehicle" table="vehicles">
       <!-- common properties -->
   </class>
   
   <!-- Car subclass -->
   <subclass name="Car" table="cars">
       <!-- car-specific properties -->
   </subclass>
   
   <!-- Bike subclass -->
   <subclass name="Bike" table="bikes">
       <!-- bike-specific properties -->
   </subclass>
   ```

3. **Table Per Subclass:**
   Each subclass in the hierarchy is mapped to its own table. A foreign key relationship is used to link the subclass table with the parent class table.

   **Annotation-based:**
   
   ```java
   @Entity
   @Inheritance(strategy = InheritanceType.JOINED)
   public class Vehicle {
       @Id @GeneratedValue
       private Long id;
       // common attributes and methods
   }
   
   @Entity
   public class Car extends Vehicle {
       // car-specific attributes and methods
   }
   
   @Entity
   public class Bike extends Vehicle {
       // bike-specific attributes and methods
   }
   ```
   
   **XML-based:**
   
   ```xml
   <!-- Vehicle class -->
   <class name="Vehicle">
       <id name="id">
           <generator class="native"/>
       </id>
       <!-- common properties -->
   </class>
   
   <!-- Car subclass -->
   <subclass name="Car">
       <!-- car-specific properties -->
   </subclass>
   
   <!-- Bike subclass -->
   <subclass name="Bike">
       <!-- bike-specific properties -->
   </subclass>
   ```

These examples demonstrate different inheritance mapping strategies in Hibernate using both annotation-based and XML-based configurations. The choice of strategy depends on the specific requirements of your application and the trade-offs between simplicity and performance.