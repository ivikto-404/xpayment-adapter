FROM openjdk:21-jdk-slim
LABEL authors="ivikto"

WORKDIR /app
COPY xpayment-adapter-1.0-SNAPSHOT.jar xpayment-adapter.jar
EXPOSE 8080
EXPOSE 8443
EXPOSE 5005

ENTRYPOINT ["java", "-jar", "xpayment-adapter.jar"]