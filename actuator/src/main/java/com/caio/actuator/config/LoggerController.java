package com.caio.actuator.config;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.Random;

@Component
@RestController
public class LoggerController {

    private Random random = new Random();

    Logger logger = LoggerFactory.getLogger(LoggerController.class.getName());

    @GetMapping
    public ResponseEntity<String> result(){
        logger.trace("TRACE message");
        logger.debug("DEBUG message");
        logger.info("INFO message");
        logger.warn("WARN message");
        logger.error("ERROR message");
        return ResponseEntity.of(Optional.of("ok"));
    }

    @GetMapping("random")
    public String index() {
        if (random.nextInt() % 4 < 1)
            throw new IllegalStateException("Fail the request");

        return "OK";
    }


}
