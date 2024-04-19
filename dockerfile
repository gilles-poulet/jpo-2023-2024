FROM tomcat:10.1.20-jre17
ADD ./target/jpo.war /usr/local/tomcat/webapps/
EXPOSE 8080