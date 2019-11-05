FROM openjdk:8-jdk-alpine
ADD  target/newapp-0.0.1-SNAPSHOT.jar   newapp-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["sh","-c","java -jar /newapp-0.0.1-SNAPSHOT.jar"]
   