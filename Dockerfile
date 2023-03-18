FROM openjdk:11
COPY ./target/MyCalculator-1.0-SNAPSHOT-shaded.jar ./
WORKDIR ./
ENTRYPOINT ["java","-jar","MyCalculator-1.0-SNAPSHOT-shaded.jar"]