# Analysis Activity  Description Metamodel

A Ecore-based metamodl to represent analysis activities in bioinformatics.

## Build

The last working build was made using SDKman to set OpenJDK 11:

```sh
sdk use java 11.0.11-open
./mvnw compile package
```

The build of the project follows the [Eclipse Tycho Tutorial](http://www.vogella.com/tutorials/EclipseTycho/article.html) in [www.vogella.com](www.vogella.com). **For some reason, the building process does not work in Java 9**. So, please verify if Maven is being executed in Java 8 and, if it is not, use `JAVA_HOME=<Java 8 JRE>; export JAVA_HOME`.
