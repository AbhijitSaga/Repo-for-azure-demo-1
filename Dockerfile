FROM --platform=linux/x86-64  openjdk:17
#From openjdk:8-jre-alpine
EXPOSE 8080
ADD target/spring-boot-docker-demo.jar  spring-boot-docker-demo.jar
ENTRYPOINT ["java","-jar","/spring-boot-docker-demo.jar"]
