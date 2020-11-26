FROM openjdk:jre-alpine
COPY build/libs/docker-k8s-demo-0.0.1-SNAPSHOT.jar /app/dockerK8sDemo.jar
EXPOSE 8080
WORKDIR /app/
ENTRYPOINT ["java"]
CMD ["-jar", "-Djava.net.preferIPv4Stack=true", "-Xmx400m", "/app/dockerK8sDemo.jar"]
