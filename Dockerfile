
FROM openjdk:17-oracle
EXPOSE 8080
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} jenkins-project.jar
ENTRYPOINT ["java","-jar","/jenkins-project.jar"]


