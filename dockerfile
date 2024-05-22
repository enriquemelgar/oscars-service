FROM gradle:8.7.0-jdk21 as build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src

RUN gradle build --no-daemon

FROM eclipse-temurin:21.0.2_13-jdk
RUN mkdir /app
COPY --from=build /home/gradle/src/build/libs/*.jar /app/app.jar
ENTRYPOINT [ "java", "-jar", "/app/app.jar" ]