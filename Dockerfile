# Use a base image with Java 17
FROM openjdk:17-jdk-slim

# Create a directory for the application
WORKDIR /app

# Copy the build artifact into the container
COPY build/libs/kafka-producer-blueprint-0.0.1-SNAPSHOT.jar app.jar

# Expose the port the application will run on
EXPOSE 8080

# Set the entry point to run the jar
ENTRYPOINT ["java", "-jar", "app.jar"]
