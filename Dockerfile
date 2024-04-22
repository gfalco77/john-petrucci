FROM amazoncorretto:21 AS BUILDER
COPY gradle gradle/
COPY gradlew settings.gradle build.gradle ./
COPY . .
RUN --mount=type=cache,target=/root/.gradle ./gradlew --no-daemon -i  clean build

FROM amazoncorretto:21
COPY --from=BUILDER build/libs/*.jar app.jar
EXPOSE 8181
ENTRYPOINT ["java", "-jar", "app.jar"]
