FROM adoptopenjdk:11-jdk-hotspot as build

WORKDIR /app

COPY pom.xml .
COPY mvnw .
COPY .mvn .mvn

RUN ./mvnw dependency:go-offline -B

COPY src ./src

RUN ./mvnw  package -DskipTests

FROM adoptopenjdk:11-jre-hotspot

WORKDIR /app

COPY --from=build /app/target/mavendemo-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
