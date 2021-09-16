FROM openjdk:11
ARG JAR_FILE=target/customer-portal-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} customer-portal.jar
ENTRYPOINT ["java","-jar","/customer-portal.jar"]
EXPOSE 8081