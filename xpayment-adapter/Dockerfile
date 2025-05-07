FROM openjdk:21-jdk-slim
LABEL authors="ivikto"

WORKDIR /app
COPY target/xpayment-adapter-0.0.1-SNAPSHOT.jar xpayment-adapter.jar
EXPOSE 8080
EXPOSE 8443
EXPOSE 5005


HEALTHCHECK --interval=20s --timeout=5s --start-period=60s --retries=3 \
  CMD curl -f http://localhost:8080/actuator/health || exit 1

ENTRYPOINT ["java", "-jar", "xpayment-adapter.jar"]