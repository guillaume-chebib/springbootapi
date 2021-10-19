FROM adoptopenjdk/openjdk11:alpine-jre

COPY . .

RUN ./gradlew build

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","./build/libs/springbootapi-0.0.1-SNAPSHOT.jar"]