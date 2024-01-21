## About This Project

Spark-Starter-Basic - A basic starter project for Spark Java (v2.9.4)

This starter web application, written in Java using the Spark (https://sparkjava.com/) framework provides a simple project template to get started quickly with a new Spark project.

This project illustrates the following:

- Basic Domain objects 

- Sample service and controller classes

- Dynamic error and exception handling for web views and JSON responses

- Log4J logging configuration

- Maven configuration to support Snyk (https://snyk.io/) for security vulnerability scanning

- Simple support for Swagger API documentations using annotations and JAX RS
  - Avoids more complex 3rd party libraries and projects
  - Builds on examples from 2016, but still leverage lambda expressions for routes


### Configuration - Environment Variables

This app supports loading a single environment variable 'environment' (values = 'development', 'test', 'production')

If no environment variable is set, the default is 'production'


## Development Environment

### Running the app

When running from the command line and maven, ```mvn clean install``` will create a jar file in the target directory.

To start the app, run:

```
export environment=development
java -jar target/spark-starter-basic-1.0.0.jar
```


## Swagger

Swagger endpoints are available locally at http://localhost:3000/swagger-ui/


## Author

This app was created by Eric Blue - [https://eric-blue.com](https://eric-blue.com/)
