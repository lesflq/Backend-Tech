FROM openjdk:22-jdk-slim-bullseye
WORKDIR /app
COPY /out/artifacts/FirstDocker_jar/FirstDocker.jar /app/phrases.jar
ENTRYPOINT ["java", "-jar", "phrases.jar"]