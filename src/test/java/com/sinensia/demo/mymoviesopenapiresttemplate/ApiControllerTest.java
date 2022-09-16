package com.sinensia.demo.mymoviesopenapiresttemplate;

import org.junit.jupiter.api.Test;
import org.openapitools.client.model.GETMovieMovieId200Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

@EnableAutoConfiguration
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ApiControllerTest {

    @Autowired
    TestRestTemplate testRestTemplate;

    @Test
    void getMovie() {
        ResponseEntity<GETMovieMovieId200Response> response = testRestTemplate.getForEntity("/api/movie/550", GETMovieMovieId200Response.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("Fight Club", Objects.requireNonNull(response.getBody()).getTitle());
    }
}
