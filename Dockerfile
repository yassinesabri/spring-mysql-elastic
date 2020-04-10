FROM openjdk:8-jre-alpine

RUN apk add --no-cache bash

COPY target/spring-mysql-elastic-0.0.1-*.jar /opt/spring-mysql-elastic.jar
EXPOSE 8080
CMD ["java", "-jar", "/opt/spring-mysql-elastic.jar"]

