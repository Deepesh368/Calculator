FROM openjdk:11
COPY ./target/MyCalculator-1.0-SNAPSHOT-shaded.jar ./
WORKDIR ./
CMD ["java","-jar","MyCalculator-1.0-SNAPSHOT-shaded.jar"]