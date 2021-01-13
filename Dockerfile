FROM openjdk:11.0-slim
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 80 2222
ENTRYPOINT ["java","-jar","/app.jar"]