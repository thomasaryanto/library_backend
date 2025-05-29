FROM openjdk:22-jdk-slim
WORKDIR /srin_backend
COPY target/srin_backend-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]