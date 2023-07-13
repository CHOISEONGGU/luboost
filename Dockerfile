# base image
FROM adoptopenjdk:11-jdk

# create workdirectory
WORKDIR /app

# copy directory
ADD app.jar /app/app.jar

# Entrypoint
ENTRYPOINT ["java", "-jar", "/app/app/jar"]