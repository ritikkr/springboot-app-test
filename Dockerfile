FROM openjdk
WORKDIR /usr/src/myapp
COPY /build/libs/DockerTest-0.0.1-SNAPSHOT.jar /usr/src/myapp

CMD ["java", "-jar", "DockerTest-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080