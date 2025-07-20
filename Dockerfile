FROM eclipse-temurin:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy contents of the inner 'portfolio/' folder into the image's /app
COPY portfolio/. .

# Make mvnw executable
RUN chmod +x mvnw

# Build the Spring Boot app
RUN ./mvnw clean install -DskipTests

# Run the application
CMD ["java", "-jar", "target/portfolio-0.0.1-SNAPSHOT.jar"]

