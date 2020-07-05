```bash
java -Dsleep.interval.sec=20 -XX:+UseG1GC -Xmx2g -Xms32m -Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.port=1089 -Dcom.sun.management.jmxremote.ssl=false -Dcom.sun.management.jmxremote.authenticate=false \
-Djava.rmi.server.hostname=0.0.0.0 -Dcom.sun.management.jmxremote -jar target/spring-memory-test-0.0.1-SNAPSHOT.jar
```

- Medium growth
`-Dsleep.interval.sec=20 -XX:+UseG1GC -Xmx2g -Xms32m`