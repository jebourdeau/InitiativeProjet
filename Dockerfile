FROM openjdk:11-jre-slim
COPY target/mon-application.jar mon-application.jar
ENTRYPOINT ["java", "-jar", "mon-application.jar"]
