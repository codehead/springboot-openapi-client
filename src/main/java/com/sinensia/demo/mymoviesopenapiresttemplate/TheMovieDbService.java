package com.sinensia.demo.mymoviesopenapiresttemplate;

import org.openapitools.client.ApiClient;
import org.openapitools.client.api.DefaultApi;
import org.openapitools.client.auth.ApiKeyAuth;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TheMovieDbService {

    private DefaultApi apiInstance;

    /*
     * Use constructor-based dependency injection instead of @Autowired
     * to guarantee proper bean creation order and get these values
     * populated correctly from application.properties .
     */
    public TheMovieDbService(
            // you may specify a default value inside @Value or in the built-in application.properties file
            @Value("${themoviedb.base_url:'https://api.themoviedb.org/3'}") String base_url,
            @Value("${themoviedb.api_key}") String my_api_key
    ) {
        ApiClient defaultClient = new ApiClient();
        defaultClient.setBasePath(base_url);
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey(my_api_key);
        this.apiInstance = new DefaultApi(defaultClient);
    }

    public DefaultApi getApiInstance() {
        return apiInstance;
    }

}
