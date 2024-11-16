FROM ubuntu:latest
LABEL authors="JOSE - Halloween Challenge"

FROM eclipse-temurin:17-alpine
VOLUME /tmp
COPY /target/*.jar app.jar
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app.jar"]