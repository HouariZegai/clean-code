# Tennis Kata
The tennis kata app is a Maven project. The kata solution implemented with **TDD** using **Java** & **Spring** and I also build a REST API using Spring for the solution.

## Running the app
### Prerequisites
To be able to run the app you must have the following tools on your computer:
- Maven
- Docker

1. Build and generate jar:
```shell
mvn clean package
```
2. Generate the docker image:
```shell
docker build -t tennis-kata:latest .
```
3. Run the app as container service:
```shell
docker-compose up -d
```

### Quick start
All the above steps can be done by executing the following command:
```shell
./bootstrap.sh
```

### API Testing
You can test the api using the following:
#### Swagger
Open the browser and go to [Open API](http://localhost:8080/swagger-ui.html) (api documentation) 

#### Postman
1. From postman go to `File > Import` (or press `Ctrl+o`)
2. Drag and drop the [open-api-docs.json](docs/api/open-api-docs.json) file located in `docs/api/`