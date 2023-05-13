FROM amazoncorretto:17

MAINTAINER eduzerd

COPY target/eduweb-1.0-SNAPSHOT.jar eduweb-1.0-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/eduweb-1.0-SNAPSHOT.jar"]