FROM eclipse-temurin:21
WORKDIR /app
COPY . .
RUN ./mvnw clean package -DskipTests  \
    && mv target/*.jar ./app.jar  \
    && rm -rf target
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]