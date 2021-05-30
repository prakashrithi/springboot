FROM openjdk:11
MAINTAINER "Prakash"
COPY target/springboot*.jar .
CMD java -jar ./springboot*.jar
EXPOSE 8080
