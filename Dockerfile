FROM openjdk:11
COPY out/production/JavaCore1/ /tmp
WORKDIR /tmp
CMD java ru/gb/in/Main
