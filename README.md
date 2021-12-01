# online-shop
Online shop microservice arthictecture using spring boot.

Stack used:

1. Spring Boot Web
2. MySQL
3. MongoDB
4. Spring Data JPA
5. Spring Cloud Stream
6. ELK (Elastic Search, Logstash, Kibana) (Used for distributed Logging purpose across all microservices)
7. Keycloak (For user authentication for rest api)
8. Zipkin (Distributed Tracing)
9. Vault (For securing DB username and password and other sensitive properties or information)
10. Central Configuration Server (Used git)
11. Spring Cloud Bus (boardcast refresh for configuration server)
12. Rabbitmq (Used for event driven microserice communication)
13. Open Feign (Used for Repository style microservice restapi communication)
14. Lombok (Used for boilarplate code)
