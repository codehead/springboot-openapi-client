# Sample application for OpenAPI-generator client

This sample Spring Boot application demonstrates a RestTemplate-based OpenAPI-generator client 
performing a single request from a CommandLineRunner.   

## How to build and execute

1. Download and install [OpenAPI Generator](https://github.com/OpenAPITools/openapi-generator).

2. Generate API client from our [tweaked The movieDB OpenAPI spec](themoviedb.json).

    ```shell
    java -jar openapi-generator-cli.jar generate \
      -i themoviedb.json \
      -g java \
      --skip-validate-spec \
      -o themoviedb-resttemplate \
      --additional-properties library=resttemplate,artifactId=the-movie-db
    cd themoviedb-resttemplate
    ./gradlew publishToMavenLocal
    ```

3. Create application.properties and provide your own TheMovieDB API key.

    ```properties
    themoviedb.api_key=YOUR_API_KEY
    ```

4. Build and execute local application.

    ```shell
    ./gradlew bootRun
    ```

5. Invoke the /api/movie/{movieid} endpoint.

    ```shell
    curl http://localhost:8080/api/movie/550
    ```

[![License: CC BY-NC-SA 4.0](https://img.shields.io/badge/License-CC%20BY--NC--SA%204.0-lightgrey.svg)](https://creativecommons.org/licenses/by-nc-sa/4.0/) [Javier Arturo Rodríguez](https://github.com/codehead/)
