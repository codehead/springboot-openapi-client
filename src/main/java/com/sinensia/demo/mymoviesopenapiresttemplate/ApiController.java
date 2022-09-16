package com.sinensia.demo.mymoviesopenapiresttemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    TheMovieDbService theMovieDbService;

    @RequestMapping("/movie/{movieid}")
    Object getMovie(@PathVariable String movieid) {
        return theMovieDbService.getApiInstance().gETMovieMovieId(550);
    }
}
