FROM java:8-jdk-alpine
LABEL maintainer="Manish"
RUN apk update && apk add bash
VOLUME /tmp
EXPOSE 8888
ARG JAR_FILE=build/libs/conductor-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} address.jar
ENTRYPOINT [ "java","-jar","/address.jar" ]
