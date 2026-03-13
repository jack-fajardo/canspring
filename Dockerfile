FROM eclipse-temurin:17-jdk

# Set work directory
WORKDIR /app

# Copy pom.xml and maven wrapper
COPY pom.xml .
COPY mvnw ./
COPY .mvn .mvn/

# Fix permissions (essential for linux environment)
RUN chmod +x mvnw

# Download dependencies (Docker cache layer)
RUN ./mvnw dependency:go-offline

# Copy source
COPY src ./src

# Expose port
EXPOSE 8080

# Run Spring Boot
ENTRYPOINT ["./mvnw", "spring-boot:run"]
