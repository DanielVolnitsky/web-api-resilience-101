# TODO make dockerfile build the app instead of relying on existing artifact at the build time

# Set the base image to use for this Docker image
FROM openjdk:17-jdk-buster

# Set the working directory inside the Docker container
WORKDIR /app

# Copy the Spring Boot application JAR file to the Docker container
COPY build/libs/simple-web-app-0.0.1-SNAPSHOT.jar /app

# Expose the port that the Spring Boot application listens on
EXPOSE 8080

# Set the command to run when the Docker container starts
CMD ["java", "-jar", "simple-web-app-0.0.1-SNAPSHOT.jar"]
