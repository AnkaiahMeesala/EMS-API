FROM openjdk:8
EXPOSE 8080
ADD target/ems-app.war ems-app.war
ENTRYPOINT ["java", "-war", "/ems-app.war"]