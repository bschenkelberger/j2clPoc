# j2clPoc

Das Projekt zeigt wie man mithilfe des j2clmavenplug's

```
<groupId>com.vertispan.j2cl</groupId>
<artifactId>j2cl-maven-plugin</artifactId>
```

aus Java Klassen, Javascript Code generiert.

### Projekt installieren

```
mvn clean package

mvn j2cl: build/watch
```

- watch, hat den Vorteil das änderungen am Code direkt transpiliert werden

### Projekt starten

```
mvn jetty:run
```

Das Projekt kann dann über http://localhost:8080 im Browser aufgerufen werden