This is a demo Rest API project created while learning spring boot framework in JAVA.
It has following endpoints - 
1. POST   /departments        - to create new department
2. GET    /departments        - to fetch list of all the departments
3. GET    /departments/{id}   - to fetch department by given id
4. GET    /departments/{name} - to fetch department with given name (case ignored)
5. PUT    /departments/{id}   - to update the existing department record.
6. DELETE /departments/{id}   - to delete existing department.

I have used H2 database, which is in-memory database so no seperate database installation is required.

To run the application, go to project directory and run command ```./mvnw spring-boot:run```
