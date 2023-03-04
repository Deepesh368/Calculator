FROM openjdk:11
ADD ./target/MyCalculator-1.0-SNAPSHOT.jar ./
ENTRYPOINT ["java","-jar","MyCalculator-1.0-SNAPSHOT.jar"]