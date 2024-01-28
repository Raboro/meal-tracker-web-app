package io.github.raboro.mealtrackerwebapp.rest.config;

import io.github.raboro.mealtrackerwebapp.rest.resource.MealResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(MealResource.class);
    }
}
