FROM alpine/java:22-jdk
LABEL authors="Nayan Gohil"

EXPOSE 8080
ARG JAR_FILE=target/spring-boot-docker-k8s-0.0.1.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]