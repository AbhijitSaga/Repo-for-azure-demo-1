FROM --platform=linux/x86-64  openjdk:17
#From openjdk:8-jre-alpine
#EXPOSE 8083
ADD target/demoProject-0.0.1-SNAPSHOT.jar demoProject-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","demoProject-0.0.1-SNAPSHOT.jar"]

