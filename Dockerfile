# Use official OpenJDK 17 base image
FROM eclipse-temurin:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy everything
COPY . .

# Build the project
RUN ./mvnw clean install -DskipTests

# Run the JAR
CMD ["java", "-jar", "target/portfolio-0.0.1-SNAPSHOT.jar"]
