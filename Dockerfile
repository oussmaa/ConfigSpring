FROM openjdk:21-jdk
# Set the working directory in the container
WORKDIR /app

# Copy the jar file into the container at /app
COPY target/ServiceConfguration-0.0.1-SNAPSHOT.jar /app/ServiceConfguration-0.0.1-SNAPSHOT.jar

# Make port 8080 available to the world outside this container
EXPOSE 9091

# Run the jar file
ENTRYPOINT ["java", "-jar", "ServiceConfguration-0.0.1-SNAPSHOT.jar"]
