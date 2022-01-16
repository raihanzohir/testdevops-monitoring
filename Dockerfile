FROM openjdk:11
EXPOSE 8081
ADD target/testdevops-monitoring.jar testdevops-monitoring.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]