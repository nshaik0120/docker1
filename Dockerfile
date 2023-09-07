FROM openjdk:11
LABEL maintainer="spring boot docker"
ADD target/springbootdocker-0.0.1.jar springbootdocker-0.0.1.jar
ENTRYPOINT ["java","-jar","/springbootdocker-0.0.1.jar"]