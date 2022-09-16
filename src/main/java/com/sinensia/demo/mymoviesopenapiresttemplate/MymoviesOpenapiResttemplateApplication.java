package com.sinensia.demo.mymoviesopenapiresttemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MymoviesOpenapiResttemplateApplication {

    @Autowired
    TheMovieDbService theMovieDbService;

    public static void main(String[] args) {
        SpringApplication.run(MymoviesOpenapiResttemplateApplication.class, args);
    }

}
