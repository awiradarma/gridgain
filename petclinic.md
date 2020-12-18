## Exploring Apache Ignite / Gridgain IMDG as a write-through cache

### Use spring petclinic with a mysql backend
. Start mysql database
. Start petclinic using mysql profile
```
java -Dspring.profiles.active=mysql -jar target/spring-petclinic-2.4.0.BUILD-SNAPSHOT.jar
```
. Make sure the tables are created

### Use Gridgain web console to create a mapping of the petclinic database schema 
```
mkdir /tmp/gridgain
mkdir /tmp/gridgain/work
chmod 777 /tmp/gridgain
chmod 777 /tmp/gridgain/work
docker run -d -it --name console_backend  -v /tmp/gridgain/work:/opt/gridgain-web-console-server/work gridgain/gridgain-web-console-backend
docker run -d --name=console_frontend -p 9080:8008/tcp --link console_backend:backend gridgain/gridgain-web-console-frontend
./web-console-agent.sh 
```

### Start the Ignite cluster and load the cache
```
java -cp ./target/ImportedCluster-project-8.7.9.jar:./target/libs/* startup.ServerNodeSpringStartup
java -cp ./target/ImportedCluster-project-8.7.9.jar:./target/libs/* load.LoadCaches
```

### Make changes to the mysql profile and rerun petclinic with mysql profile
```
java -Dspring.profiles.active=mysql -jar target/spring-petclinic-2.4.0.BUILD-SNAPSHOT.jar
```
