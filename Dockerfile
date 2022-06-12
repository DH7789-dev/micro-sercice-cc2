FROM openjdk:17-alpine as build
WORKDIR /app
RUN mvn clean install

EXPOSE 8080

ENV REDIS_HOST=localhost\
    REDIS_PORT=6379

CMD ["java", "-jar","-Dspring.profiles.active=env", "/app/paiment-api.jar"]