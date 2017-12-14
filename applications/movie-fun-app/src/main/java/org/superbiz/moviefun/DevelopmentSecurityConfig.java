package org.superbiz.moviefun;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

@Profile("development")
public class DevelopmentSecurityConfig {
    @Bean
    public RestOperations restOperations() {
        return new RestTemplate();
    }

}
