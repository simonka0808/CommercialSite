# CommercialSite

# Introduction
This is a full-stack site build with Java and Spring Framework. This is a commercial website. A user is able to make a registration and login, visit the online shop and purchase items. The shop is populated with items like bags, t-shirts, trousers, coats and shoes for the moment. I am planning to add more in the future. The project is not finished yet because i am still learning new technologies.

I'm building this site on Eclipse IDE with Java, Maven, and Spring Framework. I use the MySQL database and implemented Version control for the database with Flyway migrations. For connection with the database, I use JDBC, and managing the data basically with Spring Data JPA, but I also use ORM technologies like Hibernate.


# Used technologies
Java 11, Spring Boot, Spring Core, Spring Data, Spring MVC, Spring Web Hibernate, JPA, Flyway

JDBC, MySQL, Maven, JSP, Taglibs, HTML, CSS, XML, Tomcat 9.0.43, Bootstrap, Lombok

# Very near future
1. Testing
After i finish the backend i will test everying I have built so far.

2. Frontend
I have restful controllers exposing the information on the frontend part.

3. Security
I should protect my application, so I will decide between Spring Security and Apache Shiro.
Security: Apache Shiro

# Architecture
MVC, N-tier

# Setup Application
1. Clone the repository to your machine: https://github.com/simonka0808/CommercialSite

2. Import application like Maven project

3. Open the /src/main/resources/application.properties and configure the JDBC driver which will connect the application to your MySQL database. You should change the value attributes of those two xml tags.

        spring.datasource.username=user
        spring.datasource.password=pass

4. Make Maven force update

5. Import Tomcat server in Eclipse. For the the development is used standalone Tomcat server with 9.0.43 version.

6. Add the project to the server

7. Run the application from the server

# Access the application

Backend server's port: 8080

Access the deployed web application at: http://localhost:8080/commercialSite

**to access the online shop visit http://localhost:8080/commercialSite/onlineshopping
apply same logic for the rest of the webpages