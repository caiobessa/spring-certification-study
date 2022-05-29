package com.caio.actuator.config;


import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "feature")
public class FeatureEndpoint {

    @ReadOperation
    public String featureName(){
        return "Feature name endpoint";
    }
}
