# Use base image
FROM openjdk:8-jdk-alpine

# Set workdir
WORKDIR /opt

# Copy the artifact
COPY target/*.jar /opt/spring.jar

# Execute artifact
ENTRYPOINT exec java -jar /opt/spring.jar
