#Start with a base image containing Java runtime
FROM openjdk:17-jdk-slim AS build

#Information around who maintains the image
MAINTAINER Simplice Chedjou.com

# Add the application's jar to the container
COPY target/client-0.0.1.jar  client-0.0.1.jar

#execute the application
ENTRYPOINT ["java","-jar","/client-0.0.1.jar"]
