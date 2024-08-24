# Use the official OpenJDK image as a parent image
FROM openjdk:11-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the host to the container
COPY src/main/resources/application.properties /app/config/application.properties


# Expose the port that your application will run on
EXPOSE 9090

# Run the JAR file
CMD ["java", "-jar", "myapp.jar"]
