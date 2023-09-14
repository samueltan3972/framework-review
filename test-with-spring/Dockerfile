FROM adoptopenjdk/openjdk11:jre-11.0.13_8-alpine
ARG JAR_FILE=target/test-with-spring-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]