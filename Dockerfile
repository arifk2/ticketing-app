FROM openjdk:8

ADD target/ticketing-app.jar ticketing-app.jar

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "/ticketing-app.jar" ]