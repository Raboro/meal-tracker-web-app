FROM khipu/openjdk17-alpine

RUN apk add maven

WORKDIR /app

COPY pom.xml .
COPY src/ ./src/
RUN mvn clean package

CMD ["java", "-jar", "target/meal-tracker-web-app-backend-0.0.1-SNAPSHOT.jar"]
