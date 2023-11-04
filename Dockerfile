FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /e_commerceApiGateway/target/e_commerceApiGateway-0.0.1-SNAPSHOT.jar apiGateway.jar

EXPOSE 8089
ENTRYPOINT ["java","-jar","apiGateway.jar"]