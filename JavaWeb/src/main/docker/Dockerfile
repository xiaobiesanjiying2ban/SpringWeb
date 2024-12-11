FROM openjdk:8-jdk-alpine
ENV JAVA_OPTS="-Xmx512m -Xms256m"
COPY target/javaweb-0.0.1-SNAPSHOT.jar /app/javaweb.jar
CMD ["sh", "-c", "java $JAVA_OPTS -jar /app/javaweb.jar"]
EXPOSE 8000