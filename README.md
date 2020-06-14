# spring-mysql-elastic
Dockerized Spring POC implementing the synchronization and the data querying between MySql and ElasticSearch engine.

## Requirements
Make sure to have the followings installed:

* To run locally
  - ElasticSearch engine (the version depends on the spring-jpa dependency used within the project see: [Compatibility Matrix](https://docs.spring.io/spring-data/elasticsearch/docs/3.2.0.RC3/reference/html/#preface.versions))

* To run with Docker
  - Docker (Ubuntu 18.04 [Installation guide](https://docs.docker.com/engine/install/ubuntu/))
  - Docker-compose (Ubuntu 18.04 [Installation guide](https://docs.docker.com/compose/install/))

## Build and run
* Locally
  - Create a database in MySql `elasticsearch`
  - Run `mvn clean package spring-boot:run` to build the artifact and run the application
  - Run `./elasticsearch` script inside the bin directory of the elastic search package

* Docker
  - Run `docker-compose up --build -d` to run the docker services

## Documentation (Swagger)
Visitit `http://localhost:8080/swagger-ui.html` to visualize the exposed API endpoints. 
