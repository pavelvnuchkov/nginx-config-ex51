FROM openjdk:17

EXPOSE 8080

COPY target/Example_51_1-0.0.1-SNAPSHOT.jar project.jar

CMD ["java", "-jar", "project.jar"]

